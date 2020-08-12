package home_work;

public class Cat extends Animal{

	public Cat(int id, String name) {
		super(id, name);
		}
	
	@Override
	public void speak() {
		System.out.println("Meow");
		}
	
	@Override
	public void move() {
		System.out.println("move like a cat");		
	}
	  
}
