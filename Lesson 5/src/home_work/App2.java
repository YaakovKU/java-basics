package home_work;

public class App2 {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[5];
		
		animals[0] = new Cat(101, "aaa");
		animals[1] = new Cat(102, "bbb");
		animals[2] = new Dog(103, "ccc");
		animals[3] = new Cow(104, "ddd");
		animals[4] = new Dog(105, "eee");
		
		/*
		 * the behavior the reference is determined by the runtime object type and not the reference type*/
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
			animals[i].move();
			System.out.println("======");
		}
	}

}
