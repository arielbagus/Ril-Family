import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class VisualNovel {

	//Panel
	JFrame window;
	//Container
	Container con;
	
	public VisualNovel() {
		//Membuat suatu panel
		window = new JFrame();
		window.setSize(700, 700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
	}
	
	public static void main(String[] args) {
		new VisualNovel();
	}

}
