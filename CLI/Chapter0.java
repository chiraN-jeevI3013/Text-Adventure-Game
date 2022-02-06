//CHAPTER 0 - THE PARTY

//System.out.println("");

import java.util.*;
import java.io.*;

public class Chapter0 extends Player 
{
	Scanner input = new Scanner(System.in);
	
	int choice;
	public Player p = new Player();
			
	public void chapterName() {
		System.out.println("\n\n Chapter0 - THE PARTY\n\n");
	}
	
	public void printPlayerStats()
	{
		System.out.println("\nHP: " + p.getHP());
		
		System.out.println("Armour Status: " + p.getArmour());
		if (!p.getArmour().equals("Not Available"))
			System.out.println("Armour Capacity: " + p.getArmourCapacity());
		
		System.out.println("Weapon Status: " + p.getWeapon());
		if (!p.getWeapon().equals("Unarmed"))
			System.out.println("Weapon Damage: " + p.getWeaponDamage());
	}
	
	public void getPlayerDeets()
	{
		System.out.println("\n Enter Your Character Details:-");
		
		System.out.print("Name: ");
		p.setName(input.nextLine());
		
		System.out.print("Current Outfit: ");
		p.setOutfit(input.nextLine());
		
		System.out.print("Your ride: ");
		p.setVehicle(input.nextLine());
		
		p.setHP(10);
		p.setArmour("Not Available");
		p.setWeapon("Unarmed");
	}
	
	public void mod1() throws InputMismatchException, Exception
	{
		
		System.out.println("You�ve arrived at your friend�s bday party. You're at the door.");
		System.out.println("\nA tall redhead with a Tropicana juicebox opens the door.");
		
		input.nextLine();
		
		System.out.println("Redhead: Hii! (waves) Am sorry you are.");
		
		getPlayerDeets();
		this.printPlayerStats();
		
		input.nextLine();
		
		
		try {
			this.intro();
		}
		catch (InputMismatchException e) {
			
			input.nextLine();
			
			System.err.println("\n mod1() - Please Enter the values only from the Options\n");
			
			this.intro();
		}
		catch (Exception e) {
			input.nextLine();
			System.err.println("\nSorry Buddy, smth went wrong!\n");
			this.intro();
		}
		
		
	}
	
	
	public void intro() throws InputMismatchException, Exception
	{

			System.out.println("\n\nOhh " + p.getName() + "! Yeah yeah Emily's friend from the Drifting school right? Come on in");
			System.out.println("\n(She opens the door for you to enter and she goes inside)");
			System.out.println("\nOn your right, you see a shady guy with a Ray-Ban and a black suit half hiding behind a tree and looking straight at you\n");
			
			input.nextLine();
			
			System.out.println("(1) Dismiss him as some random creep & open the door and enter the party");
			System.out.println("(2) Encounter the shady guy");
			System.out.println("(3) Suspect he�s a well-dressed kidnapper & attempt to call the cops");
			
			choice = input.nextInt();
			
		switch(choice)
		{
			case 1:
			{	
				try {
					this.enterParty();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [intro() case1] - Please Enter the values only from the Options\n");
					this.enterParty();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [intro() case1] - Sorry Buddy, smth went wrong!\n");
					this.enterParty();
				}
				
				break;
			}
			case 2:
			{
				try {
					this.encounterShadyGuy();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [intro() case2] - Please Enter the values only from the Options\n");
					this.encounterShadyGuy();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [intro() case2] - Sorry Buddy, smth went wrong!\n");
					this.encounterShadyGuy();
				}
				
				break;
			}
			case 3:
			{
				System.out.println("\nYou dial 911 and look at his direction. But there's no one, he seems to have fled the scene.");
				System.out.println("\nYour frens welcome you to the party and after 10 or so big-tight group hugs you end up in the living room");
				
				input.nextLine();
				
				try {
					input.nextLine();
					this.enterParty();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [intro() case3] - Please Enter the values only from the Options\n");
					this.enterParty();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [intro() case3] - Sorry Buddy, smth went wrong!\n");
					this.enterParty();
				}
				
				break;
			}
			default: {
				System.err.println("\n [intro() default] - Incorrect Input!\n");
				
				try {
					this.intro();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [intro() case3] - Please Enter the values only from the Options\n");
					this.intro();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [intro() case3] - Sorry Buddy, smth went wrong!\n");
					this.intro();
				}
				
				break;
			}
				
		}
	}
	
	public void enterParty() throws InputMismatchException, Exception
	{
		System.out.println("\n\n -----------------------------------------------------------------------------------------------\n");
		
		System.out.println("Your not so sober party-animal frens forget youre a teetotaler offer you drinks & brownies.");
		System.out.println("\nBehind them you glance upon that same shady guy standing and looking at you on the staircase.\n\n");
		
		input.nextLine();
		
		System.out.println("(1) Drink the offered alcohol");
		System.out.println("(2) Refuse the alcohol and go for a Tropicana instead");
		System.out.println("(3) Walk in the direction of that guy and try to talk to him ");
		
		choice = input.nextInt();
		
		switch(choice)
		{
			case 1:
			{	
				this.drinkAlcohol();
				
				input.nextLine();
				
				try 
				{
					input.nextLine();
					this.enterParty();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [enterParty() case1] - Please Enter the values only from the Options\n");
					this.enterParty();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [enterParty() case1] - Sorry Buddy, smth went wrong!\n");
					this.enterParty();
				}
				
				break;
			}
			case 2:
			{
				this.drinkTropicana();
				
				input.nextLine();
								
				try 
				{
					input.nextLine();					
					this.enterParty();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [enterParty() case2] - Please Enter the values only from the Options\n");
					this.enterParty();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [enterParty() case2] - Sorry Buddy, smth went wrong!\n");
					this.enterParty();
				}
				
				break;
			}
			case 3:
			{
				
				System.out.println("\n\nYou go towards him and once he sees you're coming towards he quickly turns his back on you.");
				System.out.println("\nYou go near him and tap his shoulder.");
				input.nextLine();
				input.nextLine();
				System.out.println("He immediately turns and sprays something on your face. ");
				input.nextLine();
				System.out.println("You feel dizzy and are about to hit the ground and he catches you.");
				//input.nextLine();
				System.out.println("Your eyes feel heavy and suddenly everything blacks out.");
				
				input.nextLine();
				
				try {
					input.nextLine();
					this.encounterShadyGuy();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [enterParty() case3] - Please Enter the values only from the Options\n");
					this.encounterShadyGuy();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [enterParty() case3] - Sorry Buddy, smth went wrong!\n");
					this.encounterShadyGuy();
				}
				
				break;
			}
			default: {
				System.out.println("\n Incorrect Input!");
				
				try {
					this.enterParty();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [enterParty() default] - Please Enter the values only from the Options\n");
					this.enterParty();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [enterParty() default] - Sorry Buddy, smth went wrong!\n");
					this.enterParty();
				}
				
				break;
			}
				
		}
	}
	
	public void encounterShadyGuy() throws InputMismatchException, Exception
	{
		
		System.out.println("\n\n -----------------------------------------------------------------------------------------------\n");
		
		System.out.println("You wake up handcuffed on a chair, in a small room that looks like a police investigation room that you've seen on crime thrillers. ");
		System.out.println("\nThere's even a large mirror in front of you which probably is used to see inside the room from the other side.\n\n");
	
		input.nextLine();
		
		System.out.println("(1) Look left");
		System.out.println("(2) Look right");
		System.out.println("(3) Scream for help");
		System.out.println("(4) Break free from handcuffs");
		
		choice = input.nextInt();
		
		switch(choice)
		{
			case 1:
			{	
				//lookLeftSideOfInvestigRoom();
				System.out.println("\nThere�s a door with a knob of the kind that opens when twisted. But you are unable to reach it\n");
				
				input.nextLine();
				
				try {
					input.nextLine();
					this.encounterShadyGuy();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [encounterShadyGuy() case1] - Please Enter the values only from the Options\n");
					this.encounterShadyGuy();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [encounterShadyGuy() case1] - Sorry Buddy, smth went wrong!\n");
					this.encounterShadyGuy();
				}
				
				break;
			}
			case 2:
			{
				//lookRightSideOfInvestigRoom();
				System.out.println("\nThere�s a small pencil drawing of a 3 people which seems like a mother, father and a little girl with pigtails. ");
				System.out.println("\nThe drawing seems like it was erased in a hurry\n");
				
				input.nextLine();
				
				try {
					input.nextLine();
					this.encounterShadyGuy();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [encounterShadyGuy() case2] - Please Enter the values only from the Options\n");
					this.encounterShadyGuy();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [encounterShadyGuy() case2] - Sorry Buddy, smth went wrong!\n");
					this.encounterShadyGuy();
				}
				
				break;
			}
			case 3:
			{
				//screamForHelp();
				System.out.println("\nYou: (muffled screams) �HELP! HELP! ANYBODY THERE? HELLOOO???�");
				System.out.println("\n(the classic kidnappee dialogue which you always cringed while watching Hollywood movies. But now when that movie is suddenly your life, doesn't feel cringe anymore) ");
				System.out.println("(...long silence...as expected no response...)");
				
				input.nextLine();
				
				try {
					input.nextLine();
					this.investigRoomDoorOpens();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [encounterShadyGuy() case3] - Please Enter the values only from the Options\n");
					this.investigRoomDoorOpens();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [encounterShadyGuy() case3] - Sorry Buddy, smth went wrong!\n");
					this.investigRoomDoorOpens();
				}
				break;
			}
			case 4:
			{
				//breakFreeFromHandcuffs();
				System.out.println("\nUsing the training from all the youtube lifehack videos, you start twisting and turning your wrists in various angles.");
				System.out.println("\nYou try your best to nudge your wrists free from the handcuffs");
				System.out.println("\nBut the cuffs just do not seem to budge");
				
				input.nextLine();
				
				try {
					input.nextLine();
					this.investigRoomDoorOpens();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [encounterShadyGuy() case4] - Please Enter the values only from the Options\n");
					this.investigRoomDoorOpens();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [encounterShadyGuy() case4] - Sorry Buddy, smth went wrong!\n");
					this.investigRoomDoorOpens();
				}
				break;
			}
			default: 
			{
				System.out.println("\n [encounterShadyGuy() - default]Incorrect Input!");

				try {
					this.encounterShadyGuy();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [encounterShadyGuy() default] - Please Enter the values only from the Options\n");
					this.encounterShadyGuy();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [encounterShadyGuy() default] - Sorry Buddy, smth went wrong!\n");
					this.encounterShadyGuy();
				}
				
				break;
			}
			
		}
	
	}
	
	public void drinkAlcohol()
	{
		System.out.println("\nDrinking is injurious to health.");
		System.out.println("Your HP takes 1 Damage.");
		p.decreaseHP(1);
		System.out.println("\n HP = " + p.getHP() + "\n");
		
		if (p.getHP() < 1) {
			p.gameOver();
		}
		
	}
	
	public void drinkTropicana()
	{
		System.out.println("\nWas a sweet drink.\n");
		
	}
	
	public void investigRoomDoorOpens() throws InputMismatchException, Exception
	{
		System.out.println("\n\n -----------------------------------------------------------------------------------------------\n");
		
		System.out.println("\n\nThe door on your left unlocks and this time a lady in a grey suit enters with a file in her hand.");
		System.out.println("\nHer short bald bodyguard with an unusually long tie and small sunglasses brings a chair and puts it infront of you.");
		System.out.println("\nShe sits comfortably and smiles at you");

		input.nextLine();

		System.out.println("Suit lady: \"Hello " + p.getName() + ", how u feeling?\" ");
		System.out.println("\nEnter to speak: ");
		
		input.nextLine();
		
		System.out.println("\nYou: (muffled sounds)");
		
		input.nextLine();
		
		System.out.println("\nSuit Lady: \"Oh sorry I forgot to tell you. You see I really don�t like it when people say anything I don�t wanna hear. \" ");
		System.out.println("\nSuit Lady: \"So some complementary facial-paralyzer that my boys made for their last summer project is kinda compulsory before meeting me. (laughs proudly)\" ");
		input.nextLine();
		System.out.println("Suit Lady: \"All right pretty face, let me cut to the chase on why you're here.\" ");
		input.nextLine();
		System.out.println("Suit Lady: \"I'm gonn give you a small task, and you're gonn do that for me. All you need to know is that if you don�t, I�ll kill you.\" (smiles) ");
		input.nextLine();
		System.out.println("Suit Lady: \"As simple as that. Not your typical Holly big mouthed villian who wastes hell lot time in speaking chicken crap.\" \n\n");
		
		input.nextLine();
		
		System.out.println("(1) \"GO TO HELL!\" ");
		System.out.println("(2) \"LEAVE ME ALONE!\" ");
		System.out.println("(3) \"PLEASE MA'AM LET ME GO!\" ");
		
		choice = input.nextInt();
		
		switch(choice)
		{
			case 1:{	
				break;
			}
			case 2:{
				break;
			}
			case 3:{
				break;
			}
			default:{
				System.out.println("\n Incorrect Input!");

				try {
					this.encounterShadyGuy();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [investigRoomDoorOpens() default] - Please Enter the values only from the Options\n");
					this.encounterShadyGuy();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [investigRoomDoorOpens() default] - Sorry Buddy, smth went wrong!\n");
					this.encounterShadyGuy();
				}
				break;
			}
		}
		
		
		try {
			this.noWayHome();
		}
		catch (InputMismatchException e) {
			input.nextLine();
			System.out.println("\n [investigRoomDoorOpens() ] -  Please Enter the values only from the Options\n");
			this.noWayHome();
		}
		catch (Exception e) {
			input.nextLine();
			System.out.println("\n [investigRoomDoorOpens() ] - Sorry Buddy, smth went wrong!\n");
			this.noWayHome();
		}
		
		
	}
	
	public void noWayHome() throws InputMismatchException, Exception
	{
		
		{
			System.out.println("\nSuit Lady: \"Thas the spirit! (looks at that Bodyguard) See didn�t I tell ya this one�s a smortie?\" ");
			input.nextLine();
			System.out.println("\nSuit Lady: (looks at you) \"Aight chop chop! (looks at watch) Time to go, the Senator doesn�t like to wait.\" ");
			input.nextLine();
			System.out.println("Suit Lady: \"I mean who does right? (laughs) Kay so my deputy here Mr Morrison will explain what u gotta do.\" ");
			input.nextLine();
			System.out.println("Suit Lady: \"Aight ciao!\" (starts walking to the door)\n");
			
			input.nextLine();
			
			System.out.println("\n(You managed to spit the cloth which was blocking your mouth)\n\n");
			
			//input.nextLine();
			
			System.out.println("(1) Scream back at her to let you go ");
			System.out.println("(2) Try to escape ");
			
			choice = input.nextInt();
			
		}
		
		switch(choice)
		{
			case 1:{	
				System.out.println("\nYou: \"Oii! Let me out! You definitely got the wrong person! Please please!!\" ");
				
				input.nextLine();
				
				System.out.println("\nThe woman goes to the door and stops and turns around.");
				
				input.nextLine();
				
				System.out.println("\nSuit Lady: \"I believe in ya sweetie.\" (pulls her sunglasses down) \"Don't disappoint me\" (winks)");
				
				input.nextLine();
				
				try {
					input.nextLine();
					this.morrisonPunch();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.out.println("\n [noWayHome() - case1] -  Please Enter the values only from the Options\n");
					this.morrisonPunch();
				}
				catch (Exception e) {
					input.nextLine();
					System.out.println("\n [noWayHome() - case1] -  Sorry Buddy, smth went wrong!\n");
					this.morrisonPunch();
				}
				break;
			}
			case 2:{
				System.out.println("\nYou push Mr Morrison by suddenly getting up from the chair and you start heading for the door \n");
				
				input.nextLine();
				
				try {
					input.nextLine();
					this.morrisonPunch();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.out.println("\n [noWayHome() - case2] -  Please Enter the values only from the Options\n");
					this.morrisonPunch();
				}
				catch (Exception e) {
					input.nextLine();
					System.out.println("\n [noWayHome() - case2] -  Sorry Buddy, smth went wrong!\n");
					this.morrisonPunch();
				}
				break;
			}
			default:{
				System.out.println("\n Incorrect Input!");
				try {
					this.morrisonPunch();
				}
				catch (InputMismatchException e) {
					input.nextLine();
					System.err.println("\n [noWayHome() default] - Please Enter the values only from the Options\n");
					this.morrisonPunch();
				}
				catch (Exception e) {
					input.nextLine();
					System.err.println("\n [noWayHome() default] - Sorry Buddy, smth went wrong!\n");
					this.morrisonPunch();
				}
				break;
			}
		}
	}
	
	public void morrisonPunch()
	{
		System.out.println("\n\n -----------------------------------------------------------------------------------------------\n");

		System.out.println("\n\n BAAMMMM!!!");
		
		input.nextLine();
		
		System.out.println("\nThe last thing you remember is Mr M pulling you towards him by the collar and his humongous clenched right fist meeting your nose at breakneck speed.");
		System.out.println("\n\nYou black out once again.\n\n");
		
		input.nextLine();
		
		chapter0Completed();
		
	}
	
	public void chapter0Completed()
	{
		System.out.println("\n\n CHAPTER 0 COMPLETED!...");
		
		System.exit(0);
	}
	
	
}
