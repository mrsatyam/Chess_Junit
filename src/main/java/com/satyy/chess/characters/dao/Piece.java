
package com.satyy.chess.characters.dao;

import java.util.Collection;

import com.satyy.chess.characters.impl.Square;

public abstract class Piece {

	private final PieceType pieceType;
	private Square square;

	public Piece(PieceType type) {
		pieceType = type;
	}

	public String getType() {
		return pieceType.toString();
	}

	public Square getSquare() {
		return square;
	}

	public abstract Collection<Square> getPossibleMoves();

	public abstract Collection<Square> generatePossibleMoves();

	public void setSquare(Square square) {
		this.square = square;
	}

}
