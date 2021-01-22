import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
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
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, pictureLabel, pictureLabel2, pictureLabel3, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font startButtonFont = new Font("Times New Roman", Font.PLAIN, 28);
	Font NormalFont = new Font("Times New Roman", Font.PLAIN, 18);
	JButton startButton, nextButton, choice1, choice2, choice3, choice4 ;
	JTextArea mainTextArea;
	ImageIcon picture, picture2, picture3;
	int playerHP;
	String weapon, position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	
	public VisualNovel() {
		
		window = new JFrame("Visual Novel");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		con = window.getContentPane();
	
		picture = new ImageIcon(this.getClass().getResource("/01.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setSize(800, 600);		
		
		picture2 = new ImageIcon(this.getClass().getResource("/03-1.png"));

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
		startButton.setBorderPainted(false);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		con.add(pictureLabel);
		
	}  
	
	public void createGameScreen() {
		
		window.setLayout(null);
		
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		pictureLabel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(0, 0, 750, 150);
		mainTextPanel.setBackground(Color.black);
		mainTextPanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea();
		mainTextArea.setText("Perkenalkan, nama saya M. Irsyad Yanuardi. "
				+ "Saya merupakan seorang mahasiswa di Universitas Muhammadiyah Malang jurusan Informatika. "
				+ "Ingin tau keseruan cerita saya?");
		mainTextArea.setBounds(0, 0, 750, 150);
		mainTextArea.setBackground(Color.BLACK);
		mainTextArea.setForeground(Color.WHITE);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Jibril");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(NormalFont);
		choice1.setBorderPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		choice2 = new JButton("Adriel");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(NormalFont);
		choice2.setBorderPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		choice3 = new JButton("Ariel");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(NormalFont);
		choice3.setBorderPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		choice4 = new JButton("Irsyad");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(NormalFont);
		choice4.setBorderPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50);
		playerPanel.setBackground(Color.black);;
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
		hpLabel = new JLabel("percobaan:");
		hpLabel.setFont(NormalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		hpLabelNumber = new JLabel();
		hpLabelNumber.setFont(NormalFont);
		hpLabelNumber.setForeground(Color.white);
		playerPanel.add(hpLabelNumber);
		weaponLabel = new JLabel("Weapon:");
		weaponLabel.setFont(NormalFont);
		weaponLabel.setForeground(Color.white);
		playerPanel.add(weaponLabel);
		weaponLabelName = new JLabel();
		weaponLabelName.setFont(NormalFont);
		weaponLabelName.setForeground(Color.white);
		playerPanel.add(weaponLabelName);
	
		picture3 = new ImageIcon(this.getClass().getResource("/04.png"));
		pictureLabel3 = new JLabel(picture);
		pictureLabel3.setSize(800, 600);	
	
		con.add(pictureLabel3);
	}
	public	void playerSetup(){
		playerHP = 15;
		weapon = "Knife";
		weaponLabelName.setText(weapon);
		hpLabelNumber.setText("" + playerHP);
		
		townGate();
	}
	
	public void townGate(){
		position = "townGate";
		mainTextArea.setText("isian dalam cerita/ ceritanya");
	
		choice1.setText("pilih1");
		choice2.setText("pilih2");
		choice3.setText("pilih3");
		choice4.setText("");
	}
	
	public void talkGuard(){
		position = "talkGuard";
		mainTextArea.setText("isian dalam cerita/ ceritanya");
		
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	
	public class TitleScreenHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			createGameScreen();
			
		}
	}
	
	public class ChoiceHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String yourChoice = event.getActionCommand();
			
			switch(position){
			case "townGate":
				switch(yourChoice){
				case "c1": talkGuard(); break;
				case "c2": break;
				case "c3": break;
				case "c4": break;
				}	
				break;
			case "talkGuard":
			switch(yourChoice){
				case "c1": townGate(); break;
				}
			}
		}
	}	
	
	public static void main(String[] args) {
		new VisualNovel();
	}

}