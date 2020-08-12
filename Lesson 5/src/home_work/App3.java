package home_work;

public class App3 {

	public static void main(String[] args) {

		Cat cat = new Cat(101, "aaa");
		Dog dog = new Dog(103, "ccc");
		Cow cow = new Cow(104, "ddd");

		/*
		 * the behavior the reference is determined by the runtime object type and not
		 * the reference type
		 */

		makeAnimalSpeak(dog);
		makeAnimalSpeak(cat);
		makeAnimalSpeak(cow);

		makeAnimalMove(dog);
		makeAnimalMove(cat);
		makeAnimalSpeak(cow);

	}

	public static void makeAnimalSpeak(Animal animal) {
		animal.speak();
	}

	public static void makeAnimalMove(Animal animal) {
		animal.move();
	}

}
