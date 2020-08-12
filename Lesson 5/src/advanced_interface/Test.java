package advanced_interface;

public class Test {
	public static void main(String[] args) {

		Car car = new Car();
		System.out.println(car);

		car.move(5, 7);
		System.out.println(car);

		Point p = new Point();
		System.out.println(p);

		p.move(8, 10);
		System.out.println(p);
	}
}
