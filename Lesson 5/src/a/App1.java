package a;

public class App1 {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(4, 5);
		System.out.println(r.getArea());
		System.out.println(r.getColor());
		
		Circle c =new Circle(3);
		c.setColor("Yello");
		System.out.println(c.getArea());
		System.out.println(c.getColor());

	}

}
