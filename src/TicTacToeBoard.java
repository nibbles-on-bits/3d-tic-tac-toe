
public class TicTacToeBoard {
	// has locations and value 0,1,2 for 
	/// empty, X, O
	
	public enum PositionValue { EMPTY, X, O };
	PositionValue[][][] positionValues;
	
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
	
	public PositionValue getLocationValue(int x, int y, int z) {
		return positionValues[x][y][z];
	}
	
	public void setLocationValue(int x,int y,int z,PositionValue val) {
		positionValues[x][y][z] = val;
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
