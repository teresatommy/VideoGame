import java.util.Random;

public abstract class Adventurer {
	private String name; 
	private int hp;
	private int strength; 
	private int agility;
	
	public Adventurer(){
		name = "User";
		hp = 10000;
		strength = 100;
		agility = 100;
	}
	
	public Adventurer(String name, int hp, int strength, int agility){
		this.name = name;
		this.hp = hp;
		this.strength = strength;
		this.agility = agility;
	}
	
	public void setName(String name) {
		this.name = name;  
	}
	
	public String getName() {
		return name;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setAgility(int agility) {
		this.agility = agility; 
	}
	
	public int getAgility() {
		return agility;
	}
	
	public int rollDie() {
		Random r = new Random();
		return r.nextInt(7);
	}



}
