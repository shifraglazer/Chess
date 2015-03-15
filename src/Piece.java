public class Piece {

	private int x;
	private int y;
	private boolean alive;
	private Board board;
	private PieceColor color;
	
	public PieceColor getColor() {
		return color;
	}
	public Piece(int x, int y,Board board,PieceColor color){
		this.color=color;
		this.x=x;
		this. y=y;
		alive=true;
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
	public boolean isOccupied(int x,int y){
		return board.squareOccupied(x,y);
	}
	public PieceColor getOccupiedColor(int x, int y){
		if ( board.squareOccupied(x, y)){
			return board.getOccupiedColor(x,y);
		}
		else return null;
	}
}
