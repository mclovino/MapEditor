package org.academiadecodigo.bootcamp.MapEditor;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class ActiveCell extends Cell {

    public ActiveCell() {

        super(0, 0);
        getCell().setColor(Color.RED);
        getCell().fill();

    }

    public void moveUp() {

        getCell().translate(0, -(getCellSize()));
        setRow(getRow() - 1);

    }

    public void moveDown() {

        getCell().translate(0, getCellSize());
        setRow(getRow() + 1);

    }

    public void moveLeft() {

        getCell().translate(-getCellSize(), 0);
        setColumn(getColumn() - 1);

    }

    public void moveRight() {
        getCell().translate(getCellSize(), 0);
        setColumn(getColumn() + 1);

    }

}
