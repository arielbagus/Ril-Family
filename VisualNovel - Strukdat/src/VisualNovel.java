import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VisualNovel {

	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font startButtonFont = new Font("Times New Roman", Font.PLAIN, 30);
	JButton startButton, nextButton;
	
	public VisualNovel() {
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel(new BorderLayout());
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.WHITE);
		titleNameLabel = new JLabel("PERCOBAAN SATU");
		titleNameLabel.setForeground(Color.PINK);
		titleNameLabel.setFont(titleFont);
		titleNameLabel.setHorizontalAlignment(JLabel.CENTER);
		
		startButtonPanel = new JPanel(new BorderLayout());
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.WHITE);
		
		startButton = new JButton("Mulai");
		startButton.setFont(startButtonFont);
		startButton.setBackground(Color.WHITE);
		startButton.setForeground(Color.PINK);
		
		titleNamePanel.add(titleNameLabel, BorderLayout.CENTER);
		startButtonPanel.add(startButton, BorderLayout.CENTER);
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		
	}
	
	public static void main(String[] args) {
		new VisualNovel();
	}

}
