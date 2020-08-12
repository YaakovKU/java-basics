package interfaces;

import home_work.Animal;

public class Bat extends Animal implements Flyer, Navigator {

	public Bat(int id, String name) {
		super(id, name);
	}

	@Override
	public void speak() {
		System.out.println("speak like a bat");

	}

	@Override
	public void move() {
		System.out.println("move like a bat");

	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");

	}

	@Override
	public void navigate() {
		System.out.println("navigate like a bat");

	}

}
