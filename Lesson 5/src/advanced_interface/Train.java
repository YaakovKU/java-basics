package advanced_interface;

public class Train extends Vehcle {

	private Point location;

	@Override
	public void move(int x, int y) {
		this.location.move(x, y);
	}

	@Override
	public String toString() {
		return "Train [location=" + location + "]";
	}
}
