package home_work;

import interfaces.Navigator;

public class Dog extends Animal implements Navigator {
	public Dog(int id, String name) {
		super(id, name);
	}

	@Override
	public void speak() {
		System.out.println("Woof");
	}

	@Override
	public void move() {
		System.out.println("move like a Dog");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a Dog");

	}
}
