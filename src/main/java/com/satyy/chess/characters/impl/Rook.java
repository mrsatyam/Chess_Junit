package com.satyy.chess.characters.impl;

import java.util.ArrayList;
import java.util.Collection;

import com.satyy.chess.characters.dao.Piece;
import com.satyy.chess.characters.dao.PieceType;

public class Rook extends Piece {

	Collection<Square> possibleMoves;

	public Rook(PieceType type) {
		super(type);
		possibleMoves = new ArrayList<>();
	}

	@Override
	public Collection<Square> generatePossibleMoves() {
		int row = super.getSquare().ROW;
		int column = super.getSquare().COLUMN;
		// all possible moves in the up
		for (int i = row + 1; i < Board.SIZE; i++) {
			Square square = super.getSquare().getSquare(i, column);
			possibleMoves.add(square);

		}
		// all possible moves in the down
		for (int i = row - 1; i > -1; i--) {
			Square square = super.getSquare().getSquare(i, column);
			possibleMoves.add(square);
		}
		// all possible moves to the right
		for (int i = column + 1; i < Board.SIZE; i++) {
			Square square = super.getSquare().getSquare(row, i);
			possibleMoves.add(square);
		}
		// all possible moves to the left
		for (int i = column - 1; i > -1; i--) {
			Square square = super.getSquare().getSquare(row, i);
			possibleMoves.add(square);
		}
		return possibleMoves;
	}

	@Override
	public Collection<Square> getPossibleMoves() {
		return generatePossibleMoves();
	}

}
