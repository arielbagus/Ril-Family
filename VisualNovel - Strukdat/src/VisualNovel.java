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
	JPanel titleNamePanel, nextButtonPanel, startButtonPanel, mainTextPanel, choiceButtonPanel, mainTextPanel1, choiceButtonPanel1, mainTextPanel2, choiceButtonPanel2;
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

		position = "VisualNovel";
		
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
		pictureLabel6 = new JLabel(picture6);
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
		pictureLabel6 = new JLabel(picture6);
		pictureLabel6.setBounds(25, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Pada hari itu, saya ingin mengambil sepeda motor yang berada di parkiran dekat masjid UMM. Saya Bersama teman saya yakni Jibril kemudian teman saya datang.");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);

		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel6);
		con.add(pictureLabel5);
		
	}
	
	public void Option2_Lanjut(){
		position = "Option2_Lanjut";

		mainTextPanel1.setVisible(false);
		pictureLabel6.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Adriel(1).png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-280, -55, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Dome.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Irsyad2.png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(280, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Syad, aku gonceng yo ikut ke kosmu");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
		
	}
	
	public void Option2_Lanjut1(){
		position = "Option2_Lanjut1";

		mainTextPanel.setVisible(false);
		pictureLabel.setVisible(false);
		pictureLabel2.setVisible(false);
		pictureLabel3.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Adriel2.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -55, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Dome.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Loh, aku sudah bareng Jibril dril. Coba kamu tanya ke Ariel biasanya kan bawa sepeda motor");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
	}
	
	public void Option2_Lanjut2(){
		position = "Option2_Lanjut2";

		mainTextPanel1.setVisible(false);
		pictureLabel7.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Adriel(1).png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-280, -55, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Dome.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Irsyad2.png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(280, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Udah coba kuchat tadi masih belum dibales, gimana ini yo?");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
		
	}
	
	public void Option2_Lanjut3(){
		position = "Option2_Lanjut3";

		mainTextPanel.setVisible(false);
		pictureLabel.setVisible(false);
		pictureLabel2.setVisible(false);
		pictureLabel3.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Jibril(1).png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Dome.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Adriel2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -55, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Udah gampang, gonceng tiga aja ayo.");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
	}
	
	public void Option2_Lanjut4(){
		position = "Option2_Lanjut4";

		mainTextPanel1.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel7.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Adriel(1).png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-280, -55, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Dome.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Irsyad2.png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(280, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Oke, aku iya aja. Irsyad gimana?");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
	}
	
	public void Option2_Lanjut5(){
		position = "Option2_Lanjut5";

		mainTextPanel.setVisible(false);
		pictureLabel.setVisible(false);
		pictureLabel2.setVisible(false);
		pictureLabel3.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Adriel2.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -55, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Dome.jpg"));
		pictureLabel5 = new JLabel(picture2);
		pictureLabel5.setSize(1024, 709);
		
		picture6 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel6 = new JLabel(picture6);
		pictureLabel6.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Yaudah ayo gas.");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel6);
		con.add(pictureLabel5);
	}
	
	public void Option2_Lanjut6(){
		position = "Option2_Lanjut6";

		mainTextPanel1.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel6.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Dome.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(25, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Akhirnya Irsyad berserta kedua temannya pulang dengan berbonceng tiga. Mereka akan menuju kos Irsyad yang terletak dibelakang kampus, mereka ingin melewati daerah dome. Akan tetapi, ditegur oleh pak satpam yang berada disana. Dan akhirnya mereka pun balik melewati sengkaling.");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
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

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel6);
		con.add(pictureLabel5);

	}
	
	public void Option3_Lanjut() {

		position = "Option3_Lanjut";

		mainTextPanel1.setVisible(false);
		choiceButtonPanel.setVisible(false);
		pictureLabel6.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/ICT.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Jibril2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Bril, gimana ini? Sepeda motorku masih ada di parkiran 3 sekarang sudah jam 22.00 WIB. Digembok ndak ya motorku sama Parkirnya?.");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
		
	}
	
	public void Option3_Lanjut1(){
		position = "Option3_Lanjut1";

		mainTextPanel1.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel5.setVisible(false);
		pictureLabel7.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad2.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-280, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/ICT.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Jibril(1).png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(280, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Wah gatau juga syad, harusnya sih udah digembok. Kan bates Parkir cuman sampai jam 21.00 WIB. Ayo coba diliat dulu diparkiran syad");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
		
	}
	
	public void Option3_Lanjut2(){
		position = "Option3_Lanjut2";

		mainTextPanel.setVisible(false);
		pictureLabel.setVisible(false);
		pictureLabel2.setVisible(false);
		pictureLabel3.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/ICT.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Jibril2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Yaudah ayo temenin");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
	}
	
	public void Option3_Lanjut3(){
		position = "Option3_Lanjut3";

		mainTextPanel1.setVisible(false);
		pictureLabel7.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(25, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Akhirnya Jibril menemani Irsyad untuk melihat keadaan motornya. Namun, motor tersebut telah digembok pada saat mereka melihatnya. Irsyad pun pulang ke kosnya dengan diantar oleh Jibril");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel2);
		
	}
	
	public void Option4() {

		position = "Option4";

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

		mainTextPanel1.setVisible(false);
		choiceButtonPanel.setVisible(false);
		pictureLabel6.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Jibril2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Bril, gimana ini jawabannya? Aku kesusahan disoal ini.");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
		
	}
	
	public void Option1A_Lanjut(){
		position = "Option1A_Lanjut";

		mainTextPanel1.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel5.setVisible(false);
		pictureLabel7.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad2.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-280, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Jibril(1).png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(280, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Aku juga gatau syad, gimana kalo gini aja. Tugasnya ditaruh dulu, sekarang kita berangkat ke paralayang?");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
		
	}
	
	public void Option1A_Lanjut1(){
		position = "Option1A_Lanjut1";

		mainTextPanel.setVisible(false);
		pictureLabel.setVisible(false);
		pictureLabel2.setVisible(false);
		pictureLabel3.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Jibril2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Loh, beneran tah bril sekarang? Sudah malem ini");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
	}
	
	public void Option1A_Lanjut2(){
		position = "Option1A_Lanjut2";

		mainTextPanel1.setVisible(false);
		pictureLabel7.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad2.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-280, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel2 = new JLabel(picture5);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Jibril(1).png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(280, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Ya jelas sekarang dong, diajak aja itu anak – anak semua");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
		
	}
	
	public void Option1A_Lanjut3(){
		position = "Option1A_Lanjut3";

		mainTextPanel.setVisible(false);
		pictureLabel.setVisible(false);
		pictureLabel2.setVisible(false);
		pictureLabel3.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Jibril2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Oke, kuajak dulu anak - anak");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
	}
	
	public void Option1A_Lanjut4(){
		
		position = "Option1A_Lanjut4";

		mainTextPanel1.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel7.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(25, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Setelah Irsyad bertanya kepada teman – temannya semua menyetujui hal tersebut dan kemudian mereka semua berangkat ke paralayang dengan meninggalkan tugas yang belum selesai tersebut");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel2);
		
	}
	
	public void Option1B() {
		position = "Option1B";

		mainTextPanel1.setVisible(false);
		choiceButtonPanel.setVisible(false);
		pictureLabel6.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Ariel2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Ril, gimana ini jawabannya? Aku kesusahan disoal ini.");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
		
	}
	
	public void Option1B_Lanjut(){
		position = "Option1B_Lanjut";

		mainTextPanel1.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel5.setVisible(false);
		pictureLabel7.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad2.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-280, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Ariel(1).png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(280, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Aku juga gatau syad, gimana kalo gini aja. Tugasnya ditaruh dulu, sekarang kita main PES dulu bareng anak - anak?");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
		
	}
	
	public void Option1B_Lanjut1(){
		position = "Option1B_Lanjut1";

		mainTextPanel.setVisible(false);
		pictureLabel.setVisible(false);
		pictureLabel2.setVisible(false);
		pictureLabel3.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Ariel2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Loh, Nanggung ini kurang sedikit lagi");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
	}
	
	public void Option1B_Lanjut2(){
		position = "Option1B_Lanjut2";

		mainTextPanel1.setVisible(false);
		pictureLabel7.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad2.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-280, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel2 = new JLabel(picture5);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Ariel(1).png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(280, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Ajak aja itu anak – anak semua");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
		
	}
	
	public void Option1B_Lanjut3(){
		position = "Option1B_Lanjut3";

		mainTextPanel.setVisible(false);
		pictureLabel.setVisible(false);
		pictureLabel2.setVisible(false);
		pictureLabel3.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Ariel2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Oke, kuajak dulu anak - anak");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
	}
	
	public void Option1B_Lanjut4(){
		
		position = "Option1B_Lanjut4";

		mainTextPanel1.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel7.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(25, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Setelah Irsyad bertanya kepada teman – temannya semua menyetujui hal tersebut dan kemudian mereka semua bermain PES hingga larut malam tanpa menyelesaikan tugas tersebut");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel2);
		
	}
	
	public void Option1C() {
		position = "Option1C";

		mainTextPanel1.setVisible(false);
		choiceButtonPanel.setVisible(false);
		pictureLabel6.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Adriel2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Dril, gimana ini jawabannya? Aku kesusahan disoal ini.");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
		
	}
	
	public void Option1C_Lanjut(){
		position = "Option1C_Lanjut";

		mainTextPanel1.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel5.setVisible(false);
		pictureLabel7.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad2.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-280, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Adriel(1).png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(280, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Sek sek  syad, live ig dulu");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
		
	}
	
	public void Option1C_Lanjut1(){
		position = "Option1C_Lanjut1";

		mainTextPanel.setVisible(false);
		pictureLabel.setVisible(false);
		pictureLabel2.setVisible(false);
		pictureLabel3.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Adriel2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Loh heh, nanggung ini kurang sedikit lagi");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
	}
	
	public void Option1C_Lanjut2(){
		position = "Option1C_Lanjut2";

		mainTextPanel1.setVisible(false);
		pictureLabel7.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad2.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-280, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel2 = new JLabel(picture5);
		pictureLabel2.setSize(1024, 709);
		
		picture3 = new ImageIcon(this.getClass().getResource("/Adriel(1).png"));
		pictureLabel3 = new JLabel(picture3);
		pictureLabel3.setBounds(280, -40, 1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Ditinggal aja dulu syad, istirahat aja dulu");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel3);
		con.add(pictureLabel2);
		
	}
	
	public void Option1C_Lanjut3(){
		position = "Option1C_Lanjut3";

		mainTextPanel.setVisible(false);
		pictureLabel.setVisible(false);
		pictureLabel2.setVisible(false);
		pictureLabel3.setVisible(false);
		
		picture4 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel4 = new JLabel(picture4);
		pictureLabel4.setBounds(-280, -40, 1024, 709);
		
		picture5 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Adriel2.png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(280, -40, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Okedeh, tak istirahat dulu");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel4);
		con.add(pictureLabel7);
		con.add(pictureLabel5);
	}
	
	public void Option1C_Lanjut4(){
		
		position = "Option1C_Lanjut4";

		mainTextPanel1.setVisible(false);
		pictureLabel4.setVisible(false);
		pictureLabel7.setVisible(false);
		pictureLabel5.setVisible(false);
		
		picture = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(25, -40, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Kos.jpg"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setSize(1024, 709);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(120, 320, 750, 170);
		mainTextPanel.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(120, 320, 750, 250);
		mainTextArea.setText("Karena irsyad tidak dapat menemukan jawaban tersebut akhirnya irsyad pun beristirahat sejenak, dan akhirnya ketiduran pada saat itu");
		mainTextArea.setForeground(Color.black);
		mainTextArea.setOpaque(false);
		mainTextArea.setFont(startButtonFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel2);
		
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

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel6);
		con.add(pictureLabel5);

	}

	public void End1() {

		position = "End1";

		pictureLabel5.setVisible(false);
		pictureLabel6.setVisible(false);
		mainTextPanel1.setVisible(false);
		
		picture5 = new ImageIcon(this.getClass().getResource("/GKB 1.jpg"));
		pictureLabel5 = new JLabel(picture5);
		pictureLabel5.setSize(1024, 709);

		picture6 = new ImageIcon(this.getClass().getResource("/Irsyad.png"));
		pictureLabel6 = new JLabel(picture6);
		pictureLabel6.setBounds(110, -45, 1024, 709);
		
		picture = new ImageIcon(this.getClass().getResource("/Jibril(1).png"));
		pictureLabel = new JLabel(picture);
		pictureLabel.setBounds(-380, -45, 1024, 709);
		
		picture2 = new ImageIcon(this.getClass().getResource("/Adriel(1).png"));
		pictureLabel2 = new JLabel(picture2);
		pictureLabel2.setBounds(350, -55, 1024, 709);
		
		picture7 = new ImageIcon(this.getClass().getResource("/Ariel(1).png"));
		pictureLabel7 = new JLabel(picture7);
		pictureLabel7.setBounds(-140, -53, 1024, 709);

		mainTextPanel1 = new JPanel();
		mainTextPanel1.setBounds(120, 320, 750, 170);
		mainTextPanel1.setBackground(new Color(201, 194, 194, 80));
		
		mainTextArea1 = new JTextArea();
		mainTextArea1.setBounds(120, 320, 750, 250);
		mainTextArea1.setText("Terima kasih telah mengikuti kisah saya. ");
		mainTextArea1.setForeground(Color.black);
		mainTextArea1.setOpaque(false);
		mainTextArea1.setFont(startButtonFont);
		mainTextArea1.setLineWrap(true);
		mainTextArea1.setWrapStyleWord(true);
		mainTextArea1.setEditable(false);
		mainTextPanel1.add(mainTextArea1);

		nextButtonPanel = new JPanel(new BorderLayout());
		nextButtonPanel.setBounds(710, 460, 200, 100);
		nextButtonPanel.setOpaque(false);

		nextButton = new JButton("Selanjutnya");
		nextButton.setFont(startButtonFont);
		nextButton.setForeground(Color.white);
		nextButton.setOpaque(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.addActionListener(choiceHandler);
		nextButton.setActionCommand("c1");
		
		nextButtonPanel.add(nextButton);
		
		con.add(mainTextPanel1);
		con.add(nextButtonPanel);
		con.add(pictureLabel);
		con.add(pictureLabel2);
		con.add(pictureLabel6);
		con.add(pictureLabel7);
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
			
			case "Option1A":
				switch (yourChoice) {
				case "c1":
					Option1A_Lanjut();
					break;
				}
				break;	
				
			case "Option1A_Lanjut":
				switch (yourChoice) {
				case "c1":
					Option1A_Lanjut1();
					break;
				}
				break;	
				
			case "Option1A_Lanjut1":
				switch (yourChoice) {
				case "c1":
					Option1A_Lanjut2();
					break;
				}
				break;	
				
			case "Option1A_Lanjut2":
				switch (yourChoice) {
				case "c1":
					Option1A_Lanjut3();
					break;
				}
				break;	
			
			case "Option1A_Lanjut3":
				switch (yourChoice) {
				case "c1":
					Option1A_Lanjut4();
					break;
				}
				break;	
				
			case "Option1B":
				switch (yourChoice) {
				case "c1":
					Option1B_Lanjut();
					break;
				}
				break;	
				
			case "Option1B_Lanjut":
				switch (yourChoice) {
				case "c1":
					Option1B_Lanjut1();
					break;
				}
				break;	
				
			case "Option1B_Lanjut1":
				switch (yourChoice) {
				case "c1":
					Option1B_Lanjut2();
					break;
				}
				break;	
				
			case "Option1B_Lanjut2":
				switch (yourChoice) {
				case "c1":
					Option1B_Lanjut3();
					break;
				}
				break;	
			
			case "Option1B_Lanjut3":
				switch (yourChoice) {
				case "c1":
					Option1B_Lanjut4();
					break;
				}
				break;	
			
			case "Option1C":
				switch (yourChoice) {
				case "c1":
					Option1C_Lanjut();
					break;
				}
				break;	
				
			case "Option1C_Lanjut":
				switch (yourChoice) {
				case "c1":
					Option1C_Lanjut1();
					break;
				}
				break;	
				
			case "Option1C_Lanjut1":
				switch (yourChoice) {
				case "c1":
					Option1C_Lanjut2();
					break;
				}
				break;	
				
			case "Option1C_Lanjut2":
				switch (yourChoice) {
				case "c1":
					Option1C_Lanjut3();
					break;
				}
				break;	
			
			case "Option1C_Lanjut3":
				switch (yourChoice) {
				case "c1":
					Option1C_Lanjut4();
					break;
				}
				break;
				
			case "Option1D":
				switch (yourChoice) {
				case "c1":
					End1();
					break;
				}
				break;
			
			case "End1":
				switch (yourChoice) {
				case "c1":
					break;
				}
				break;	
				
			case "Option2":
				switch (yourChoice) {
				case "c1":
					Option2_Lanjut();
					break;
				}
				break;
			
			case "Option2_Lanjut":
				switch (yourChoice) {
				case "c1":
					Option2_Lanjut1();
					break;
				}
				break;	
				
			case "Option2_Lanjut1":
				switch (yourChoice) {
				case "c1":
					Option2_Lanjut2();
					break;
				}
				break;	
				
			case "Option2_Lanjut2":
				switch (yourChoice) {
				case "c1":
					Option2_Lanjut3();
					break;
				}
				break;	
				
			case "Option2_Lanjut3":
				switch (yourChoice) {
				case "c1":
					Option2_Lanjut4();
					break;
				}
				break;	
			
			case "Option2_Lanjut4":
				switch (yourChoice) {
				case "c1":
					Option2_Lanjut5();
					break;
				}
				break;	
				
			case "Option2_Lanjut5":
				switch (yourChoice) {
				case "c1":
					Option2_Lanjut6();
					break;
				}
				break;	
				
			case "Option2_Lanjut6":
				switch (yourChoice) {
				case "c1":
					break;
				}
				break;	
			
			case "Option3":
				switch (yourChoice) {
				case "c1":
					Option3_Lanjut();
					break;
				}
				break;
			
			case "Option3_Lanjut":
				switch (yourChoice) {
				case "c1":
					Option3_Lanjut1();
					break;
				}
				break;	
				
			case "Option3_Lanjut1":
				switch (yourChoice) {
				case "c1":
					Option3_Lanjut2();
					break;
				}
				break;	
				
			case "Option3_Lanjut2":
				switch (yourChoice) {
				case "c1":
					Option3_Lanjut3();
					break;
				}
				break;	
				
			case "Option3_Lanjut3":
				switch (yourChoice) {
				case "c1":
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