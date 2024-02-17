package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("what popcorn flavor do you want?");
	Popcorn popcorn = new Popcorn(flavor);
	Microwave microwave = new Microwave();
	String cTime = JOptionPane.showInputDialog("how many minutes will you cook your popcorn?");
	int cookTime = Integer.parseInt(cTime);
	microwave.putInMicrowave(popcorn);
	microwave.setTime(cookTime);
	microwave.startMicrowave();
	popcorn.eat();
}
}
