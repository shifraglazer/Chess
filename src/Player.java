import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

public class Player {
	private String name;
	private Color color;
	private Set<Piece> pieces;
	
	public Player(String name, Color color){
		this.name = name;
		this.color = color;
		pieces = new HashSet<Piece>();
	}
	
	public void addPiece(Piece piece){
		pieces.add(piece);
	}
	
	public void removePiece(Piece piece){
		pieces.remove(piece);
	}
}
