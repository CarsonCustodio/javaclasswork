package javaTheHardWay;

public class Environment {
	
	private int plants;
	private int growthRate;

	public static void main(String[] args) {
		Environment farm = new Environment(40);
		System.out.println(farm);
		farm.growPlants();
	}
	
	void growPlants() {
		plants += growthRate + plants/2;
		System.out.println("There are " + plants + " plants");
	}

	public Environment(int plants) {
		this.plants = plants;
		this.growthRate = plants/2;
	}
	
	public boolean eatPlants() {
		if(plants > 0) {
			plants--;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "A vast field";
	}
}
