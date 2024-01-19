/**
 * Liz Hinton
 * CIS175 - Fall 2023
 * Jan 18, 2024
 */

//a class for use in an rpg video game, this would be the player character
//I might make this a superclass later, or just add to this class, it depends on how I expand this project

public class hero{
	//variables
	private int level;
	private int currentHealth;
	private int atkPwr;
	private int maxHealth;
	
	//constructors
	//only a default constructor, since the game would start with creating a default object of this class
	hero(){
		level = 1;
		maxHealth = level*10;
		atkPwr = level*4;
		currentHealth = maxHealth;
	}
	
	//getters
	int getLevel() {
		return level;
	}
	
	int getMaxHealth() {
		return maxHealth;
	}
	
	int getAtkPwr() {
		return atkPwr;
	}
	
	int getCurrentHealth() {
		return currentHealth;
	}
	
	//setters
	void setLevel(int l) {
		level = l;
	}
	
	void setMaxHealth(int m) {
		maxHealth = m;
	}
	
	void setAtkPwr(int a) {
		atkPwr = a;
	}
	
	void setCurrentHealth(int h) {
		currentHealth = h;
	}
	
	//methods
	//right now all the methods are very simple but they may be changed or added to in future
	//heal
	void heal(){
		currentHealth += level*2;
		if (currentHealth > maxHealth) {
			currentHealth = maxHealth;
			System.out.println(currentHealth);
		}
		System.out.println("your health is now " + currentHealth);
	}
	//attack
	int attack() {
		return atkPwr;
	}
	//level up
	void levelUp() {
		level += 1;
		maxHealth = level*10;
		atkPwr = level*4;
		System.out.println("You are now level " + level + "!");
	}
	//take damage
	void takeDmg(int dmg) {
		currentHealth -= dmg;
		System.out.println("Current health: " + currentHealth);
	}
}
