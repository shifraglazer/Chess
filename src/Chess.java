import javax.swing.JFrame;

public class Chess extends JFrame{

	private Board board;
	public Chess (){
		
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		board=new Board();
		add(board);
	}
	public static void main(String[] args) {
		Chess chess=new Chess();
		chess.setVisible(true);
	}

}
