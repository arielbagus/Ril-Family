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
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, mainTextPanel1, choiceButtonPanel1, mainTextPanel2, choiceButtonPanel2;
	JLabel titleNameLabel, pictureLabel, pictureLabel2, pictureLabel3, pictureLabel4, pictureLabel5, pictureLabel6,
	pictureLabel7, pictureLabel8;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font startButtonFont = new Font("Times New Roman", Font.PLAIN, 28);
	Font NormalFont = new Font("Times New Roman", Font.PLAIN, 18);
	JButton startButton, nextButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea, mainTextArea1, mainTextArea2;
	ImageIcon picture, picture2, picture3, picture4, picture5, picture6, picture7, picture8;
	String position, text1;

	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();

	public VisualNovel() {

		window = new JFrame("Visual Novel");
		window.setSize(1024, 709);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		con = window.getContentPane();

		picture = new ImageIcon(this.getClass().getResource("/Legend.jpg"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setSize(1024, 709);

		startButtonPanel = new JPanel(new BorderLayout());
		startButtonPanel.setBounds(457, 150, 200, 100);
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
		pictureLabel3.setSize(1024, 709);

		picture4 = new ImageIcon(this.getClass().getResource("Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(25, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 105);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 125);
		mainTextArea.setText("Perkenalkan, nama saya M. Irsyad Yanuardi. "
				+ "Saya merupakan seorang mahasiswa di Universitas Muhammadiyah Malang jurusan Informatika. "
				+ "Apa yang ingin anda ketahui?");
		mainTextArea.setBackground(new Color(201, 194, 194, 80));
		mainTextArea.setForeground(Color.black);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(120, 450, 750, 125);
		choiceButtonPanel.setBackground(new Color(201, 194, 194, 80));
		choiceButtonPanel.setLayout(new GridLayout(4, 1));

		choice1 = new JButton("Hal yang menyenangkan");
		choice1.setForeground(Color.black);
		choiceButtonPanel.setBackground(new Color(201, 194, 194, 80));
		choice1.setFont(NormalFont);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		choiceButtonPanel.add(choice1);

		choice2 = new JButton("Hal yang menegangkan");
		choice2.setForeground(Color.black);
		choice2.setFont(NormalFont);
		choiceButtonPanel.setBackground(new Color(201, 194, 194, 80));
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);

		choice3 = new JButton("Hal yang menyedihkan");
		choice3.setForeground(Color.black);
		choice3.setFont(NormalFont);
		choiceButtonPanel.setBackground(new Color(201, 194, 194, 80));
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);

		choice4 = new JButton("Tidak ada. Terima Kasih");
		choice4.setForeground(Color.black);
		choice4.setFont(NormalFont);
		choiceButtonPanel.setBackground(new Color(201, 194, 194, 80));
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);

		con.add(pictureLabel4);
		con.add(mainTextPanel);
		con.add(choiceButtonPanel);
		con.add(pictureLabel3);

	}

	public void Option1() {

		position = "Option1";

		pictureLabel3.setVisible(false);
		pictureLabel4.setVisible(false);
		mainTextPanel.setVisible(false);
		choiceButtonPanel.setVisible(false);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);

		picture6 = new ImageIcon(this.getClass().getResource("Irsyad.png"));
		pictureLabel6 = new JLabel(picture4);
		pictureLabel6.setBounds(25, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Pada waktu itu, setelah aku dan teman – temanku kuliah dari "
				+ "pagi hingga sore hari kami berkumpul di kosku untuk mengerjakan "
				+ "suatu tugas. Kemudian Ketika sedang mengerjakan tugas aku menemukan "
				+ "kesusahan dan kemudian bertanya kepada temanku. (Pilih teman Irsyad)");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(120, 510, 750, 125);
		choiceButtonPanel.setBackground(new Color(201, 194, 194, 80));
		choiceButtonPanel.setLayout(new GridLayout(4, 1));

		choice1 = new JButton("Jibril");
		choice1.setForeground(Color.black);
		choiceButtonPanel.setBackground(new Color(201, 194, 194, 80));
		choice1.setFont(NormalFont);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
		choiceButtonPanel.add(choice1);

		choice2 = new JButton("Ariel");
		choice2.setForeground(Color.black);
		choice2.setFont(NormalFont);
		choiceButtonPanel.setBackground(new Color(201, 194, 194, 80));
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);

		choice3 = new JButton("Adriel");
		choice3.setForeground(Color.black);
		choice3.setFont(NormalFont);
		choiceButtonPanel.setBackground(new Color(201, 194, 194, 80));
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);

		choice4 = new JButton("Irsyad");
		choice4.setForeground(Color.black);
		choice4.setFont(NormalFont);
		choiceButtonPanel.setBackground(new Color(201, 194, 194, 80));
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);

		con.add(mainTextPanel1);
		con.add(choiceButtonPanel);
		con.add(pictureLabel6);
		con.add(pictureLabel5);
		
	}

	public void Option2() {

		position = "Option2";

		pictureLabel3.setVisible(false);
		pictureLabel4.setVisible(false);
		mainTextPanel.setVisible(false);
		choiceButtonPanel.setVisible(false);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Dome.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);

		picture6 = new ImageIcon(this.getClass().getResource("Irsyad.png"));
		pictureLabel6 = new JLabel(picture4);
		pictureLabel6.setBounds(25, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Pada hari itu, saya ingin mengambil sepeda motor "
				+ "yang berada di parkiran dekat masjid UMM. "
				+ "Saya Bersama teman saya yakni Jibril kemudian teman saya datang.");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		con.add(mainTextPanel1);
		con.add(choiceButtonPanel);
		con.add(pictureLabel6);
		con.add(pictureLabel5);

	}
	
	public void Option3() {

		position = "Option3";

		pictureLabel3.setVisible(false);
		pictureLabel4.setVisible(false);
		mainTextPanel.setVisible(false);
		choiceButtonPanel.setVisible(false);
		
		picture5 = new ImageIcon(this.getClass().getResource("/ICT.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);

		picture6 = new ImageIcon(this.getClass().getResource("Irsyad.png"));
		pictureLabel6 = new JLabel(picture4);
		pictureLabel6.setBounds(25, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Pada hari itu, saya Bersama teman – teman mengerjakan tugas di daerah ICT. "
				+ "Tanpa sadar waktu telah menunjukkan pukul 22.00 WIB "
				+ "dan Irsyad pun teringat akan motornya yang masih berada diparkiran 1. Kemudian, irsyad bertanya ke temannya");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		con.add(mainTextPanel1);
		con.add(choiceButtonPanel);
		con.add(pictureLabel6);
		con.add(pictureLabel5);

	}
	
	public void Option4() {

		position = "Option1";

		pictureLabel3.setVisible(false);
		pictureLabel4.setVisible(false);
		mainTextPanel.setVisible(false);
		choiceButtonPanel.setVisible(false);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kantin.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);

		picture6 = new ImageIcon(this.getClass().getResource("Irsyad.png"));
		pictureLabel6 = new JLabel(picture4);
		pictureLabel6.setBounds(25, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Oke sama – sama. Irsyad pun pergi untuk membeli makanan");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		con.add(mainTextPanel1);
		con.add(pictureLabel6);
		con.add(pictureLabel5);

	}
	
	public void Option1A() {

		position = "Option1A";

		pictureLabel5.setVisible(false);
		pictureLabel6.setVisible(false);
		mainTextPanel1.setVisible(false);
		choiceButtonPanel.setVisible(false);
		
		picture5 = new ImageIcon(this.getClass().getResource("/KOS.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);

		picture6 = new ImageIcon(this.getClass().getResource("Irsyad.png"));
		pictureLabel6 = new JLabel(picture4);
		pictureLabel6.setBounds(25, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Bril, gimana ini jawabannya? Aku kesusahan disoal ini");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		con.add(mainTextPanel1);
		con.add(pictureLabel6);
		con.add(pictureLabel5);
		
	}
	
	public void Option1B() {

		position = "Option1B";

		pictureLabel5.setVisible(false);
		pictureLabel6.setVisible(false);
		mainTextPanel1.setVisible(false);
		choiceButtonPanel.setVisible(false);
		
		picture5 = new ImageIcon(this.getClass().getResource("/KOS.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);

		picture6 = new ImageIcon(this.getClass().getResource("Irsyad.png"));
		pictureLabel6 = new JLabel(picture4);
		pictureLabel6.setBounds(25, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Ril, gimana ini jawabannya? Aku kesusahan disoal ini");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		con.add(mainTextPanel1);
		con.add(pictureLabel6);
		con.add(pictureLabel5);

	}
	
	public void Option1C() {

		position = "Option1C";

		pictureLabel5.setVisible(false);
		pictureLabel6.setVisible(false);
		mainTextPanel1.setVisible(false);
		choiceButtonPanel.setVisible(false);
		
		picture5 = new ImageIcon(this.getClass().getResource("/KOS.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);

		picture6 = new ImageIcon(this.getClass().getResource("Irsyad.png"));
		pictureLabel6 = new JLabel(picture4);
		pictureLabel6.setBounds(25, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Dril, gimana ini jawabannya? Aku kesusahan disoal ini");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		con.add(mainTextPanel1);
		con.add(pictureLabel6);
		con.add(pictureLabel5);

	}
	
	public void Option1D() {

		position = "Option1D";

		pictureLabel5.setVisible(false);
		pictureLabel6.setVisible(false);
		mainTextPanel1.setVisible(false);
		choiceButtonPanel.setVisible(false);
		
		picture5 = new ImageIcon(this.getClass().getResource("/KOS.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);

		picture6 = new ImageIcon(this.getClass().getResource("Irsyad.png"));
		pictureLabel6 = new JLabel(picture4);
		pictureLabel6.setBounds(25, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Irsyad memilih untuk beristirahat dan berniat untuk mengerjakan tugas tersebut di keesokan harinya.");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		con.add(mainTextPanel1);
		con.add(pictureLabel6);
		con.add(pictureLabel5);

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
					Option1();
					break;
				case "c2":
					Option2();
					break;
				case "c3":
					Option3();
					break;
				case "c4":
					Option4();
					break;
				}
				break;
				
			case "Option1":
				switch (yourChoice) {
				case "c1":
					Option1A();
					break;
				case "c2":
					Option1B();
					break;
				case "c3":
					Option1C();
					break;
				case "c4":
					Option1D();
					break;
				}
				break;
			}
		}
	}

	public static void main(String[] args) {
		new VisualNovel();
	}

}