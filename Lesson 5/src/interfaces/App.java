package interfaces;

import home_work.Animal;

public class App {

	public static void main(String[] args) {

		Animal animal = new Bat(111, "theBat1");
		Bat bat = new Bat(222, "theBat2");
		Flyer flyer = new Bat(333, "theBat3");
		Navigator navigator = new Bat(444, "theBat4");

		animal.move();
		animal.speak();
//		animal.fly();
		System.out.println("===");

		bat.move();
		bat.speak();
		bat.fly();
		bat.navigate();
		System.out.println("===");

		flyer.fly();
		System.out.println("===");

		navigator.navigate();
		System.out.println("===");

		// to see more methods we need other type of reference
		// we do it by casting
		((Animal) navigator).speak();

		// same thing in 2 steps (clearer)
		Animal a = (Animal) navigator;
		a.speak();

	}

}
