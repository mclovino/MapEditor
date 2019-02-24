package org.academiadecodigo.bootcamp.MapEditor;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private Rectangle cell;
    private final int cellSize = 50;
    private int column;
    private int row;
    private boolean isFilled = false;


    public Cell(int column, int row) {

        this.cell = new Rectangle(columnToPixel(column) + 10, rowToPixel(row) + 10, cellSize, cellSize);
        this.cell.draw();
        this.column = column;
        this.row = row;

    }

    public void fill() {

        cell.fill();
        setFilled(true);

    }

    public void paint(){

        if(!isFilled){

            this.fill();

        } else {

            this.draw();

        }
    }

    public void draw() {

        cell.draw();
        setFilled(false);

    }

    public int columnToPixel(int column) {

        return column * cellSize;

    }

    public int rowToPixel(int row) {

        return row * cellSize;

    }

    public int getColumn() {

        return column;

    }

    public int getRow() {

        return row;

    }

    public void setColumn(int column) {

        this.column = column;

    }

    public void setRow(int row) {

        this.row = row;

    }

    public void setFilled(boolean filled) {

        isFilled = filled;

    }

    public Rectangle getCell() {

        return cell;

    }

    public int getCellSize() {

        return cellSize;

    }

    @Override
    public String toString() {
        return isFilled ? "1" : "0";
    }
}
