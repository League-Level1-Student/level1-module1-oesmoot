package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	
	void quack() {
		System.out.println("the duck quacks about " + favoriteFood + " for hours on end, it fells like it will never stop, and then, magically, it is over.");
	}
	
	void waddle() {
		System.out.println("the duck waddles amongst his " + numberOfFriends +" friends.");
	}
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	
}
