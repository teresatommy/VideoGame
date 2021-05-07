import java.util.Random;

public class Psychic extends Adventurer implements MindRead {

	public Psychic() {
		super();
	}
	
	public Psychic(String name, int hp, int strength, int agility) {
		super(name, hp, strength, agility);
	}
	
	public int rollDie() {
		int extraDamage = 0;
		Random r = new Random();
		int roll = r.nextInt(7);
		if(roll < 2) {
			extraDamage = addDamage();
		}
		return roll + extraDamage;
	}
	
	@Override
	public int addDamage() {
		Random r = new Random();
		return r.nextInt(3);
	}
}
