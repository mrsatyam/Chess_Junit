package com.satyy.chess_tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.satyy.chess.characters.impl.Square;

class ChessTest {
	
//	@Test
//	void getInputForType() {
//		try(Scanner input = new Scanner(System.in))
//		{
//			assertEquals("King",Chess.getInputForType(input) );
//		}
		
		
	@Test
	public void testNextPossibleMoveForKing()
	{
		Chess chessService = new Chess();
		
		Collection<Square> nextPossibleSquare = Chess.getMoves("King", new Square(5,4));
		
		Square d6 = new Square(6, 4);
		Square e4 = new Square(4, 5);

		assertTrue(nextPossibleSquare.contains(d6));
	}
	
	@Test
	void testException()
	{
		assertThrows(NumberFormatException.class, () -> Chess.getMoves("Raja", new Square(5,4)));
	}
		
		
}
