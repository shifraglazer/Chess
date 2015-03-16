import java.awt.Image;

public class PieceBishop extends Piece {

	private Image image;

	public PieceBishop(int x, int y, Board board,PieceColor color) {
		super(x, y,board,color);

	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public boolean legalMove(int x, int y) {
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
			} else if (x > currentX && y < currentY) {
				for (int i = 0; i < diff; i++) {
					if (isOccupied(currentX + i, currentY - 1)) {
						return false;
					}
				}
			} else if (x < currentX && y < currentY) {
				for (int i = 0; i < diff; i++) {
					if (isOccupied(currentX - i, currentY - 1)) {
						return false;
					}
				}
			} else if (x < currentX && y > currentY) {
				for (int i = 0; i < diff; i++) {
					if (isOccupied(currentX - i, currentY + 1)) {
						return false;
					}
				}
			} else if(getOccupiedColor(x,y).equals(this.getColor())){
				return false;
			}
			else{
				return true;
			}
		}
		return false;

	}

	public void move(int x, int y) {
		if(isOccupied(x,y)){
			removePiece(x,y);
		}
		this.setX(x);
		this.setY(y);
	}
}
