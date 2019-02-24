package org.academiadecodigo.bootcamp.MapEditor;

public class Grid {

    private Cell[][] grid;
    private int columns;
    private int rows;

    public Grid(int columns, int rows) {

        this.columns = columns;
        this.rows = rows;
        this.grid = new Cell[columns][rows];

    }

    public void start() {

        populateGrid();

    }

    private void populateGrid() {

        for(int column = 0; column < columns; column++) {
            for(int row = 0; row < rows; row++) {
                grid[column][row] = new Cell(column, row);
            }
        }
    }

    public String getCellsToString() {

        String allCellsFile = "";
        for(int column = 0; column < columns; column++) {
            for(int row = 0; row < rows; row++) {
                allCellsFile += (getCell(column, row).toString());
            }
            allCellsFile += "\n";
        }
        return allCellsFile;
    }

    public int getColumns() {

        return columns;

    }

    public int getRows() {

        return rows;

    }

    public Cell getCell(int column, int row) {

        return grid[column][row];

    }
}
