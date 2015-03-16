import java.util.HashSet;
import java.util.Set;


public class PieceBishop extends Piece {

	public PieceBishop(int x, int y, World world, PieceColor color) {
		super(x, y, world, color);

	}
	
	@Override
	public Set<Square> evaluatePiece() {
		Set<Square> legal = new HashSet<Square>();
		// TODO check which squares can add to set
		return legal;
	}

	/*public boolean legalMove(int x, int y) {
		int currentX = getX();
		int currentY = getY();
		if (Math.abs(getX() - currentX) == Math.abs(getY() - currentY)) {
			int diff = Math.abs(getX() - currentX);
			if (x > currentX && y > currentY) {
				for (int i = 0; i < diff; i++) {
					if (isOccupied(currentX + i, currentY + i)) {
						return false;
					}
				}
			}
			else if (x > currentX && y < currentY) {
				for (int i = 0; i < diff; i++) {
					if (isOccupied(currentX + i, currentY - 1)) {
						return false;
					}
				}
			}
			else if (x < currentX && y < currentY) {
				for (int i = 0; i < diff; i++) {
					if (isOccupied(currentX - i, currentY - 1)) {
						return false;
					}
				}
			}
			else if (x < currentX && y > currentY) {
				for (int i = 0; i < diff; i++) {
					if (isOccupied(currentX - i, currentY + 1)) {
						return false;
					}
				}
			}
			else if (getOccupiedColor(x, y).equals(this.getColor())) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
	}*/
}
