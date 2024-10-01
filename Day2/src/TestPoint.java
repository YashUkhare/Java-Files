import java.util.Scanner;
class TestPoint{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y coordinates for point1: ");

		Point2D p1 = new Point2D(sc.nextDouble(),sc.nextDouble());
		p1.show();
		System.out.println("Enter x and y coordinates for point2: ");
		Point2D p2 = new Point2D(sc.nextDouble(),sc.nextDouble());
		boolean yash = p2.isEqual(p1);
		double distance = p1.calculateDistance(p2);
		System.out.println(yash?"Both are equal!":"Not eaqual");
		System.out.println("Distance of point 1 is "+distance);
	}
}