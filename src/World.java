import javax.swing.JFrame;


public class World extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Board board;
	public World (){
		
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		board=new Board();
		add(board);
		
	}
	public boolean squareOccupied(int x, int y) {
		return board.squareOccupied(x, y);
		
	}

	public PieceColor getOccupiedColor(int x, int y) {
		//board.square[x][y].isOccupied();
		if (board.squareOccupied(x, y)) {
			return board.getOccupiedColor(x, y);
		} else
			return null;
	}

	public void removePiece(int x, int y,Piece piece) {
		board.replacePiece(x, y,piece );
	}
}
