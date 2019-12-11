package com.satyy.chess.characters.impl;

import java.util.ArrayList;
import java.util.Collection;

import com.satyy.chess.characters.dao.Piece;
import com.satyy.chess.characters.dao.PieceType;


public class Horse extends Piece {

    Collection<Square> possibleMoves;

    public Horse(PieceType type) {
        super(type);
        possibleMoves = new ArrayList<>();
    }

    @Override
    public Collection<Square> generatePossibleMoves() {
        int[][] offsets = {
            {-2, 1},
            {-1, 2},
            {1, 2},
            {2, 1},
            {2, -1},
            {1, -2},
            {-1, -2},
            {-2, -1}
        };
        for (int[] o : offsets) {
            Square square = super.getSquare().neighbour(o[0], o[1]);
            if (square != null && (square.getPiece() == null)) {
                possibleMoves.add(square);
            }
        }
        return possibleMoves;
    }

    @Override
    public Collection<Square> getPossibleMoves() {
        return generatePossibleMoves();
    }
}
