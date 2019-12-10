package com.satyy.chess.characters.impl;


import com.satyy.chess.characters.dao.Piece;

public class Square {

    public final int ROW;
    public final int COLUMN;
    private Piece piece;

    public Square(int row, int column) {
        ROW = row;
        COLUMN = column;
    }





    public Piece getPiece() {
        return piece;
    }


    @Override
    public String toString() {
        return "Row: " + Board.printRow(ROW) + " Column: " + Board.printColumn(COLUMN) + " - (" + ROW + "," + COLUMN + ")";
    }




    public Square neighbour(int row, int column) {
        return getSquare(ROW + row, COLUMN + column);
    }

	public Square getSquare(int row, int column) {
		return new Square(row,column);
	}
}
