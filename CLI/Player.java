import java.io.*;

public class Player 
{
	private String name;
	//private int age;
	private String outfit;
	private String vehicle;
	
	private int HP;
	private String armour;
	private double armourCapacity;
	
	private String weapon;
	private int weaponDamage;
	
	
	public void decreaseHP (int d)
	{
		this.HP -= d;
	}
	public void increaseHP (int i)
	{
		this.HP += i;
	}
	
	
	//ACCESSORS
	
	public String getName () {
		return this.name;
	}
	public String getOutfit () {
		return this.outfit;
	}
	public String getVehicle () {
		return this.vehicle;
	}
	public int getHP () {
		return this.HP;
	}
	public String getArmour () {
		return this.armour;
	}
	public double getArmourCapacity () {
		return this.armourCapacity;
	}
	public String getWeapon () {
		return this.weapon;
	}
	public int getWeaponDamage () {
		return this.weaponDamage;
	}
	
	//MODIFIERS
	
	public void setName (String name) {
		this.name = name;
	}
	public void setOutfit (String outfit) {
		this.outfit = outfit;
	}
	public void setVehicle (String vehicle) {
		this.vehicle = vehicle;
	}
	public void setHP (int HP){
		this.HP = HP;
	}
	public void setArmour (String armour) {
		this.armour = armour;
	}
	public void setArmourCapacity (double armourCapacity) {
		this.armourCapacity = armourCapacity;
	}
	public void setWeapon (String weapon) {
		this.weapon = weapon;
	}
	public void setWeaponDamage (int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	
	public void gameOver() {
		System.out.println("\n\n Your HP = 0\n");
		System.out.println("\n                  W A S T E D \n\n");
		
		System.out.println("\n\nGAME OVER! \n.....\n....\n...\n..\n.\n");
		
		System.exit(0);
	}
}
