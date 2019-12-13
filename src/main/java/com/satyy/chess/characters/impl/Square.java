package com.satyy.chess.characters.impl;

public class Square {

	public final int ROW;
	public final int COLUMN;

	public Square(int row, int column) {
		ROW = row;
		COLUMN = column;
	}

	@Override
	public String toString() {

		return "" + (char) (COLUMN + (int) 'A') + ROW;
	}

	@Override
	public int hashCode() {
		return (ROW + COLUMN) * 2222;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Square) obj).ROW == this.ROW && ((Square) obj).COLUMN == this.COLUMN;
	}

	public Square neighbour(int row, int column) {
		return getSquare(ROW + row, COLUMN + column);
	}

	public Square getSquare(int row, int column) {
		return new Square(row, column);
	}

}
