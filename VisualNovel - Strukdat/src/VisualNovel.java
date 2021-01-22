import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.border.Border;

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
	String weapon, position, text1;
	int i = 0;
	
	Border orangeLine = BorderFactory.createLineBorder(Color.orange);
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceFirstHandler choiceFirst = new ChoiceFirstHandler();
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
		
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		pictureLabel.setVisible(false);
		
		picture3 = new ImageIcon(this.getClass().getResource("/04.jpg"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setSize(800, 600);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(17, 395, 750, 125);
		mainTextPanel.setOpaque(false);
		
		text1 = "Perkenalkan, nama saya M. Irsyad Yanuardi. "
				+ "Saya merupakan seorang mahasiswa di Universitas Muhammadiyah Malang jurusan Informatika. "
				+ "Apa yang ingin kau ketahui?";
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(17, 395, 750, 125);
		mainTextArea.setOpaque(false);
		mainTextArea.setForeground(Color.black);
		mainTextArea.setBorder(orangeLine);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(17, 150, 750, 125);
		choiceButtonPanel.setOpaque(false);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		
		choice1 = new JButton("Apa saja");
		choice1.setOpaque(false);
		choice1.setForeground(Color.black);
		choice1.setFont(NormalFont);
		choice1.setBorder(orangeLine);
		choice1.setContentAreaFilled(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		
		choice2 = new JButton("Tidak ada");
		choice2.setForeground(Color.black);
		choice2.setFont(NormalFont);
		choice2.setBorder(orangeLine);
		choice2.setContentAreaFilled(false);
		choice2.setOpaque(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		
		choice3 = new JButton("Cerita ketika mengerjakan tugas");
		choice3.setForeground(Color.black);
		choice3.setFont(NormalFont);
		choice3.setBorder(orangeLine);
		choice3.setContentAreaFilled(false);
		choice3.setOpaque(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		
		choice4 = new JButton("Cerita ketika kuliah");
		choice4.setForeground(Color.black);
		choice4.setFont(NormalFont);
		choice4.setBorder(orangeLine);
		choice4.setContentAreaFilled(false);
		choice4.setOpaque(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
//		playerPanel = new JPanel();
//		playerPanel.setBounds(100, 15, 600, 50);
//		playerPanel.setBackground(Color.black);;
//		playerPanel.setLayout(new GridLayout(1,4));
//		con.add(playerPanel);
//		hpLabel = new JLabel("percobaan:");
//		hpLabel.setFont(NormalFont);
//		hpLabel.setForeground(Color.white);
//		playerPanel.add(hpLabel);
//		hpLabelNumber = new JLabel();
//		hpLabelNumber.setFont(NormalFont);
//		hpLabelNumber.setForeground(Color.white);
//		playerPanel.add(hpLabelNumber);
//		weaponLabel = new JLabel("Weapon:");
//		weaponLabel.setFont(NormalFont);
//		weaponLabel.setForeground(Color.white);
//		playerPanel.add(weaponLabel);
//		weaponLabelName = new JLabel();
//		weaponLabelName.setFont(NormalFont);
//		weaponLabelName.setForeground(Color.white);
//		playerPanel.add(weaponLabelName);
		
		timer1.start();
		
		con.add(mainTextPanel);
		con.add(choiceButtonPanel);
		con.add(pictureLabel3);
		
	}
	
	Timer timer1 = new Timer(100, new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			
			char character[] = text1.toCharArray();
			int arrayNumber = character.length;
			
			String addedCharacter = "";
			String blank = "";
			
			addedCharacter = blank + character[i];
			
			mainTextArea.append(addedCharacter);
			
			i++;
			
			if(i == arrayNumber) {
				i = 0;
				timer1.stop();
			}
		}
		
	});
	
	public void choiceFirst() {
		//Buat nampilin pilihan setelah text selesai
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
	
	public class ChoiceFirstHandler implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			
			choiceFirst();
			
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