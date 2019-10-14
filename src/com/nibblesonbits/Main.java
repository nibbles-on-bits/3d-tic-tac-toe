package com.nibblesonbits;

import java.util.List;
import java.util.Scanner;

import com.nibblesonbits.TicTacToeBoard.PositionValue;

public class Main {
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		TicTacToeBoard board = new TicTacToeBoard();
		
		PositionValue turn = PositionValue.X;
		
		while (board.checkForWinner() == PositionValue.EMPTY) {
			board.print();
			
			System.out.println("QUIT, X,Y,Z to move");
			System.out.print(turn.toString() + ": ");
			
			String command = input.next();
			if (command.toUpperCase().contains("QUIT")) {
				System.out.println("Goodbye\n\n");
				return;
			} else {
				try {
					board.makeAMove(command, turn);
				} catch (Exception e) {
					System.out.println("Exception: " + e.toString());
					continue;
				}
			}
		
			if (turn == PositionValue.X) {
				turn = PositionValue.O;
			} else {
				turn = PositionValue.X;
			}
			
		}
		
		board.setLocationValue(0, 0, 0, PositionValue.O);
		board.setLocationValue(1, 0, 0, PositionValue.O);
		board.setLocationValue(2, 0, 0, PositionValue.O);
		board.setLocationValue(3, 0, 0, PositionValue.O);
		
		
		System.out.println("WINNER = " + board.checkForWinner().toString());

	}
}
