package advanced_interface;

public class Track extends Vehcle {
	private Point location;

	@Override
	public void move(int x, int y) {
		this.location.move(x, y);
	}

	@Override
	public String toString() {
		return "Track [location=" + location + "]";
	}
}
