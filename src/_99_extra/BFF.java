package _99_extra;

public class BFF {
	
String name;
	Candy fav;
	BFF(String name, Candy fav){
        this.name = name;
        this.fav = fav;
}
	public Candy getFavoriteCandy() {
		// TODO Auto-generated method stub
		
		return fav;
	}
	public static void main(String[] args) {
		Candy yum = new Candy("Hersheys"); 
		BFF friend = new BFF("Willi Wonka", yum);
		new CandyShop().buy(friend.getFavoriteCandy());
	}
	
}

class CandyShop {
    void buy(Candy choice) {
    	System.out.println(choice.getBrand() + " purchased");
    }
}

class Candy{
String brand;
	Candy(String brand){
		this.brand = brand;
		
	}
	
	String getBrand(){
		return brand;
	}
	
	
}