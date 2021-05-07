import java.util.Random;

public class Ghoul extends Adventurer {

	public Ghoul() {
		super();
	}
	
	public Ghoul(String name, int hp, int strength, int agility) {
		super(name, hp, strength, agility);
	}
	
	public int rollDie() {
		Random r = new Random();
		return r.nextInt(7);
	}
}
