package com.satyy.chess_tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
		Square e5 = new Square(5, 6);
		Square d4 = new Square(4, 5);
		Square c5 = new Square(5, 4);
		Square e6 = new Square(6, 6);
		Square e4 = new Square(6, 4);
		Square c4 = new Square(4, 4);
		Square c6 = new Square(4, 6);

		assertTrue(nextPossibleSquare.containsAll(Arrays.asList(d6,e5,d4,c5,e6,e4,c4,c6)));
	}
	
	
	
	
	
	@Test
	public void testNextPossibleMoveForRook() {
		List<Square> nextPossibleSquare = (List<Square>) Chess.getMoves("Rook", new Square(5, 5));

		Square f6 = new Square(6, 5);
		Square f7 = new Square(7, 5);
		Square f4 = new Square(4, 5);
		Square f3 = new Square(3, 5);
		Square f2 = new Square(2, 5);
		Square f1 = new Square(1, 5);
		Square f0 = new Square(0, 5);
		Square g5 = new Square(5, 6);
		Square h5 = new Square(5, 7);
		Square e5 = new Square(5, 4);
		Square d5 = new Square(5, 3);
		Square c5 = new Square(5, 2);
		Square b5 = new Square(5, 1);
		Square a5 = new Square(5, 0);

		assertTrue(
				nextPossibleSquare.containsAll(Arrays.asList(f6, f7, f4, f3, f2, f1, f0, g5, h5, e5, d5, c5, b5, a5)));
	}	 
	
	@Test
	public void testNextPossibleMoveForBishop() {
		List<Square> nextPossibleSquare = (List<Square>) Chess.getMoves("Bishop", new Square(5, 5));
		
		Square g6 = new Square(6, 6);
		Square h7 = new Square(7, 7);
		Square e6 = new Square(6, 4);
		Square d7 = new Square(7, 3);
		Square e4 = new Square(4, 4);
		Square d3 = new Square(3, 3);
		Square c2 = new Square(2, 2);
		Square b1 = new Square(1, 1);
		Square a0 = new Square(0, 0);
		Square g4 = new Square(4, 6);
		Square h3 = new Square(3, 7);
		

		assertTrue(nextPossibleSquare.containsAll(Arrays.asList(g6, h7, e6, d7, e4, d3, c2, b1, a0, g4, h3)));
	}	 
	
	@Test
	public void testNextPossibleMoveForHorse()
	{		
		
		List<Square> nextPossibleSquare = (List<Square>) Chess.getMoves("Horse", new Square(5,3));
		
		Square e3 = new Square(3, 4);
		Square f4 = new Square(4, 5);
		Square f6 = new Square(6, 5);
		Square e7 = new Square(7, 4);
		Square c7 = new Square(7, 2);
		Square b6 = new Square(6, 1);
		Square b4 = new Square(4, 1);
		Square c3 = new Square(3, 2);

		assertTrue(nextPossibleSquare.containsAll(Arrays.asList(e3, f4, f6, e7, c7, b6, b4, c3)));
	}

	@Test
	void testException()
	{
		assertThrows(RuntimeException.class, () -> Chess.getMoves("Raja", new Square(5,4)));
	}
		
		
}
