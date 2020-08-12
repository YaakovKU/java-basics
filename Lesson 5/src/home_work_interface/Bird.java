package home_work_interface;

import home_work.Animal;

public class Bird extends Animal implements AdvancedFlyer {

	public Bird(int id, String name) {
		super(id, name);

	}

	@Override
	public void speak() {
		System.out.println("speak like a bird");
	}

	@Override
	public void move() {
		System.out.println("speak like a bird");

	}

	@Override
	public void fly() {
		System.out.println("fly like a bird");

	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a bird");

	}

	@Override
	public void land() {
		System.out.println("land like a bird");

	}

	@Override
	public void navigate() {
		System.out.println("navigate like a bird");

	}

}
