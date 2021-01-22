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
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
	JLabel titleNameLabel, pictureLabel, pictureLabel2, pictureLabel3, pictureLabel4;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font startButtonFont = new Font("Times New Roman", Font.PLAIN, 28);
	Font NormalFont = new Font("Times New Roman", Font.PLAIN, 18);
	JButton startButton, nextButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	ImageIcon picture, picture2, picture3, picture4;
	String position, text1;
	int i = 0;

	Border orangeLine = BorderFactory.createLineBorder(Color.orange);

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

		picture = new ImageIcon(this.getClass().getResource("/Legend.jpg"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setSize(1024, 709);

		startButtonPanel = new JPanel(new BorderLayout());
		startButtonPanel.setBounds(755, 250, 200, 100);
		startButtonPanel.setOpaque(false);

		startButton = new JButton("Mulai");
		startButton.setFont(startButtonFont);
		startButton.setForeground(Color.white);
		startButton.setBackground(Color.white);
		startButton.addActionListener(tsHandler);
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);

		startButtonPanel.add(startButton);

		con.add(startButtonPanel);
		con.add(pictureLabel);

	}

	public void createGameScreen() {

		position = "Layar1";

		startButtonPanel.setVisible(false);
		pictureLabel.setVisible(false);

		picture3 = new ImageIcon(this.getClass().getResource("/GKB 1.jpg"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setSize(1152, 798);

		picture4 = new ImageIcon(this.getClass().getResource("Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(50, 10, 1560, 1080);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(450, 555, 750, 125);
		mainTextPanel.setOpaque(false);

		text1 = "Perkenalkan, nama saya M. Irsyad Yanuardi. "
				+ "Saya merupakan seorang mahasiswa di Universitas Muhammadiyah Malang jurusan Informatika. "
				+ "Apa yang ingin kau ketahui?";

		mainTextArea = new JTextArea();
		mainTextArea.setBounds(450, 555, 750, 125);
		mainTextArea.setOpaque(false);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setBackground(new Color (181, 175, 175));
		mainTextArea.setBorder(orangeLine);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(450, 700, 750, 125);
		choiceButtonPanel.setOpaque(false);
		choiceButtonPanel.setLayout(new GridLayout(4, 1));

		choice1 = new JButton("Apa saja");
		choice1.setOpaque(false);
		choice1.setForeground(Color.white);
		choice1.setBackground(new Color (181, 175, 175));
		choice1.setFont(NormalFont);
		choice1.setBorder(orangeLine);
		choice1.setContentAreaFilled(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);

		choice2 = new JButton("Tidak ada");
		choice2.setForeground(Color.white);
		choice2.setFont(NormalFont);
		choice2.setBorder(orangeLine);
		choice2.setContentAreaFilled(false);
		choice2.setOpaque(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);

		choice3 = new JButton("Cerita ketika mengerjakan tugas");
		choice3.setForeground(Color.white);
		choice3.setFont(NormalFont);
		choice3.setBorder(orangeLine);
		choice3.setContentAreaFilled(false);
		choice3.setOpaque(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);

		choice4 = new JButton("Cerita ketika kuliah");
		choice4.setForeground(Color.white);
		choice4.setFont(NormalFont);
		choice4.setBorder(orangeLine);
		choice4.setContentAreaFilled(false);
		choice4.setOpaque(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);

		timer1.start();

		con.add(pictureLabel4);
		con.add(mainTextPanel);
		con.add(choiceButtonPanel);
		con.add(pictureLabel3);

	}

	Timer timer1 = new Timer(100, new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {

			char character[] = text1.toCharArray();
			int arrayNumber = character.length;

			String addedCharacter = "";
			String blank = "";

			addedCharacter = blank + character[i];

			mainTextArea.append(addedCharacter);

			i++;

			if (i == arrayNumber) {
				i = 0;
				timer1.stop();
			}
		}

	});

	public void Layar2() {

		position = "Layar2";
		mainTextArea.setText("Ini layar 2");

		choice1.setText("Jibril");
		choice2.setText("Adriel");
		choice3.setText("Ariel");
		choice4.setText("Irsyad");

	}

	public void Layar3() {

		position = "Layar3";
		mainTextArea.setText("Ini layar 3");

		choice1.setText("Jibril");
		choice2.setText("Adriel");
		choice3.setText("Ariel");
		choice4.setText("Irsyad");

	}

	public class TitleScreenHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			createGameScreen();

		}
	}

	public class ChoiceHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			String yourChoice = event.getActionCommand();

			switch (position) {
			case "Layar1":
				switch (yourChoice) {
				case "c1":
					Layar2();
					break;
				case "c2":
					Layar3();
					break;
				case "c3":
					break;
				case "c4":
					break;
				}
				break;
				
			case "Layar2":
				switch (yourChoice) {
				case "c1":
					Layar3();
					break;
				case "c2":
					Layar2();
					break;
				case "c3":
					break;
				case "c4":
					break;
				}
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("coba");
		new VisualNovel();
	}

}