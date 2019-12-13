package com.satyy.chess.characters.dao;

import com.satyy.chess.characters.impl.Bishop;
import com.satyy.chess.characters.impl.Horse;
import com.satyy.chess.characters.impl.King;
import com.satyy.chess.characters.impl.Pawn;
import com.satyy.chess.characters.impl.Queen;
import com.satyy.chess.characters.impl.Rook;

public enum PieceType {

	PAWN(0) {
		@Override
		public Piece create() {
			return new Pawn(this);
		}
	},
	ROOK(1) {
		@Override
		public Piece create() {
			return new Rook(this);
		}
	},
	HORSE(2) {
		@Override
		public Piece create() {
			return new Horse(this);
		}
	},
	BISHOP(3) {
		@Override
		public Piece create() {
			return new Bishop(this);
		}
	},
	QUEEN(4) {
		@Override
		public Piece create() {
			return new Queen(this);
		}
	},
	KING(5) {
		@Override
		public Piece create() {
			return new King(this);
		}
	};
	private final int type;

	PieceType(int type) {
		this.type = type;
	}

	public Piece create() {
		return null;
	}


	public int getTypeNumber() {
		return type;
	}

}
