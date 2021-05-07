import java.util.Random;

public class Pirate extends Adventurer{

	public Pirate() {
		super();
	}
	
	public Pirate(String name, int hp, int strength, int agility) {
		super(name, hp, strength, agility);
	}
	
	public int rollDie() {
		Random r = new Random();
		return r.nextInt(7);
	}
}
