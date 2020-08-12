package advanced_interface;

public class Point implements Movable {
	private int x;
	private int y;

	public void print() {
		System.out.println("Point Location is: (" + x + " , " + y + ")");
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
