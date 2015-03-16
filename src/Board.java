import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Set;

import javax.swing.JPanel;

public class Board extends JPanel {
	private static final long serialVersionUID = 1L;
	private static final int SQUARES = 8;
	protected Square[][] square;
	private GridLayout grid;
	private boolean somethingClicked;
	private Set<Square> legal;
	private Square from;
	private Square to;

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
				Square next = square[i][j];
				Color color = Color.BLACK;
				if (count % 2 == 0) {
					color = Color.RED;
				}
				next = new Square(i, j, color);
				next.addActionListener(click);
				next.addMouseListener(mouseOver);
				add(next);
				count++;
			}
		}
	}

	public boolean squareOccupied(int x, int y) {
		return square[x][y].isOccupied();
	}

	public PieceColor getOccupiedColor(int x, int y) {
		return square[x][y].getPiece().getColor();
	}

	public void move() {
		Piece piece = from.removePiece();
		to.setPiece(piece);
	}

	MouseListener mouseOver = new MouseListener() {
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {
			Square square = (Square) e.getSource();
			if (legal.contains(square)) {
				square.highlight();
			}
		}

		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			Square square = (Square) e.getSource();
			if (square.isHighlighted()) {
				square.unhighlight();
			}
		}

		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
		}

		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {
		}

		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {
		}
	};

	ActionListener click = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent event) {
			Square square = (Square) event.getSource();
			if (somethingClicked) {
				if (square.equals(from)) {
					square.turnRedToggle();
				}
				if (legal.contains(square)) {
					square.getPiece().setAlive(true);
					move();
					somethingClicked = false;
				}
			}
			else {
				from = square;
				square.turnRedToggle();
				legal = from.getPiece().evaluatePiece();
				somethingClicked = true;
			}

		}
	};
}
