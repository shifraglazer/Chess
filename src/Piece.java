import java.awt.Image;
import java.util.Set;

public class Piece {
	protected int x;
	protected int y;
	private boolean alive;
	private World world;
	private PieceColor color;
	private Image image;

	public Piece(int x, int y, World world, PieceColor color) {
		this.world = world;
		this.color = color;
		this.x = x;
		this.y = y;
		alive = true;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public PieceColor getColor() {
		return color;
	}

	public boolean isOccupied(int x, int y) {
		return world.squareOccupied(x, y);
	}

	public Square getSquare(int x, int y) {
		return world.getSquare(x, y);
	}

	public PieceColor getOccupiedColor(int x, int y) {
		if (world.squareOccupied(x, y)) {
			return world.getOccupiedColor(x, y);
		}
		return null;
	}

	public Set<Square> evaluatePiece() {
		// TODO see if Override works of if need instanceof
		return null;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}
