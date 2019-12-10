package com.satyy.chess.characters.impl;



public final class Board {

    
    private Square[][] board;
    private Square selectedSquare;
    public static final int SIZE = 8;
    


    public Square getSquare(int row, int column) {
        Square square = null;
        if (row < SIZE && column < SIZE && row >= 0 && column >= 0) {
            square = board[row][column];
        }
        return square;
    }


    public Square getSelected() {
        return selectedSquare;
    }

    public void setSelected(Square square) {
        selectedSquare = square;
    }

    
}
