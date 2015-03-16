public class Piece {

	private int x;
	private int y;
	private boolean alive;
	private World world;
	private PieceColor color;

	public PieceColor getColor() {
		return color;
	}

	public Piece(int x, int y, World world, PieceColor color) {
		this.world=world;
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isOccupied(int x, int y) {
		return world.squareOccupied(x, y);
	}

	public PieceColor getOccupiedColor(int x, int y) {
		if (world.squareOccupied(x, y)) {
			return world.getOccupiedColor(x, y);
		} else
			return null;
	}

	public void removePiece(int x, int y) {
		world.removePiece(x, y, this);
	}
}
