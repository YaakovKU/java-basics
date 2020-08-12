package home_work;

public class Cow extends Animal{
	public Cow(int id, String name) {
		super(id, name);
		}
	
	@Override
	public void speak() {
		System.out.println("Moo");
		}
	
	@Override
	public void move() {
		System.out.println("move like a Cow");		
	}
}
