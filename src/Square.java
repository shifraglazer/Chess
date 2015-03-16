import javax.swing.JButton;

public class Square extends JButton {

	private int row;
	private int col;
	private boolean occupied;
	private Piece peice;

	public Square(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public Piece getPeice() {
		return peice;
	}

	public void setPeice(Piece peice) {
		this.peice = peice;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

}
