package org.academiadecodigo.bootcamp.MapEditor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public static FileWriter writer = null;
    public static BufferedReader reader = null;
    public static List<String> list;

    public static void save(String file) {

        try {

            writer = new FileWriter("resources/file.txt");
            writer.write(file);
            writer.flush();
            writer.close();
            System.out.println("Map saved.");

        } catch (IOException e) {

            System.out.println("Exception.");

        }
    }

    public static List<String> load() {

        try {
            list = new ArrayList<>();
            reader = new BufferedReader(new FileReader("resources/file.txt"));
            String line;

            while ((line = reader.readLine()) != null) {

                list.add(line);

            }
            System.out.println("Map loaded.");
            return list;

        } catch (IOException e) {

            System.out.println("Exception.");

        }
        return null;
    }
}

