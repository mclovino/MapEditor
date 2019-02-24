package org.academiadecodigo.bootcamp.MapEditor;

import java.util.List;

public class MapEditor {

    private Grid grid;
    private ActiveCell cursor;

    public MapEditor() {

        this.grid = new Grid(10, 10);
        this.grid.start();
        this.cursor = new ActiveCell();

    }

    public void move(Direction direction) {

        if (onEdge(direction)) {
            return;
        }

        switch (direction) {

            case UP:
                cursor.moveUp();
                break;
            case DOWN:
                cursor.moveDown();
                break;
            case LEFT:
                cursor.moveLeft();
                break;
            case RIGHT:
                cursor.moveRight();
                break;
        }
    }

    public void printCells() {

        grid.getCellsToString();

    }

    public void paint() {

        grid.getCell(cursor.getColumn(), cursor.getRow()).paint();

    }

    public boolean onEdge(Direction direction) {

        return (cursor.getRow() == 0 && direction == Direction.UP) ||
                (cursor.getRow() == grid.getRows() - 1 && direction == Direction.DOWN) ||
                (cursor.getColumn() == 0 && direction == Direction.LEFT) ||
                (cursor.getColumn() == grid.getColumns() - 1 && direction == Direction.RIGHT);
    }

    public void save() {

        String file = grid.getCellsToString();
        FileManager.save(file);

    }

    public void load() {

        List<String> info = FileManager.load();
        String[] holder;

        for(int column = 0; column < grid.getColumns(); column++) {

            for (int row = 0; row < grid.getRows(); row++) {

                if (info != null) {

                    holder = info.get(column).split("");

                    if (holder[row].equals("1")) {

                        grid.getCell(column, row).fill();

                    } else {

                        grid.getCell(column, row).draw();

                    }
                }
            }
        }
    }
}
