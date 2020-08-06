package _99_extra;

public class Friend {
static String flavor;
	
	
	public static void main(String[] args) {
		
		
		Friend ella = new Friend(); 
		Friend jimmy = new Friend(); 
		Friend pedro = new Friend(); 
		
		ella.setIcecream("blueberry");
		System.out.println("Ella: " + flavor);
		ella.check();
		
		jimmy.setIcecream("Strawberry");
		System.out.println("Jimmy: " + flavor);
		jimmy.check();
		
		
		pedro.setIcecream("Chocolate");
		System.out.println("Pedro: " + flavor);
		pedro.check();		
		
		
	}

	private void check() {
		// TODO Auto-generated method stub
		if (flavor == "Strawberry") {
			System.out.println("" + flavor + " is my favorite IceCream flavor too!"); 
			}
	}

	private void setIcecream(String flavor) {
		// TODO Auto-generated method stub
		this.flavor = flavor;

	}
	}


