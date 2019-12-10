package com.satyy.chess_tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.satyy.chess.characters.impl.Square;

class ChessTest {
		
	@Test
	public void testNextPossibleMoveForKing()
	{		
		List<Square> nextPossibleSquare = (List<Square>) Chess.getMoves("King", new Square(5,5));
		
		Square d6 = new Square(6, 5);
		Square e5 = new Square(6, 5);

		assertTrue(nextPossibleSquare.contains(d6));
	}
	
	@Test
	void testException()
	{
		assertThrows(NumberFormatException.class, () -> Chess.getMoves("Raja", new Square(5,4)));
	}
		
		
}
