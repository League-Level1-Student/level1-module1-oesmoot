package _07_duck;

public class Anglerfish {
	int numberOfFriends;
	String favoriteFood;
	
	void light() {
		System.out.println("the anglerfish lights up in hope to attract some " + favoriteFood + ", unfortunateley for him, he fails, and scares it off");
	}
	void swim ( ) {
		System.out.println("the anglerfish swims around with his " + numberOfFriends + " friends.");
	}
	Anglerfish(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}

}
