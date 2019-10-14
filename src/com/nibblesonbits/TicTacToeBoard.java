package com.nibblesonbits;

import java.util.List;

public class TicTacToeBoard {
	
	public enum PositionValue { EMPTY, X, O };
	PositionValue[][][] positionValues;
	List<WinningSet> winningSetList = WinningSet.generateAllWinningSets();
	
	
	
	public PositionValue checkForWinner() {
		PositionValue ret = PositionValue.EMPTY;
		
		for (WinningSet ws : winningSetList) {
			PositionValue v0 = this.getLocationValue(ws.winningLocationList.get(0));
			PositionValue v1 = this.getLocationValue(ws.winningLocationList.get(1));
			PositionValue v2 = this.getLocationValue(ws.winningLocationList.get(2));
			PositionValue v3 = this.getLocationValue(ws.winningLocationList.get(3));
			if (v0 == PositionValue.X && v0==v1 && v0==v2 && v0==v3) return PositionValue.X;
			if (v0 == PositionValue.O && v0==v1 && v0==v2 && v0==v3) return PositionValue.O;
		}

		return ret;
	}
	
	public TicTacToeBoard() {
		positionValues = new PositionValue[4][4][4];
		for (int x=0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				for (int z = 0; z < 4; z++) {
					positionValues[x][y][z] = PositionValue.EMPTY;
				}
			}
		}
	}
	
	public PositionValue getLocationValue(TicTacToeLocation loc) {
		return positionValues[loc.x][loc.y][loc.z];
	}
	
	public PositionValue getLocationValue(int x, int y, int z) {
		return positionValues[x][y][z];
	}
	
	public void setLocationValue(int x,int y,int z,PositionValue val) {
		positionValues[x][y][z] = val;
	}
	
	public void setLocationValue(TicTacToeLocation loc, PositionValue val) {
		positionValues[loc.x][loc.y][loc.z] = val;
	}
	
	/**
	 * 
	 * @param moveCoordinates Comma delimited string x,y,z
	 * @param val 
	 * @throws Exception 
	 */
	public void makeAMove(String moveCoordinates, PositionValue val) throws Exception {
		String[] coords = moveCoordinates.split(",");
		if (coords.length < 3) {
			throw new Exception("Invalid");
		} else {
			int x = Integer.parseInt(coords[0]);
			int y = Integer.parseInt(coords[1]);
			int z = Integer.parseInt(coords[2]);
			
			if (this.getLocationValue(x, y, z) == PositionValue.EMPTY) {
				this.setLocationValue(x, y, z, val);
				return;
				
			} else {
				throw new Exception("Position Occupied");
			}
			
		}
		
	}
	
	public static void printWinningSet(WinningSet ws) {
		TicTacToeBoard board = new TicTacToeBoard();
		for (TicTacToeLocation loc : ws.winningLocationList) {
			board.setLocationValue(loc, PositionValue.X);
		}
		board.print();
		
	}
	
	
	public void print() {
		for (int x = 0; x < 4; x++) {
			System.out.println("-----------------     -----------------     -----------------     -----------------");
			for (int z = 0; z < 4; z++) {
				for (int y = 0; y < 4; y++) {
					String c = " ";
					if(positionValues[x][y][z] == PositionValue.X) { c = "X"; }
					if(positionValues[x][y][z] == PositionValue.O) { c = "O"; }
					System.out.print("| " + c + " ");					
				}
				System.out.print("|"); if (z < 3) {System.out.print("     ");}
				
			}
			System.out.println();
		}
		System.out.println("-----------------     -----------------     -----------------     -----------------");		// bottom of gameboard
	}
	
	
	
	
	

}
