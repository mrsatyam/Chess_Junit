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
        possibleMoves.clear();
        //all possible moves in the up
        for (int i = row + 1; i < Board.SIZE; i++) {
            Square square = super.getSquare().getSquare(i, column);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else {
                possibleMoves.add(square);
                break;
            } 
        }
        //all possible moves in the down
        for (int i = row - 1; i > -1; i--) {
            Square square = super.getSquare().getSquare(i, column);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else {
                break;
            }
        }
        //all possible moves to the right
        for (int i = column + 1; i < Board.SIZE; i++) {
            Square square = super.getSquare().getSquare(row, i);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else {
                break;
            }
        }
        //all possible moves to the left
        for (int i = column - 1; i > -1; i--) {
            Square square = super.getSquare().getSquare(row, i);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            }  else {
                break;
            }
        }
        return possibleMoves;
    }

    @Override
    public Collection<Square> getPossibleMoves() {
        return possibleMoves;
    }

}
