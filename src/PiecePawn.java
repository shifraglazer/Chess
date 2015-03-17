import java.util.HashSet;
import java.util.Set;

import com.sun.prism.paint.Color;

public class PiecePawn extends Piece {

	public PiecePawn(int x, int y, World world, PieceColor color) {
		super(x, y, world, color);
	}

	public Set<Square> evaluatePiece(Color currentColor) {
		Set<Square> legal = new HashSet<Square>();

		if (currentColor.equals(Color.BLACK)) {
			Square front = getSquare(x + 1, y);
			if (!front.isOccupied()) {
				legal.add(front);
			}
			Square right = getSquare(x + 1, y - 1);
			if (right.isOccupied() && right.getColor().equals(currentColor)) {
				legal.add(right);
			}
			Square left = getSquare(x + 1, y + 1);
			if (right.isOccupied() && left.getColor().equals(currentColor)) {
				legal.add(left);
			}
		}

		if (currentColor.equals(Color.WHITE)) {
			Square front = getSquare(x - 1, y);
			if (!front.isOccupied()) {
				legal.add(front);
			}
			Square right = getSquare(x - 1, y + 1);
			if (right.isOccupied() && right.getColor().equals(currentColor)) {
				legal.add(right);
			}
			Square left = getSquare(x - 1, y - 1);
			if (right.isOccupied() && left.getColor().equals(currentColor)) {
				legal.add(left);
			}
		}
		
		return legal;
	}
}
