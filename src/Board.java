import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Board extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int SQUARES = 8;
	protected Square[][] square;
	private GridLayout grid;

	public Board() {
		grid = new GridLayout(SQUARES, SQUARES);
		setLayout(grid);
		square = new Square[SQUARES][SQUARES];
		setUpSquares();
	}

	public void setUpSquares() {

		for (int i = 0; i < SQUARES; i++) {
			int count = 0;
			if (i % 2 == 0) {
				count = 1;
			}
			for (int j = 0; j < SQUARES; j++) {
				square[i][j] = new Square(i, j);
				add(square[i][j]);
				count++;
				if (count % 2 == 0) {
					square[i][j].setBackground(Color.RED);
					square[i][j].setForeground(Color.RED);
				} else {
					square[i][j].setBackground(Color.BLACK);
					square[i][j].setForeground(Color.BLACK);
				}
			}
		}
	}

	public boolean squareOccupied(int x, int y) {
		return square[x][y].isOccupied();
	}

	public PieceColor getOccupiedColor(int x, int y) {
		return square[x][y].getPeice().getColor();
	}

	public void replacePiece(int x, int y, Piece piece) {
		square[x][y].getPeice().setAlive(false);
		square[x][y].setPeice(piece);
	}
}
