package com.nibblesonbits;

import java.util.ArrayList;
import java.util.List;

public class WinningSet {
	List<TicTacToeLocation> winningLocationList = new ArrayList<TicTacToeLocation>();

	public WinningSet(TicTacToeLocation loc0, TicTacToeLocation loc1, TicTacToeLocation loc2, TicTacToeLocation loc3) {
		winningLocationList.add(loc0);
		winningLocationList.add(loc1);
		winningLocationList.add(loc2);
		winningLocationList.add(loc3);
	}

	public WinningSet() {
		// TODO Auto-generated constructor stub
	}

	public void addLocation(TicTacToeLocation loc) {
		winningLocationList.add(loc);
	}

	private void addLocation(int x, int y, int z) {
		winningLocationList.add(new TicTacToeLocation(x, y, z));
	}

	public void print() {
		for (TicTacToeLocation loc : winningLocationList) {
			loc.print();
			System.out.print(" ");
		}
	}

	public static List<WinningSet> generateAllWinningSets() {
		List<WinningSet> ret = new ArrayList<WinningSet>();


		// 16 x-normal lines
		for (int x = 0; x < 4; x++) {
			for (int z = 0; z < 4; z++) {
				WinningSet ws = new WinningSet();
				for (int y = 0; y < 4; y++) {
					ws.addLocation(x, y, z);
				}
				ret.add(ws);
			}
		}

		// 16 y-normal lines
		for (int y = 0; y < 4; y++) {
			for (int z = 0; z < 4; z++) {
				WinningSet ws = new WinningSet();
				for (int x = 0; x < 4; x++) {
					ws.addLocation(x, y, z);
				}
				ret.add(ws);
			}
		}

		// 16 z-normals lines
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				WinningSet ws = new WinningSet();
				for (int z = 0; z < 4; z++) {
					ws.addLocation(x, y, z);
				}
				ret.add(ws);
			}
		}

		// 8 diagonals on the y-planes	(same X on each set)
		for (int x = 0; x < 4; x++) {
			WinningSet ws = new WinningSet();
			for (int yz = 0; yz < 4; yz++) {
				ws.addLocation(x, yz, yz);
			}
			ret.add(ws);

			WinningSet ws1 = new WinningSet();
			for (int yz = 3; yz >= 0; yz--) {
				ws1.addLocation(x, yz, 3 - yz);
			}
			ret.add(ws1);
		}

		// 8 diagonals on the x-planes (Same Y per set)
		for (int y = 0; y < 4; y++) {
			WinningSet ws = new WinningSet();
			for (int xz = 0; xz < 4; xz++) {
				ws.addLocation(xz, y, xz);
			}
			ret.add(ws);

			WinningSet ws1 = new WinningSet();
			for (int xz = 3; xz >= 0; xz--) {
				ws1.addLocation(xz, y, 3 - xz);
			}
			ret.add(ws1);
		}

		// 8 diagonals on the z-planes
		for (int z = 0; z < 4; z++) {
			WinningSet ws = new WinningSet();
			for (int xy = 0; xy < 4; xy++) {
				ws.addLocation(xy, xy, z);
			}
			ret.add(ws);

			WinningSet ws1 = new WinningSet();
			for (int xy = 3; xy >= 0; xy--) {
				ws1.addLocation(xy, 3-xy, z);
			}
			ret.add(ws1);
		}
		
		
		// 4 diagonals splitting down the x-y planes
		WinningSet ws0 = new WinningSet();
		WinningSet ws1 = new WinningSet();
		WinningSet ws2 = new WinningSet();
		WinningSet ws3 = new WinningSet();
		for (int xyz = 0; xyz < 4; xyz++) {
			ws0.addLocation(xyz,xyz,xyz);
			ws1.addLocation(3-xyz,xyz,xyz);
			ws2.addLocation(xyz,3-xyz,xyz);
			ws3.addLocation(3-xyz,3-xyz,xyz);
		}
		
		return ret;
	}
}
