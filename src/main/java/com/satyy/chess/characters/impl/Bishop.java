package com.satyy.chess.characters.impl;

import java.util.ArrayList;
import java.util.Collection;

import com.satyy.chess.characters.dao.Piece;
import com.satyy.chess.characters.dao.PieceType;



public class Bishop extends Piece {

	Collection<Square> possibleMoves;

    public Bishop(PieceType type) {
		super(type);
		possibleMoves = new ArrayList<>();
	}


   

    @Override
    public Collection<Square> generatePossibleMoves() {
        int row = super.getSquare().ROW;
        int column = super.getSquare().COLUMN;
        //all possible moves in the down positive diagonal
        for (int j = column + 1, i = row + 1; j < Board.SIZE && i < Board.SIZE; j++, i++) {
            Square square = super.getSquare().getSquare(i,j);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else{
                possibleMoves.add(square);
                break;
            } 
        }
        //all possible moves in the up positive diagonal
        for (int j = column - 1, i = row + 1; j > -1 && i < Board.SIZE; j--, i++) {
            Square square = super.getSquare().getSquare(i, j);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else{
                possibleMoves.add(square);
                break;
            } 
        }
        //all possible moves in the up negative diagonal
        for (int j = column - 1, i = row - 1; j > -1 && i > -1; j--, i--) {
            Square square = super.getSquare().getSquare(i, j);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else {
                possibleMoves.add(square);
                break;
            }
        }
        //all possible moves in the down negative diagonal
        for (int j = column + 1, i = row - 1; j < Board.SIZE && i > -1; j++, i--) {
            Square square = super.getSquare().getSquare(i, j);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else  {
                possibleMoves.add(square);
                break;
            } 
        }
        return possibleMoves;
    }

    @Override
    public Collection<Square> getPossibleMoves() {
        return generatePossibleMoves();
    }
}
