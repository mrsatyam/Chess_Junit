package com.satyy.chess.characters.dao;

import com.satyy.chess.characters.impl.Bishop;
import com.satyy.chess.characters.impl.King;
import com.satyy.chess.characters.impl.Horse;
import com.satyy.chess.characters.impl.Pawn;
import com.satyy.chess.characters.impl.Queen;
import com.satyy.chess.characters.impl.Rook;
public enum PieceType {

    PAWN(0) {
                @Override
               public Piece create() {
                    return new Pawn(this);
                }
            }, ROOK(1) {
                @Override
               public Piece create() {
                    return new Rook(this);
                }
            }, HORSE(2) {
                @Override
                public Piece create() {
                    return new Horse(this);
                }
            }, BISHOP(3) {
                @Override
                public Piece create() {
                    return new Bishop(this);
                }
            }, QUEEN(4) {
                @Override
                public Piece create() {
                    return new Queen(this);
                }
            }, KING(5) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public String toString() {
        String str = "";
        switch (type) {
            case 0:
                str = "Pawn";
                break;
            case 1:
                str = "Rook";
                break;
            case 2:
                str = "Knight";
                break;
            case 3:
                str = "Bishop";
                break;
            case 4:
                str = "Queen";
                break;
            case 5:
                str = "King";
                break;
        }
        return str;
    }

    public int getTypeNumber() {
        return type;
    }

  
}
