package com.nibblesonbits;
import java.util.List;

public class TicTacToe {
	
	
	public static int[][][][][] generateWinningPositions() {
		// A winning position can be represented by 4 sets of 3-d coordinates
		//  We can use a 5 dimensional array to store these winning positions  where the the first (0th) dimension is
		//  one of 72 possible winning positions.
		//  The 2nd dimension holds each set of 4 coordinates
		//  The 3rd, 4th, and 5th dimension represent an individual X,Y,Z coordinate
		
		List<int[][][]> winningPositions = new List<int[][][]>();
		
		// 16 lines passing thru the Z plane
		
		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 4; x++) {
				board = TicTacToe.getCleanBoard();
				WinningSet ws = new WinningSet();
				for (int z = 0; z < 4; z ++) {
					ws.addLocation(new TicTacToeLocation(x,y,z));
					board[x][y][z] = 1;
				}
				
				TicTacToe.printBoard(board);
				System.out.println();
			}
		}
		
		
	}
	
	
	public static int[][][] getCleanBoard() {
		
		//
		int[][][] board = new int[4][4][4];
		
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				for (int z = 0; z < 4; z++) {
					board[x][y][z] = 0;
				}
			}
		}
		
		return board;
	}
	
	public static void printBoard(int[][][] board) {
		
		
		for (int x = 0; x < 4; x++) {
			System.out.println("-----------------     -----------------     -----------------     -----------------");
			for (int z = 0; z < 4; z++) {
				for (int y = 0; y < 4; y++) {
					String c = " ";
					if(board[x][y][z] == 1) { c = "X"; }
					if(board[x][y][z] == 2) { c = "O"; }
					System.out.print("| " + c + " ");					
				}
				System.out.print("|"); if (z < 3) {System.out.print("     ");}
				
			}
			System.out.println();
		}
		System.out.println("-----------------     -----------------     -----------------     -----------------");		// bottom of gameboard
		
	}
	
	

}
