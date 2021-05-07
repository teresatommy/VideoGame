import java.util.Scanner;
import java.lang.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		int die = 1;
		// Game adventurer created
		Psychic CPU = new Psychic("God", 10000, 200, 100);
		
		// Game Introduction
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Adventurer game!");
		System.out.println("Note: Psychic's get mind read powers and may deal extra "
				+ "damage if they roll below a 2.");
		// Player picks adventurer role
		System.out.println("You can be a Ghoul, Pirate, or Psychic. Please enter in your choice:");
		String adventurerChoice = sc.nextLine();
		// Player decides whether to set stats 
		System.out.println("Would you like to set name, hp, strength, and agility? (Y/N): ");
		char settingChoice = sc.next().charAt(0);
		
		
		// If player does not want to set stats, automatic object is made
		if(settingChoice == 'N') {
			System.out.println("LET'S BEGIN THE GAME!");
			if(adventurerChoice.equalsIgnoreCase("Ghoul")) {
				Ghoul a = new Ghoul();
				play(a,CPU);
			}
			if(adventurerChoice.equalsIgnoreCase("Pirate")) {
				Pirate a = new Pirate();
				play(a,CPU);
			}
			if(adventurerChoice.equalsIgnoreCase("Psychic")) {
				Psychic a = new Psychic();
				play(a,CPU);
			}
		}
		else { // If player wants to set stats, parameterized object is made
			// User enters in stats
			System.out.println("Enter your adventurer's name: ");
			String name = sc.next();
			System.out.println("Enter your adventurer's hp: ");
			int hp = sc.nextInt();
			System.out.println("Enter your adventurer's strength: ");
			int strength = sc.nextInt();
			System.out.println("Enter your adventurer's agility: ");
			int agility = sc.nextInt();
			System.out.println("LET'S BEGIN THE GAME!");
			// Objects are made
			if(adventurerChoice.equalsIgnoreCase("Ghoul")) {
				Ghoul a = new Ghoul(name, hp, strength, agility);
				play(a,CPU);
			}
			if(adventurerChoice.equalsIgnoreCase("Pirate")) {
				Pirate a = new Pirate(name, hp, strength, agility);
				play(a,CPU);
			}
			if(adventurerChoice.equalsIgnoreCase("Psychic")) {
				Psychic a = new Psychic(name, hp, strength, agility);
				play(a,CPU);
			}
		}
		
		
		
		sc.close();
	}
	
	
	public static void play(Ghoul a, Psychic CPU) throws InterruptedException {
		int turnNum = 1;
		int damage = 0;
		
		while((CPU.getHP() > 0) && (a.getHP() > 0)) {
			int diceRoll = a.rollDie();
			System.out.println("Turn " + turnNum + ": " + a.getName() + " rolls a: " + diceRoll);
			damage = diceRoll*(a.getAgility() + a.getStrength());
			System.out.println(a.getName() + " deals " + damage + " damage to " + CPU.getName());
			CPU.setHP(CPU.getHP() - damage);
			diceRoll = CPU.rollDie();
			System.out.println(CPU.getName() + " rolls a: " + diceRoll);
			if (diceRoll < 2) {
				System.out.println("Mind read powers activated!");
			}
			damage = diceRoll*(CPU.getAgility() + CPU.getStrength());
			System.out.println(CPU.getName() + " deals " + damage + " damage to " + a.getName());
			a.setHP(a.getHP() - damage);
			
			System.out.println("Now, " + CPU.getName() + " has " + CPU.getHP() + " hp "+ "and you have " + a.getHP() + " hp!");
			System.out.println();
			turnNum ++;
			
			Thread.sleep(1000);
			
		}
		
		if(CPU.getHP() > 0) {
			System.out.println(CPU.getName() + " is the winner!");
		}
		else if(a.getHP() > 0) {
			System.out.println(a.getName() + " is the winner!");
		}
		else {
			System.out.println("The game is a draw!");
		}
	}
	
	public static void play(Pirate a, Psychic CPU) throws InterruptedException{
		int turnNum = 1;
		int damage = 0;
		
		while((CPU.getHP() > 0) && (a.getHP() > 0)) {
			int diceRoll = a.rollDie();
			System.out.println("Turn " + turnNum + ": " + a.getName() + " rolls a: " + diceRoll);
			damage = diceRoll*(a.getAgility() + a.getStrength());
			System.out.println(a.getName() + " deals " + damage + " damage to " + CPU.getName());
			CPU.setHP(CPU.getHP() - damage);
			diceRoll = CPU.rollDie();
			System.out.println(CPU.getName() + " rolls a: " + diceRoll);
			if (diceRoll < 2) {
				System.out.println("Mind read powers activated!");
			}
			damage = diceRoll*(CPU.getAgility() + CPU.getStrength());
			System.out.println(CPU.getName() + " deals " + damage + " damage to " + a.getName());
			a.setHP(a.getHP() - damage);
			
			System.out.println("Now, " + CPU.getName() + " has " + CPU.getHP() + " hp "+ "and you have " + a.getHP() + " hp!");
			System.out.println();
			turnNum ++;
			
			Thread.sleep(1000);
			
		}
		
		if(CPU.getHP() > 0) {
			System.out.println(CPU.getName() + " is the winner!");
		}
		else if(a.getHP() > 0) {
			System.out.println(a.getName() + " is the winner!");
		}
		else {
			System.out.println("The game is a draw!");
		}
	}
	
	public static void play(Psychic a, Psychic CPU) throws InterruptedException{
		int turnNum = 1;
		int damage = 0;
		
		while((CPU.getHP() > 0) && (a.getHP() > 0)) {
			int diceRoll = a.rollDie();
			System.out.println("Turn " + turnNum + ": " + a.getName() + " rolls a: " + diceRoll);
			if (diceRoll < 2) {
				System.out.println("Mind read powers activated!");
			}
			damage = diceRoll*(a.getAgility() + a.getStrength());
			System.out.println(a.getName() + " deals " + damage + " damage to " + CPU.getName());
			CPU.setHP(CPU.getHP() - damage);
			diceRoll = CPU.rollDie();
			System.out.println(CPU.getName() + " rolls a: " + diceRoll);
			if (diceRoll < 2) {
				System.out.println("Mind read powers activated!");
			}
			damage = diceRoll*(CPU.getAgility() + CPU.getStrength());
			System.out.println(CPU.getName() + " deals " + damage + " damage to " + a.getName());
			a.setHP(a.getHP() - damage);
			
			System.out.println("Now, " + CPU.getName() + " has " + CPU.getHP() + " hp "+ "and you have " + a.getHP() + " hp!");
			System.out.println();
			turnNum ++;
			
			Thread.sleep(1000);
			
		}
		
		if(CPU.getHP() > 0) {
			System.out.println(CPU.getName() + " is the winner!");
		}
		else if(a.getHP() > 0) {
			System.out.println(a.getName() + " is the winner!");
		}
		else {
			System.out.println("The game is a draw!");
		}
	}

}
