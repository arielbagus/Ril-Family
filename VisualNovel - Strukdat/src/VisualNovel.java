import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VisualNovel {

	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel ;
	JLabel titleNameLabel, pictureLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font startButtonFont = new Font("Times New Roman", Font.PLAIN, 28);
	JButton startButton, nextButton;
	JTextArea mainTextArea;
	ImageIcon picture;
	
	public VisualNovel() {
		
		picture = new ImageIcon(this.getClass().getResource("/01.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setSize(800, 600);
		
		window = new JFrame("Visual Novel");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel(new BorderLayout());
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setOpaque(false);
		titleNameLabel = new JLabel("PERCOBAAN SATU");
		titleNameLabel.setForeground(Color.BLACK);
		titleNameLabel.setFont(titleFont);
		titleNameLabel.setHorizontalAlignment(JLabel.CENTER);
		
		startButtonPanel = new JPanel(new BorderLayout());
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setOpaque(false);
		
		startButton = new JButton("Mulai");
		startButton.setFont(startButtonFont);
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		startButton.setForeground(Color.black);
		startButton.setFocusPainted(false);

		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		con.add(pictureLabel);
		
	}  
	
	public void createGameScreen() {
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250); 
		mainTextPanel.setBackground(Color.blue);
		con.add(mainTextPanel);
		
		
	}
	
	public static void main(String[] args) {
		new VisualNovel();
	}

}
