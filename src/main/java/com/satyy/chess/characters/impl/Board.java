package com.satyy.chess.characters.impl;



public final class Board {

    
    private Square[][] board;
    private Square selectedSquare;
    public static final int SIZE = 8;
    
    public static String printRow(int row) {
        return String.valueOf( 65-row);
    }

    public static String printColumn(int column) {
        return String.valueOf( column);
    }


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
