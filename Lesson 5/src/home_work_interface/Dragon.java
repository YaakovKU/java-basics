package home_work_interface;

import home_work.Animal;

public class Dragon extends Animal implements AdvancedFlyer, Smoker {

	public Dragon(int id, String name) {
		super(id, name);
	}

	@Override
	public void fly() {
		System.out.println("fly like a dragon");

	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a dragon");

	}

	@Override
	public void land() {
		System.out.println("land like a dragon");
	}

	@Override
	public void smoke() {
		System.out.println("smoke like a dragon");

	}

	@Override
	public void navigate() {
		System.out.println("navigate like a dragon");

	}

	@Override
	public void speak() {
		System.out.println("speak like a dragon");

	}

	@Override
	public void move() {
		System.out.println("move like a dragon");

	}

}
