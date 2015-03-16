public class PieceRook extends Piece {

	public PieceRook(int x, int y, World world, PieceColor color) {
		super(x, y, world, color);

	}

	public boolean legalMove(int x, int y) {
		int currentX = getX();
		int currentY = getY();

		int diffx = Math.abs(getX() - currentX);
		int diffy = Math.abs(getY() - currentY);
		if (getOccupiedColor(x, y).equals(this.getColor())) {
			return false;
		}
		if (diffx > 0) {
			if (x > currentX) {
				for (int i = 0; i < diffx; i++) {
					if (isOccupied(currentX + i, currentY)) {
						return false;
					}
				}
			} else if (x < currentX) {
				for (int i = 0; i < diffx; i++) {
					if (isOccupied(currentX - i, currentY)) {
						return false;
					}
				}
			}
		} else {
			if (y < currentY) {
				for (int i = 0; i < diffy; i++) {
					if (isOccupied(currentX, currentY - 1)) {
						return false;
					}
				}

			} else if (y > currentY) {
				for (int i = 0; i < diffy; i++) {
					if (isOccupied(currentX, currentY + 1)) {
						return false;
					}
				}
			}
		}

		return true;
	}

}
