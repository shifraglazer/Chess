import java.awt.Color;

import javax.swing.JButton;

public class Square extends JButton {
	private static final long serialVersionUID = 1L;
	private int row;
	private int col;
	private boolean occupied;
	private Piece piece;
	private Color defaultColor;
	private boolean hilighted;

	public Square(int row, int col, Color color) {
		this.row = row;
		this.col = col;
		defaultColor = color;
		setBackground(color);
		setForeground(color);
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

	public void turnRedToggle() {
		setBackground(Color.PINK);
		setForeground(Color.PINK);
	}

	public Piece removePiece() {
		Piece old = piece;
		piece = null;
		return old;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public void highlight() {
		setBackground(Color.BLUE);
		setForeground(Color.BLUE);
		hilighted = true;
	}

	public void unhighlight() {
		setBackground(defaultColor);
		hilighted = false;
	}

	public boolean isHighlighted() {
		return hilighted;
	}

	public Color getColor() {
		return defaultColor;
	}

}
