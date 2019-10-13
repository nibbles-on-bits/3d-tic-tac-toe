
public class Main {
	
	public static void main(String [] args)
	{
		TicTacToeBoard tttBoard = new TicTacToeBoard();
		
		tttBoard.print();
		
		
		//int[][][] board = TicTacToe.getCleanBoard();
		/*int[][][] board = TicTacToe.getCleanBoard();
		
		board[0][0][0] = 1;
		board[0][0][1] = 1;
		board[0][0][2] = 1;
		board[0][0][3] = 1;
		
		board[0][1][0] = 2;
		board[0][1][1] = 2;
		board[0][1][2] = 2;
		board[0][1][3] = 2;*/
		
		
		// Winning Patterns //
		
		///////////////////////////////////////// 16 Lines passing thru the Z Plane
		/*System.out.println("===================================================================================");
		System.out.println("                         16 lines Passing thru the Z Plane");
		System.out.println("===================================================================================");
        
		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 4; x++) {
				board = TicTacToe.getCleanBoard();
				for (int z = 0; z < 4; z ++) {
					board[x][y][z] = 1;
				}
				TicTacToe.printBoard(board);
				System.out.println();
			}
		}*/
		
		
		///////////////////////////////////////// 16 Lines passing thru the X Plane
		/*System.out.println("--------------16 Lines Passing thru the X Plane-------------------");
		/*for (int x = 0; x < 4; x++) {
			for (int z = 0; z < 4; z++) {
				board = TicTacToe.getCleanBoard();
				for (int y = 0; y < 4; y ++) {
					board[x][y][z] = 1;
				}
				TicTacToe.printBoard(board);
			}
		}*/
		
		///////////////////////////////////////// 16 Lines passing thru the Y Plane
		/*for (int z = 0; z < 4; z++) {
			for (int y = 0; y < 4; y++) {
				board = TicTacToe.getCleanBoard();
				for (int x = 0; x < 4; x ++) {
					board[x][y][z] = 1;
				}
				TicTacToe.printBoard(board);
			}
		}*/
		
		///////////////////////////////////// 8 diagonals normal to the X plane
		/*for (int x = 0; x < 3; x++) {
			board = TicTacToe.getCleanBoard();
			for (int yz = 0; yz < 4; yz++) {
				board[x][yz][yz] = 1;
			}
			TicTacToe.printBoard(board);
			board = TicTacToe.getCleanBoard();
			for (int yz = 3; yz >= 0; yz--) {
				board[x][yz][3-yz] = 1;
			}
			TicTacToe.printBoard(board);
		}*/
		
		///////////////////////////////////// 8 diagonals normal to the Y plane
		/*for (int y = 0; y < 3; y++) {
			board = TicTacToe.getCleanBoard();
			for (int xz = 0; xz < 4; xz++) {
				board[xz][y][xz] = 1;
			}
			TicTacToe.printBoard(board);
			board = TicTacToe.getCleanBoard();
			for (int xz = 3; xz >= 0; xz--) {
				board[xz][y][3-xz] = 1;
			}
			TicTacToe.printBoard(board);
		}*/
		
		///////////////////////////////////// 8 diagonals normal to the Z plane
		/*for (int z = 0; z < 3; z++) {
			board = TicTacToe.getCleanBoard();
			for (int xz = 0; xz < 4; xz++) {
				board[xz][y][xz] = 1;
			}
			TicTacToe.printBoard(board);
			board = TicTacToe.getCleanBoard();
			for (int xz = 3; xz >= 0; xz--) {
				board[xz][y][3-xz] = 1;
			}
			TicTacToe.printBoard(board);
		}*/
		
		
		
		
		
		// 16 Horizontal lines going thru the Z Plane
		
		// 16 Horizontal lines going thru the Y Plane
		
		
		// 8 Diagonal Patterns on the Y Slices
		
		// 8 Diagonal Patterns on the X Slice
		
		// 8 Diagonal Patterns on the Z Slice
		
		
		
		//TicTacToe.printBoard(board);
		
		/*TicTacToeLocation loc0 = new TicTacToeLocation(0,0,0);
		TicTacToeLocation loc1 = new TicTacToeLocation(0,0,1);
		TicTacToeLocation loc2 = new TicTacToeLocation(0,0,2);
		TicTacToeLocation loc2 = new TicTacToeLocation(0,0,3);
		WinningSet ws = new WinningSet(loc0,loc1,loc2,loc3);
		ws.print();*/
	}
}
