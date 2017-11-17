package javaTheHardWay;

public class ReproductionAnimal extends RoamingAnimal{

	private int maxLitter;
	
	public static void main(String[] args) {
		Habitat h = new Habitat(3);
		ReproductionAnimal animal1 = new ReproductionAnimal(h);
		ReproductionAnimal animal2 = new ReproductionAnimal(h);
		ReproductionAnimal youngAnimal = animal1.getOffSpring(animal2);
		while
	}
}
