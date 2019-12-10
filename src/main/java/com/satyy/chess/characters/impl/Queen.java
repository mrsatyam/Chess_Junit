package com.satyy.chess.characters.impl;

import java.util.ArrayList;
import java.util.Collection;

import com.satyy.chess.characters.dao.Piece;
import com.satyy.chess.characters.dao.PieceType;

public class Queen extends Piece {

    Collection<Square> possibleMoves;

    public Queen(PieceType type) {
        super(type);
        possibleMoves = new ArrayList<>();
    }

    @Override
    public Collection<Square> generatePossibleMoves() {
        possibleMoves.clear();
        Piece[] pieces = {
            PieceType.ROOK.create(),
            PieceType.BISHOP.create()
        };
        for (Piece piece : pieces) {
            piece.setSquare(getSquare());
            possibleMoves.addAll(piece.generatePossibleMoves());
        }
        return possibleMoves;
    }

    @Override
    public Collection<Square> getPossibleMoves() {
        return possibleMoves;
    }
}
