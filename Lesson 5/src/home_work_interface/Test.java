package home_work_interface;

import home_work.Animal;
import home_work.Cat;
import home_work.Dog;

public class Test {

	public static void main(String[] args) {
//		Dragon dragon = new Dragon(111, "Dragon 1");
//		dragon.smoke();
//
//		System.out.println("=================");

		Animal[] animals = new Animal[5];
		animals[0] = new Dragon(1, "dragon");
		animals[2] = new Dog(2, "dog");
		animals[4] = new Cat(3, "the cat");

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				animals[i].move();
				// animals[i].smoke(); not in this type
				if (animals[i] instanceof Smoker) {
					Smoker smoker = (Smoker) animals[i];
					smoker.smoke();
					// smoker.move(); // not in this type
				}
			}
			System.out.println("================");
		}

	}

}
