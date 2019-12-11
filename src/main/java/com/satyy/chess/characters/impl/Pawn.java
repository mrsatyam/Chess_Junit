package com.satyy.chess.characters.impl;

import java.util.ArrayList;
import java.util.Collection;

import com.satyy.chess.characters.dao.Piece;
import com.satyy.chess.characters.dao.PieceType;


public class Pawn extends Piece {

    Collection<Square> possibleMoves;

    public Pawn(PieceType type) {
        super(type);
        possibleMoves = new ArrayList<>();
    }

    @Override
    public Collection<Square> generatePossibleMoves() {
        return null;

    }

    @Override
    public Collection<Square> getPossibleMoves() {
        return generatePossibleMoves();
    }

}
