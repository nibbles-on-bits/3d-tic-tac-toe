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

	public void addLocation(TicTacToeLocation loc) {
		winningLocationList.add(loc);
	}
	
	public void print() {
		for (TicTacToeLocation loc : winningLocationList) {
			loc.print();
			System.out.print(" ");
		}
			
	}
	
}

