package pokemon;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;

	public static void main(String[] args) {
		Pokemon squirtle = new Pokemon("Squirtle", 100, 26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",100, 26);
		squirtle.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Squirtle is preparing to attack with water blast");
		squirtle.attack(bulbasaur, new Attack() {
			public void attack(Pokemon target) {
				int hp = target.getHp();
				target.setHp(hp/2);
			}
		});
		System.out.println("Bulbasaur is preparing to attack with poison.");
		bulbasaur.attack(squirtle, new Attack() {

			public void attack(Pokemon target) {
				target.setPoisoned(true);
			}
		});
		squirtle.lapse();
		bulbasaur.lapse();
		printScore(squirtle, bulbasaur);
		System.out.println("");
		squirtle.attack(bulbasaur, new Attack() {
			public void attack(Pokemon target) {
				int oldHp = target.getHp();
				target.setHp(oldHp - 1);
			}
		});
		printScore(squirtle, bulbasaur);
		squirtle.levelUp(new Effect() {
			public void happens() {
				//code
			}
		});
	}

	private static void printScore(Pokemon p1, Pokemon p2) {
		System.out.println(p1.getName() + " has " + p1.getHp() + " hp.\n" + p2.getName() + " has " + p2.getHp() + " hp.");
	}

	public Pokemon(String name, int hp, int level) {
		this.name = name;
		this.level = level;
		this.hp = hp;
	}

	public void iChooseYou() {
		System.out.println(name);
		System.out.println(name);
	}

	public int getHp() {
		return hp;
	}

	public String getName() {
		return name;
	}

	public void setHp(int newHp) {
		this.hp = newHp;
	}

	public void setPoisoned(boolean b) {
		this.poisoned = b;
	}

	void lapse() {
		if(this.poisoned) {
			this.setHp(hp - 15);
		}
	}

	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
		}else{
			System.out.println("The attack missed");
		}
	}
	
	public void levelUp(Effect e) {
		this.level++;
		e.happens();
	}
}
