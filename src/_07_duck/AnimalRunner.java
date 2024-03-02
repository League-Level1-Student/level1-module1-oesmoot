package _07_duck;

public class AnimalRunner {
	public static void main(String[] args) {
		Duck timjommy = new Duck("hamster",0);
		timjommy.quack();
		timjommy.waddle();
		
		Anglerfish jomtimmy = new Anglerfish("Bread",0);
		jomtimmy.light();
		jomtimmy.swim();
	}
}
