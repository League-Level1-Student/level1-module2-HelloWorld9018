package _02_sea_creature;

public class SeaCreature_Runner { public static void main(String[] args) {
	
	SeaCreature character = new SeaCreature("Spongebob");
	
	character.getName();
	
	character.eat();
	
	character.laugh();
	
	character = new SeaCreature("Patrick");
	
	character.getName();
	
	character.eat();
	
	character.laugh();
	
	character = new SeaCreature("Squidward");
	
	character.getName();
	
	character.eat();
	
	character.laugh();
}

}
