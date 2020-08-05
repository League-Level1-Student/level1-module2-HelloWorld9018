package _99_extra;

import org.jointheleague.graphical.robot.Robot;

public class Methods_1 {
	static Robot Tortoise = new Robot();

	public static void main(String[] args) {

		Methods_1 yum = new Methods_1();

		yum.food("apples");

		yum.truth(4);

		Tortoise.penDown();
		Tortoise.setSpeed(70);
		for(int i = 4; i > 0; i--) {
		yum.drawLine();
		}
	}

	
	
	void food(String fruit) {

		System.out.println("I like " + fruit);

	}

	void truth(int x) {

		if (x > 5)

			System.out.println("Geeks rule");

		else

			System.out.println("Nerds rule");

	}

	void drawLine() {

		Tortoise.move(100);

		Tortoise.turn(90);
	}

}
