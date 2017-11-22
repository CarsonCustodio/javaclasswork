package javaTheHardWay;

public class Prey extends ReproductionAnimal{
	
	public static final String[] PREY = {"bunny"};
	
	public static void main(String[] args) {
		Wilderness wilderness = new Wilderness("A wooded area", 100);
		int numPredators = 20;
		int numPrey = 60;
		for(int i = 0; i < numPredators; i++) {
			Predator predator = new Predator(wilderness, "wolf", new Trait(), new Trait());
			wilderness.addAnimal(predator);
		}
		for(int i = 0; i < numPrey; i++) {
			Prey prey = new Prey(wilderness);
			wilderness.addAnimal(prey);
		}
		wilderness.simulate(10);
	}
	
	public Prey(Habitat matingArea) {
		super(matingArea);
		setMaxLitterSize(6);
	}
	
	public Prey(Habitat matingArea, String description, Trait dominantTrait, Trait dominantTrait2) {
		super(matingArea, description, dominantTrait, dominantTrait2);
		setMaxLitterSize(6);
	}
	
	public String getName() {
		return PREY[(int)(Math.random() * PREY.length)];
	}
	
	public ReproductionAnimal getOffspring(ReproductionAnimal mate) {
		return new Prey(habitat, getDescription(), Trait.getDominateTrait(getTrait1(), mate.getTrait1()), Trait.getDominateTrait(getTrait2(), mate.getTrait2()));
	}
}
