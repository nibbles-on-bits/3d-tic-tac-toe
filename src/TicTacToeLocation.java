
public class TicTacToeLocation {
	int x;
	int y;
	int z;
	
	public TicTacToeLocation(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void print() {
		System.out.print("[" + x + "," + y + "," + z + "]");
	}

}
