package _99_extra;

import java.util.Random;

public class Checkpoint { 


boolean mood;

public Checkpoint() {}

boolean isInAGoodMood(String parentName) {
	int x = new Random().nextInt(2) ;
	System.out.println(x);
	if (x == 0) {
	mood = false;
	System.out.println(parentName + " is not in a good mood");
	}
	
	else if (x == 1){
		mood =  true;
		System.out.println(parentName + " is in a good mood");
	}
	
	return mood;
}


int askForMoney(int amount) {
	boolean happy = isInAGoodMood("Mom");
	if (happy) {
		return amount;
	}
	
	return 0;
	
	
}	

public static void main(String[] args) {
	Checkpoint mom = new Checkpoint();
	int money = mom.askForMoney(20);
	System.out.println("Mom gave me " + money+ " dollars");
}

}



