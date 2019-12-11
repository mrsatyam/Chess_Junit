package com.satyy.chess.characters.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.satyy.chess.characters.dao.Piece;
import com.satyy.chess.characters.dao.PieceType;

public class King extends Piece {

    Collection<Square> possibleMoves;

    public King(PieceType type) {
        super(type);
        possibleMoves = new ArrayList<>();
    }

	

	@Override
    public Collection<Square> generatePossibleMoves() {
        List<Square> moves = new ArrayList<>();
        int[][] offsets = {
            {1, 0},
            {0, 1},
            {-1, 0},
            {0, -1},
            {1, 1},
            {-1, 1},
            {-1, -1},
            {1, -1}
        };
        for (int[] o : offsets) {
            Square square = super.getSquare().neighbour(o[0], o[1]);
            if (square != null && (square.getPiece() == null)) {
                moves.add(square);
            }
        }
        return moves;
    }

    @Override
    public Collection<Square> getPossibleMoves() {
        return generatePossibleMoves();
    }

}
