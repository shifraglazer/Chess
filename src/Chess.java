import javax.swing.JFrame;

public class Chess extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private World world;
	public Chess(){
		world=new World();
	}

	public static void main(String[] args) {
		Chess chess=new Chess();
		chess.setVisible(true);
	}

}
