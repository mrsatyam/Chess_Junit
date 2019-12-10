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
    	
        return ""+(char)(COLUMN + (int)'A' - 2) + ROW;
    }

    @Override
	public int hashCode() {
		return (ROW+COLUMN) * 2222 ;
	}





	@Override
	public boolean equals(Object obj) {
		return ((Square)obj).ROW == this.ROW && ((Square)obj).COLUMN == this.COLUMN;
	}





	public Square neighbour(int row, int column) {
        return getSquare(ROW + row, COLUMN + column);
    }

	public Square getSquare(int row, int column) {
		return new Square(row,column);
	}
	
	
}
