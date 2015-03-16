import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Chess {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		new World().setVisible(true);
	}

}
