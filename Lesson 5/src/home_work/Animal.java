package home_work;

public abstract class Animal {

	int id;

	String name;

	// CTOR
	public Animal(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// Getters&Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Abstract methods
	public abstract void speak();

	public abstract void move();

}
