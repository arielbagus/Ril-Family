import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	JLabel titleNameLabel, pictureLabel, pictureLabel2;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font startButtonFont = new Font("Times New Roman", Font.PLAIN, 28);
	JButton startButton, nextButton;
	JTextArea mainTextArea;
	ImageIcon picture, picture2;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	
	public VisualNovel() {
		
		window = new JFrame("Visual Novel");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		con = window.getContentPane();
	
		picture = new ImageIcon(this.getClass().getResource("/01.png"));
		picture2 = new ImageIcon(this.getClass().getResource("/03-1.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setSize(800, 600);		

		titleNamePanel = new JPanel(new BorderLayout());
		titleNamePanel.setBounds(100, 45, 600, 400);
		titleNamePanel.setOpaque(false);
		titleNameLabel = new JLabel();
		titleNameLabel.setText("The Legend Of Irsyad");
		titleNameLabel.setIcon(picture2);
		titleNameLabel.setHorizontalTextPosition(JLabel.CENTER);
		titleNameLabel.setVerticalTextPosition(JLabel.TOP);
		titleNameLabel.setIconTextGap(40);
		titleNameLabel.setForeground(Color.BLACK);
		titleNameLabel.setFont(titleFont);
		titleNameLabel.setVerticalAlignment(JLabel.CENTER);
		titleNameLabel.setHorizontalAlignment(JLabel.CENTER);
		
		startButtonPanel = new JPanel(new BorderLayout());
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setOpaque(false);
		
		startButton = new JButton("Mulai");
		startButton.setFont(startButtonFont);
		startButton.setForeground(Color.black);
		startButton.setBackground(Color.white);
		startButton.addActionListener(tsHandler);
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		//startButton.setBorderPainted(false);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		con.add(pictureLabel);
		
	}  
	
	public void createGameScreen() {
		
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		pictureLabel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250); 
		mainTextPanel.setBackground(Color.blue);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.BLACK);
		mainTextArea.setForeground(Color.WHITE);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
	}
	
	public class TitleScreenHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			createGameScreen();
			
		}
	}
	
	public static void main(String[] args) {
		new VisualNovel();
	}

}