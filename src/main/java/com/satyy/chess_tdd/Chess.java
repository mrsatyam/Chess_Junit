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
			Square currentPos = getSquare(getColumnForPosition(input),getRowForPosition(input));
			Collection<Square> moves = getMoves(type, currentPos);
			System.out.print("Possible moves: ");
			moves.forEach((move)->System.out.print(move+","));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int getRowForPosition(Scanner input) {
		System.out.println("Enter the current row of the piece > 0 ");
		
		return input.nextInt();

	}
	public static int getColumnForPosition(Scanner input) {
		System.out.println("Enter the current column of the piece (from A to H) ");
		 String in = input.next();
		 int column = in.charAt(0) - (int)'A' + 1;
		 return column;

	}

	public static String getInputForType(Scanner input) {
		System.out.println("Enter the type of piece");
		return input.nextLine();

	}

	private static Square getSquare(int column,int row) {
		
		return new Square(row , column);

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
			throw new RuntimeException("Illegal piece type");
		}

	}
}
