package home_work;

public class App {

	public static void main(String[] args) {

//		polymorphism - pointing to specific objects with general reference (higher up the hierarchy)

		Animal animal;

//		Cat cat=new Cat(1,"Kitty");
		animal = new Cat(1, "Kitty");

		System.out.println('\n' + "Here is animal # " + animal.getId());
		System.out.println("It's name is   " + animal.getName());
		animal.speak();
		animal.move();

//        Dog dog=new Dog(2,"Cooper");
		animal = new Dog(2, "Cooper");

		System.out.println('\n' + "Here is animal # " + animal.getId());
		System.out.println("It's name is   " + animal.getName());
		animal.speak();
		animal.move();

		Cow cow = new Cow(3, "Molly");

		System.out.println('\n' + "Here is animal # " + cow.getId());
		System.out.println("It's name is   " + cow.getName());
		cow.speak();
		cow.move();

	}

}
