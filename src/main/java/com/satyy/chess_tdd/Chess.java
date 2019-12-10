package com.satyy.chess_tdd;

import java.util.Collection;
import java.util.Scanner;

import com.satyy.chess.characters.dao.Piece;
import com.satyy.chess.characters.dao.PieceType;
import com.satyy.chess.characters.impl.Bishop;
import com.satyy.chess.characters.impl.Horse;
import com.satyy.chess.characters.impl.King;
import com.satyy.chess.characters.impl.Pawn;
import com.satyy.chess.characters.impl.Queen;
import com.satyy.chess.characters.impl.Rook;
import com.satyy.chess.characters.impl.Square;

public class Chess {
	private static Piece piece;

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {

			String type = getInputForType(input);
			Square currentPos = getSquare(getInputForPosition(input));
			Collection<Square> moves = getMoves(type, currentPos);
			moves.forEach(System.out::println);

		}

	}

	public static String getInputForPosition(Scanner input) {
		System.out.println("Enter the position of the piece ");
		return input.nextLine();

	}

	public static String getInputForType(Scanner input) {
		System.out.println("Enter the type of piece");
		return input.nextLine();

	}

	private static Square getSquare(String position) {
		int row = 50-position.charAt(1);
		int column = 65 - position.charAt(0);
		return new Square(row, column);

	}

	public static Collection<Square> getMoves(String type, Square currentPosition) {

		switch (type) {

		case "King":
			piece = new King(PieceType.KING);
			piece.setSquare(currentPosition);
			return piece.getPossibleMoves();

		case "Queen":
			piece = new Queen(PieceType.QUEEN);
			piece.setSquare(currentPosition);
			return piece.getPossibleMoves();

		case "Pawn":
			piece = new Pawn(PieceType.PAWN);
			return piece.getPossibleMoves();

		case "Bishop":
			piece = new Bishop(PieceType.BISHOP);
			piece.setSquare(currentPosition);
			return piece.getPossibleMoves();

		case "Rook":
			piece = new Rook(PieceType.ROOK);
			piece.setSquare(currentPosition);
			return piece.getPossibleMoves();

		case "Horse":
			piece = new Horse(PieceType.HORSE);
			piece.setSquare(currentPosition);
			return piece.getPossibleMoves();

		default:
			throw new NumberFormatException();
		}

	}
}
