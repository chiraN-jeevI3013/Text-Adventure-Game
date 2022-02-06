import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game 
{

	JFrame window;
	Container con;
	
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel1, playerPanel2;
	JLabel titleNameLabel, HPLabel, HPRemaining, weaponLabel, weaponName;
	JButton startButton, choiceButton1, choiceButton2, choiceButton3, choiceButton4;
	JTextArea mainTextArea;
	
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 100);
	Font gameStatFont  = new Font("Times New Roman", Font.PLAIN, 50);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 23);
	Font choiceFont = new Font("Times New Roman", Font.PLAIN, 20);
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	
	
	int HP = 20;
	String weapon;
	int weaponDamage = 0;
	String playerPosition;
	int morrisonHP = 20;
	int morrisonDamage = 5;
	
	boolean morrisonBlackCard = false;
	
	public static void main(String[] args) 
	{
		new Game();
	}

	public Game () 
	{
		//Creates a new window
		this.window = new JFrame();
		
		//Sets the size of window
		this.window.setSize(800, 600);
		
		//Adds a function to the window to close it - the X on every app-window
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//bg color
		this.window.getContentPane().setBackground(Color.black);
		//this.window.setBackground(Color.black); - NOT WORKING
		
		//disable default layout
		this.window.setLayout(null);
		
		//for making the window appear on the screen (this is how hackers/viruses attack pola by making this invisible..hmmmm...)
		this.window.setVisible(true);
		
		//
		this.con = this.window.getContentPane();
		
		//a Panel for title
		this.titleNamePanel = new JPanel();
		this.titleNamePanel.setBounds(100, 100, 600, 150);
		this.titleNamePanel.setBackground(Color.black);
		
		//label for title
		this.titleNameLabel = new JLabel("T.A.G.");
		this.titleNameLabel.setForeground(Color.cyan);
		this.titleNameLabel.setFont(this.titleFont);
		
		//placing titleLabel on titlePanel
		this.titleNamePanel.add(this.titleNameLabel);
		
		//placing the panel on container
		this.con.add(this.titleNamePanel);
		
		
		
		
		//panel for start button
		this.startButtonPanel = new JPanel();
		this.startButtonPanel.setBounds(300, 400, 200, 100);
		this.startButtonPanel.setBackground(Color.black);
		
		//button for start button
		this.startButton = new JButton("START");
		this.startButton.setBackground(Color.DARK_GRAY);
		this.startButton.setForeground(Color.white);
		this.startButton.setFont(this.normalFont);
		//adding a function to the button
		this.startButton.addActionListener(tsHandler);
		//removing the annoying 2nd border/outline for the button
		this.startButton.setFocusable(false);
		
		//placing startButton on startButtonPanel
		this.startButtonPanel.add(this.startButton);
		
		//placing startButtonPanel on container
		this.con.add(this.startButtonPanel);
		
	}
	
	
	public void createGameScreen() 
	{
		//MAIN TITLE SCREEN
		
		this.titleNamePanel.setVisible(false);
		this.startButtonPanel.setVisible(false);
		
		this.mainTextPanel = new JPanel();
		this.mainTextPanel.setBackground(Color.black);
		this.mainTextPanel.setBounds(50, 100, 700, 250);
		
		this.con.add(this.mainTextPanel);
		
		this.mainTextArea = new JTextArea("");
		this.mainTextArea.setBounds(50, 100, 700, 250);
		this.mainTextArea.setBackground(Color.black);
		this.mainTextArea.setForeground(Color.white);
		this.mainTextArea.setFont(normalFont);
		this.mainTextArea.setLineWrap(true);
		
		this.mainTextPanel.add(this.mainTextArea);
		
		
		
		//NEXT GAME SCREEN
		
		this.choiceButtonPanel = new JPanel();
		this.choiceButtonPanel.setBounds(150, 350, 500, 150);
		this.choiceButtonPanel.setBackground(Color.black);
		
		this.choiceButtonPanel.setLayout(new GridLayout(4,1));
		
		this.con.add(this.choiceButtonPanel);
		
		//choiceButtons 1,2,3,4
		this.choiceButton1 = new JButton("Choice 1");
		this.choiceButton1.setBackground(Color.black);
		this.choiceButton1.setForeground(Color.white);
		this.choiceButton1.setFont(choiceFont);
		this.choiceButton1.setFocusable(false);
		this.choiceButton1.addActionListener(choiceHandler);	//adding function to button
		this.choiceButton1.setActionCommand("c1");				//for recognizing its one particular button - jus like the id in javascript
		this.choiceButtonPanel.add(this.choiceButton1);
		//
		this.choiceButton2 = new JButton("Choice 2");
		this.choiceButton2.setBackground(Color.black);
		this.choiceButton2.setForeground(Color.white);
		this.choiceButton2.setFont(choiceFont);
		this.choiceButton2.setFocusable(false);
		this.choiceButton2.addActionListener(choiceHandler);	//adding function to button
		this.choiceButton2.setActionCommand("c2");				//for recognizing its one particular button - jus like the id in javascript
		this.choiceButtonPanel.add(this.choiceButton2);
		//
		this.choiceButton3 = new JButton("Choice 3");
		this.choiceButton3.setBackground(Color.black);
		this.choiceButton3.setForeground(Color.white);
		this.choiceButton3.setFont(choiceFont);
		this.choiceButton3.setFocusable(false);
		this.choiceButton3.addActionListener(choiceHandler);	//adding function to button
		this.choiceButton3.setActionCommand("c3");				//for recognizing its one particular button - jus like the id in javascript
		this.choiceButtonPanel.add(this.choiceButton3);
		//
		this.choiceButton4 = new JButton("");
		this.choiceButton4.setBackground(Color.black);
		this.choiceButton4.setForeground(Color.white);
		this.choiceButton4.setFont(choiceFont);
		this.choiceButton4.setFocusable(false);
		this.choiceButton4.addActionListener(choiceHandler);	//adding function to button
		this.choiceButton4.setActionCommand("c4");				//for recognizing its one particular button - jus like the id in javascript
		this.choiceButtonPanel.add(this.choiceButton4);
		
		
		//PLAYER STATS PANEL
		
		this.playerPanel1 = new JPanel();
		this.playerPanel1.setBounds(100, 15, 600, 50);
		this.playerPanel1.setLayout(new GridLayout(1, 4));
		this.playerPanel1.setBackground(Color.black);
		this.con.add(this.playerPanel1);
		/*
		this.playerPanel1 = new JPanel();
		this.playerPanel1.setBounds(100, 315, 300, 50);
		this.playerPanel1.setLayout(new GridLayout(1, 2));
		this.playerPanel1.setBackground(Color.darkGray);
		this.con.add(this.playerPanel2);
		*/
		this.HPLabel = new JLabel("HP:");
		this.HPLabel.setForeground(Color.white);
		this.HPLabel.setFont(normalFont);
		this.playerPanel1.add(this.HPLabel);
		
		this.HPRemaining = new JLabel();
		this.HPRemaining.setForeground(Color.white);
		this.HPRemaining.setFont(normalFont);
		this.playerPanel1.add(this.HPRemaining);
		
		this.weaponLabel = new JLabel("Weapon:");
		this.weaponLabel.setForeground(Color.white);
		this.weaponLabel.setFont(normalFont);
		this.playerPanel1.add(this.weaponLabel);
		
		this.weaponName = new JLabel();
		this.weaponName.setForeground(Color.white);
		this.weaponName.setFont(normalFont);
		this.playerPanel1.add(this.weaponName);
		
		this.playerSetup();
		
	}
	
	
	public void playerSetup() 
	{
		this.HP = 20;
		this.HPRemaining.setText("" + this.HP);
		
		this.weapon = "Unarmed";
		this.weaponName.setText(weapon);
		
		this.intro();
		
	}

	
	public void intro()
	{
		this.playerPosition = "intro";
		
		String s1 = "You’ve arrived at your friend’s bday party. \nYou're at the door.\n\n";
		String s2 = "On your right, you see a shady guy with a Ray-Ban and a black suit half hiding behind a tree and looking straight at you";
		String s3 = "";
		
		this.mainTextArea.setText(s1+s2);
	
		this.choiceButton1.setText("Dismiss him as some random creep & enter the party");
		this.choiceButton2.setText("Encounter the shady guy");
		this.choiceButton3.setText("Suspect he’s a kidnapper & call the cops");
		this.choiceButton4.setText("");
		
	}
	
	public void enterParty()
	{
		this.playerPosition = "enterParty";
		
		String s1 = "Your not so sober party-animal frens offer you drinks & brownies. \n\n";
		String s2 = "Behind them you glance upon that same shady guy standing and looking at you from the staircase.";
		
		this.mainTextArea.setText(s1+s2);
	
		this.choiceButton1.setText("Drink the offered alcohol");
		this.choiceButton2.setText("Refuse the alcohol and go for a Tropicana instead");
		this.choiceButton3.setText("Approach that guy and try to talk to him");
		this.choiceButton4.setText("");
	}
	
	public void wakeUpInRoom()
	{
		this.playerPosition = "wakeUpInRoom";
		
		String s1 = "You wake up handcuffed on a chair, in a small room that looks like a police investigation room that you've seen on crime thrillers.\n\n";
		String s2 = "There's even a large mirror in front of you which probably is used to see inside the room from the other side.\n";
		
		this.mainTextArea.setText(s1+s2);
	
		this.choiceButton1.setText("Look left");
		this.choiceButton2.setText("Look right");
		this.choiceButton3.setText("Scream for help");
		this.choiceButton4.setText("Break free from handcuffs");
	}
	
	
	public void callCops()
	{
		this.playerPosition = "callCops";
		
		String s1 = "You dial 911 and look at his direction. But there's no one, \n";
		String s2 = "He seems to have fled the scene.\n";
		
		this.mainTextArea.setText(s1 + s2);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void drinkAlcohol ()
	{	
		this.playerPosition = "drinkAlcohol";
					
		this.mainTextArea.setText("Drinking is injurious to health. \n\nYour HP takes 1 Damage.");
		
		this.HP--;
		this.HPRemaining.setText("" + this.HP);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void drinkTropicana()
	{
		this.playerPosition = "drinkTropicana";
		
		this.mainTextArea.setText("Was a sweet drink");
				
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void encounterShadyGuyOnStaircase()
	{
		this.playerPosition = "encounterShadyGuyOnStaircase";

		String s1 = "You go towards him and once he sees you're coming towards he quickly turns his back on you. \n";
		String s2 = "You go near him and tap his shoulder.\n\n";
		String s3 = "He immediately turns and sprays something on your face.\n";
		String s4 = "You feel dizzy and are about to hit the ground and he catches you.\n";
		String s5 = "Your eyes feel heavy and suddenly everything blacks out.";
		
		this.mainTextArea.setText(s1 + s2 + s3 + s4 + s5);
				
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}

	public void lookLeft()
	{
		this.playerPosition = "lookLeft";
		
		String s1 = "There’s a door with a knob of the kind that opens when twisted. But you are unable to reach it";
		
		this.mainTextArea.setText(s1);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void lookRight()
	{
		this.playerPosition = "lookRight";
		
		String s1 = "There’s a small pencil drawing of a 3 people which seems like a mother, father and a little girl with pigtails.\n";
		String s2 = "The drawing seems like it was erased in a hurry";
		
		this.mainTextArea.setText(s1+s2);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void screamForHelp()
	{
		this.playerPosition = "screamForHelp";
		
		String s1 = "You:(muffled screams) ‘HELP! HELP! ANYBODY \nTHERE? HELLOOO???’\n";
		String s2 = "(the classic kidnappee dialogue which you always cringed \nwhile watching Hollywood movies. ";
		String s3 = "But now when that movie is suddenly your life, \ndoesn't feel cringe anymore) \n\n";
		String s4 = "(...long silence...as expected no response...)";
		
		this.mainTextArea.setText(s1+s2+s3+s4);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void breakFreeFromHandcuffs()
	{
		this.playerPosition = "breakFreeFromHandcuffs";
		
		String s1 = "Using the training from all the youtube lifehack videos, you start twisting and turning your wrists in various angles.\n";
		String s2 = "You try your best to nudge your wrists free from the handcuffs\n\n";
		String s3 = "But the cuffs just do not seem to budge \n";
		
		this.mainTextArea.setText(s1+s2+s3);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void investigRoomDoorOpens1 ()
	{
		this.playerPosition = "investigRoomDoorOpens1";
		
		String s1 = "The door on your left unlocks and this time a lady in a grey suit enters with a file in her hand.\n\n";
		String s2 = "Her short and bald bodyguard with an unusually long tie and small sunglasses brings a chair and puts it infront of you.\n\n";
		String s3 = "She sits comfortably and smiles at you";
		
		this.mainTextArea.setText(s1+s2+s3);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void investigRoomDoorOpens2 ()
	{
		this.playerPosition = "investigRoomDoorOpens2";
		
		String s1 = "Suit Lady: \"Oh sorry I forgot to tell you. You see I really don’t like it when people say anything I don’t wanna hear. \" \n";
		String s2 = "Suit Lady: \"So some complementary facial-paralyzer that my boys made for their last summer project is kinda compulsory before meeting me. (laughs proudly)\" \n";
		String s3 = "Suit Lady: \"All right pretty face, let me cut to the chase on why you're here.\"\n";
		
		this.mainTextArea.setText(s1+s2+s3);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void investigRoomDoorOpens3 ()
	{
		this.playerPosition = "investigRoomDoorOpens3";
		
		String s1 = "Suit Lady: \"I'm gonn give you a small task, and you're gonn do that for me. All you need to know is that if you don’t, I’ll kill you.\" (smiles) \n\n";
		String s2 = "Suit Lady: \"As simple as that. Not your typical Holly big mouthed villian who wastes hell lot time in speaking chicken crap.\" \n";
		String s3 = "";
		
		this.mainTextArea.setText(s1+s2+s3);
		
		this.choiceButton1.setText(" \"GO TO HELL!\" ");
		this.choiceButton2.setText(" \"LEAVE ME ALONE!\" ");
		this.choiceButton3.setText(" \"PLEASE MA'AM LET ME GO!\" ");
		this.choiceButton4.setText("");
	}
	
	public void suitLadyLeaves()
	{
		this.playerPosition = "suitLadyLeaves";
		
		String s1 = "Suit Lady: \"Thas the spirit! (looks at that Bodyguard) See didn’t I tell ya this one’s a smortie?\" \n";
		String s2 = "Suit Lady: (looks at you) \"Aight chop chop! (looks at watch) Time to go, the Senator doesn’t like to wait.\" \n";
		String s3 = "Suit Lady: \"I mean who does right? (laughs) Kay so my deputy here Mr Morrison will explain what u gotta do.\" \n";
		String s4 = "Suit Lady: \"Aight ciao!\" (starts walking to the door)\n";
		String s5 = "(You managed to spit the cloth which was blocking your mouth)";
		
		
		this.mainTextArea.setText(s1+s2+s3+s4+s5);  
		
		this.choiceButton1.setText("Scream back at her to let you go");
		this.choiceButton2.setText("Try to escape");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void fight()
	{
		this.morrisonHP = 20;
		
		this.playerPosition = "fight";
		
		String s1 = "You rocked the chair and fell down. \nNow the chair is broken and you are free but handcuffs haven't budged. \n";
		String s2 = "Mr Morrison is coming towards you with a baton in his hand.\n";
		String s3 = "You see a piece of broken chair with a sharp edge which can be used as a weapon.\n\n";
		String s4 = "Mr Morrison HP: " + this.morrisonHP;
		
		this.mainTextArea.setText(s1+s2+s3+s4);
		
		this.choiceButton1.setText("Evade the attack");
		this.choiceButton2.setText("Headbutt Mr Morrison");
		this.choiceButton3.setText("Reach for the broken piece of Chair");
		this.choiceButton4.setText("");
	}
	
	public void evadeTheAttack()
	{
		this.playerPosition = "evadeTheAttack";
		
		String s1 = "You have successfully evaded Mr Morrison's attack by jumping across the room.\n\n";
		String s2 = "Mr Morrison missed and is now furiously coming towards you again.\n ";
		String s3 = "";
		
		this.mainTextArea.setText(s1+s2+s3);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	 	
	public void headbutt()
	{
		this.playerPosition = "headbutt";
		
		this.morrisonHP -= 5;
		
		String s1 = "You headbutted Mr Morrison on his stomach so hard that he hit the room's wall and fell down.\n";
		String s2 = "Mr Morrison rubs his head and slowly tries to get back on his feet.\n\n";
		String s3 = "Mr Morrison HP: " + this.morrisonHP;
		
		this.mainTextArea.setText(s1+s2+s3);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void reachForChairPiece()
	{
		this.playerPosition = "reachForChairPiece";
		
		this.weapon = "Sharp Wood";
		this.weaponName.setText(this.weapon);
		
		this.weaponDamage = 12;
		
		String s1 = "Now you have broken chair piece to defend yourself against Mr Morrsion and his baton.\n";
		String s2 = "";
		String s3 = "";
		
		this.mainTextArea.setText(s1+s2+s3);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
		
	}
	
	public void duel()
	{
		this.playerPosition = "duel";
		
		//this.morrisonHP = 
		
		//String s1 = "\n" + "Current Weapon: " + this.weapon + "\n";
		//String s2 = "Weapon Damage : " + this.weaponDamage;
		String s3 = "Mr Morrison HP: " + this.morrisonHP;
		
		this.mainTextArea.setText("\n\n"+s3);
		
		this.choiceButton1.setText("Light Attack");
		this.choiceButton2.setText("Heavy Attack");
		this.choiceButton3.setText("Evade");
		this.choiceButton4.setText("");
	}
	
	public void lightAttack()
	{
		this.playerPosition = "lightAttack";
		
		int damage = 0;
		
		if (this.weapon.equals("Unarmed"))
		{
			damage = new java.util.Random().nextInt(2);
		}
		else if (this.weapon.equals("Sharp Wood"))
		{
			damage = new java.util.Random().nextInt(6);
		}
		
		this.morrisonHP = this.morrisonHP- damage;
		
		String s1 = "You gave Mr Morrison " + damage + " Damage.\n";
		String s2 = "";
		String s3 = "";
		
		this.mainTextArea.setText(s1+s2+s3);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void heavyAttack()
	{
		this.playerPosition = "heavyAttack";
		
		int damage=0;
		
		if (this.weapon.equals("Unarmed"))
		{
			damage = new java.util.Random().nextInt(6);
		}
		else if (this.weapon.equals("Sharp Wood"))
		{
			damage = new java.util.Random().nextInt(12);
		}
		
		this.morrisonHP = this.morrisonHP-damage;
		
		String s1 = "You gave Mr Morrison " + damage + " Damage.\n";
		String s2 = "";
		String s3 = "";
		
		this.mainTextArea.setText(s1+s2+s3);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void evadeWithZeroDamage()
	{
		this.playerPosition = "evadeWithZeroDamage";
				
		String s1 = "You gave Mr Morrison " + 0 + " Damage.\n\n";
		String s2 = "You successfulluy evaded Mr Morrison's Attack\n\n";
		String s3 = "Mr Morrison gave you " + 0 + " Damage.\n";
		
		this.mainTextArea.setText(s2+s1+s3);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void returnHitFromMorrison()
	{
		this.playerPosition = "returnHitFromMorrison";
		
		this.morrisonDamage = new java.util.Random().nextInt(5);
		
		this.HP -= this.morrisonDamage;
		
		this.HPRemaining.setText(""+this.HP);
		
		String s1 = "Mr Morrison gave you " + this.morrisonDamage + " Damage.\n";
		String s2 = "";
		String s3 = "";
		
		this.mainTextArea.setText(s1+s2+s3);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void morrisonPunch()
	{
		this.playerPosition = "morrisonPunch";
		
		String s1 = "\t\tBAAMMMM!!!\n\n";
		String s2 = "The last thing you remember is Mr M pulling you towards him by the collar and his humongous clenched right fist meeting your nose at breakneck speed.\n\n";
		String s3 = "You black out.";
		String s4 = "";
		String s5 = "";
		
		
		this.mainTextArea.setText(s1+s2+s3+s4+s5);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void morrisonDefeated()
	{
		this.playerPosition = "morrisonDefeated";
		
		this.morrisonBlackCard = true;
		
		String s1 = "You have managed to defeat Mr Morrison!\n\n";
		String s2 = "Theres something like a black visiting card with golden letterings sticking out of his pocket.\n";
		String s3 = "You reach and pick it up and before you could examine it, you hear a rustling sound behind you.";
		String s4 = "You keep the card in your pocket and turn around.\n";
		
		this.mainTextArea.setText(s1+s2+s3+s4);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void suitLadyPunch()
	{
		this.playerPosition = "suitLadyPunch";
		
		String s1 = "\t\tBAAMMMM!!!\n\n";
		String s2 = "The last thing you remember is the Suit Lady hitting you with the butt of her Glock\n\n";
		String s3 = "You black out.";
		String s4 = "";
		String s5 = "";
		
		
		this.mainTextArea.setText(s1+s2+s3+s4+s5);
		
		this.choiceButton1.setText(">");
		this.choiceButton2.setText("");
		this.choiceButton3.setText("");
		this.choiceButton4.setText("");
	}
	
	public void chapter0Finishes()
	{
		this.playerPosition = "chapter0Finishes";
		
		String s1 = "\n\n     CHAPTER 0 COMPLETE!";
		
		
		this.mainTextArea.setText(s1);
		
		this.mainTextArea.setFont(gameStatFont);
		this.mainTextArea.setForeground(Color.cyan);
		this.choiceButtonPanel.setVisible(false);
		
	}
	
	public void wAsTeD()
	{
		this.playerPosition = "wAsTeD";
		
		String s1 = "\n\n\tWASTED";
		
		this.mainTextArea.setText(s1);
		
		this.mainTextArea.setFont(gameStatFont);
		this.mainTextArea.setForeground(Color.cyan);
		this.choiceButtonPanel.setVisible(false);
		
		
	}
	
	public void gameOver()
	{
		this.playerPosition = "gameOver";
		
		String s1 = "\tGAME OVER";
		
		this.mainTextArea.setText(s1);
		
		this.mainTextArea.setFont(gameStatFont);
		this.mainTextArea.setForeground(Color.cyan);
		this.choiceButtonPanel.setVisible(false);
	}
	
	
	
	
	
	
	
	
	
	
	public class TitleScreenHandler implements ActionListener 
	{
		public void actionPerformed(ActionEvent event)
		{
			createGameScreen();
		}
	}
	
	public class ChoiceHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			//gets the action command which was set earlier using setActionCommand() for the choice buttons
			//to see which is the current button clicked
			String playerChoice = event.getActionCommand();
			
			
			switch (playerPosition)
			{
				case "intro": {
					switch (playerChoice) 
					{
					case "c1": enterParty(); break;
					case "c2": wakeUpInRoom(); break;
					case "c3": callCops(); break;
					}
					
					break;
				}
				
				case "enterParty": {
					switch (playerChoice) 
					{
					case "c1": 
						{
							drinkAlcohol(); 
						}
						break;
					case "c2": drinkTropicana(); break;
					case "c3": encounterShadyGuyOnStaircase(); break;
					}
					
					break;
				}
				
				case "callCops": {
					switch (playerChoice) 
					{
					case "c1": enterParty(); break;
					}
					
					break;
				}
				
				case "wakeUpInRoom": {
					switch (playerChoice) 
					{
					case "c1": lookLeft(); break;
					case "c2": lookRight(); break;
					case "c3": screamForHelp(); break;
					case "c4": breakFreeFromHandcuffs(); break;
					}
					
					break;
				}
				
				case "encounterShadyGuyOnStaircase":{
					switch (playerChoice) 
					{
					case "c1": wakeUpInRoom(); break;
					}
					
					break;
				}
		
				case "drinkAlcohol":{
					switch (playerChoice) 
					{
					case "c1":
						if (HP < 1)
						{
							wAsTeD();
						}
						else
						{
							enterParty();
						}
						break;
					}
					
					break;
				}
				
				case "drinkTropicana":{
					switch (playerChoice) 
					{
					case "c1": enterParty(); break;
					}
					
					break;
				}
				
				case "lookLeft":{
					switch (playerChoice) 
					{
					case "c1": wakeUpInRoom(); break;
					}
					
					break;
				}
				
				case "lookRight":{
					switch (playerChoice) 
					{
					case "c1": wakeUpInRoom(); break;
					}
					
					break;
				}
				
				case "screamForHelp":{
					switch (playerChoice) 
					{
					case "c1": investigRoomDoorOpens1(); break;
					}
					
					break;
				}
				
				case "breakFreeFromHandcuffs":{
					switch (playerChoice) 
					{
					case "c1": investigRoomDoorOpens1(); break;
					}
					
					break;
				}
				
				case "investigRoomDoorOpens1":{
					switch (playerChoice) 
					{
					case "c1": investigRoomDoorOpens2(); break;
					}
					
					break;
				}
				case "investigRoomDoorOpens2":{
					switch (playerChoice) 
					{
					case "c1": investigRoomDoorOpens3(); break;
					}
					
					break;
				}
				case "investigRoomDoorOpens3":{
					switch (playerChoice) 
					{
					case "c1": suitLadyLeaves(); break;
					case "c2": suitLadyLeaves(); break;
					case "c3": suitLadyLeaves(); break;
					}
					
					break;
				}
				
				case "suitLadyLeaves":{
					switch (playerChoice) 
					{
					case "c1": fight(); break;
					case "c2": fight(); break;
					}
					
					break;
				}
				
				case "fight":{
					switch (playerChoice) 
					{
					case "c1": evadeTheAttack(); break;
					case "c2": headbutt(); break;
					case "c3": reachForChairPiece(); break;
					}
					
					break;
				}
				
				case "evadeTheAttack":{
					switch (playerChoice) 
					{
					case "c1": duel(); break;
					}
					
					break;
				}
				
				case "headbutt":{
					switch (playerChoice) 
					{
					case "c1": duel(); break;
					}
					
					break;
				}
				
				case "reachForChairPiece":{
					switch (playerChoice) 
					{
					case "c1": duel(); break;
					}
					
					break;
				}
				
				case "duel":{
					switch (playerChoice) 
					{
					case "c1": lightAttack(); break;
					case "c2": heavyAttack(); break;
					case "c3": evadeWithZeroDamage(); break;
					}
					
					break;
				}
				
				case "lightAttack":{
					switch (playerChoice) 
					{
					case "c1": {
						if (HP < 1) {
							morrisonPunch();
						}
						else if (morrisonHP < 1) {
							morrisonDefeated();
						}
						else {
							returnHitFromMorrison(); 	
						}
						break;
					}
					//case "c2": (); break;
					//case "c3": (); break;
					}
					
					break;
				}
				
				case "heavyAttack":{
					switch (playerChoice) 
					{
					case "c1": {
						if (HP < 1) {
							morrisonPunch();
						}
						else if (morrisonHP < 1) {
							morrisonDefeated();
						}
						else {
							returnHitFromMorrison(); 	
						}
						break;
					}
					//case "c2": (); break;
					//case "c3": (); break;
					}
					
					break;
				}
				
				case "evadeWithZeroDamage":{
					switch (playerChoice) 
					{
					case "c1": duel(); break;
					//case "c2": (); break;
					//case "c3": (); break;
					}
					
					break;
				}
				
				case "returnHitFromMorrison":{
					switch (playerChoice) 
					{
					case "c1": duel(); break;
					//case "c2": (); break;
					//case "c3": (); break;
					}
					
					break;
				}
				
				case "morrisonPunch":{
					switch (playerChoice) 
					{
					case "c1": chapter0Finishes(); break;
					}
					
					break;
				}
				
				case "morrisonDefeated":{
					switch (playerChoice) 
					{
					case "c1": suitLadyPunch(); break;
					}
					
					break;
				}
				
				case "suitLadyPunch":{
					switch (playerChoice) 
					{
					case "c1": chapter0Finishes(); break;
					}
					
					break;
				}
				
				case "chapter0Finishes":{
					switch (playerChoice) 
					{
					/*
					case "c1": (); break;
					case "c2": (); break;
					*/
					}
					
					break;
				}
				
				case "wAsTeD":{
					switch(playerChoice)
					{
					case "c1": gameOver(); break;
					}
					break;
				}
				
				case "gameOver":{
					switch (playerChoice) 
					{
					/*
					case "c1": (); break;
					case "c2": (); break;
					*/
					}
					
					break;
				}
				
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
		
}
