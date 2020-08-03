package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class Tea_Runner { 
	
	public static void main(String[] args) {
	


TeaBag bag = new TeaBag("Passion Fruit");

System.out.println(bag.getFlavor() + " tea bag created");
	
Kettle kettle = new Kettle();

Water wate = kettle.getWater();

kettle.boil();

System.out.println(wate.isHot()+ ", water has been boiled");

Cup cup =  new Cup();

cup.makeTea(bag, wate);

}

}
