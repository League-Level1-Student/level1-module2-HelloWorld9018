package _03_smurf;

public class Smuf_Runner { public static void main(String[] args) {
	
	Smurf blue = new Smurf("Handy");
	
	System.out.println(blue.getName());
	blue.eat();
	
	blue = new Smurf("Papa");
	
	System.out.println(blue.getName());
	System.out.println("My hat color is " + blue.getHatColor());
	System.out.println("Papa Smurf is a "+ blue.isGirlOrBoy());
	
	blue = new Smurf("Smurfette");
	System.out.println(blue.getName());
	System.out.println("My hat color is " + blue.getHatColor());
	System.out.println("Smurfette is a " + blue.isGirlOrBoy());
	
}

}
