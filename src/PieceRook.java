import java.util.HashSet;
import java.util.Set;

public class PieceRook extends Piece {

	private static final int SQUARES = 8;

	public PieceRook(int x, int y, World world, PieceColor color) {
		super(x, y, world, color);
	}

	@Override
	public Set<Square> evaluatePiece() {
		Set<Square> legal = new HashSet<Square>();

		for (int i = getX(); i > 0; i--) {
			if (!isOccupied(i, getY())) {
				legal.add(getSquare(i, getY()));
			} else {
				break;
			}
		}
		for (int i = getX(); i < SQUARES; i++) {
			if (!isOccupied(i, getY())) {
				legal.add(getSquare(i, getY()));
			} else {
				break;
			}
		}
		for (int i = getY(); i > 0; i--) {
			if (!isOccupied(getX(), i)) {
				legal.add(getSquare(getX(), i));
			} else {
				break;
			}
		}
		for (int i = getY(); i < SQUARES; i++) {
			if (!isOccupied(getX(), i)) {
				legal.add(getSquare(getX(), i));
			} else {
				break;
			}
		}
		return legal;
	}

	/*
	 * int currentX = getX(); int currentY = getY();
	 * 
	 * int diffx = Math.abs(getX() - currentX); int diffy = Math.abs(getY() -
	 * currentY); if (getOccupiedColor(x, y).equals(this.getColor())) { return
	 * false; } if (diffx > 0) { if (x > currentX) { for (int i = 0; i < diffx;
	 * i++) { if (isOccupied(currentX + i, currentY)) { return false; } } } else
	 * if (x < currentX) { for (int i = 0; i < diffx; i++) { if
	 * (isOccupied(currentX - i, currentY)) { return false; } } } } else { if (y
	 * < currentY) { for (int i = 0; i < diffy; i++) { if (isOccupied(currentX,
	 * currentY - 1)) { return false; } }
	 * 
	 * } else if (y > currentY) { for (int i = 0; i < diffy; i++) { if
	 * (isOccupied(currentX, currentY + 1)) { return false; } } } }
	 */

}
