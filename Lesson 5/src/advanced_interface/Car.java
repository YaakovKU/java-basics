package advanced_interface;

public class Car extends Vehcle {

	private Point location = new Point();

	@Override
	public void move(int x, int y) {
		this.location.move(x, y);
	}

	@Override
	public String toString() {
		return "Car [location=" + location + "]";
	}

}
