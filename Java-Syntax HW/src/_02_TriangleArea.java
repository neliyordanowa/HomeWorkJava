import java.util.Scanner;

public class _02_TriangleArea {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int aX = input.nextInt();
		int aY = input.nextInt();
		int bX = input.nextInt();
		int bY = input.nextInt();
		int cX = input.nextInt();
		int cY = input.nextInt();

		// calculating the sides of the rectangle
		double ab = Math.sqrt(Math.pow((aX - bX), 2) + Math.pow((aY - bY), 2));
		double bc = Math.sqrt(Math.pow((bX - cX), 2) + Math.pow((bY - cY), 2));
		double ac = Math.sqrt(Math.pow((aX - cX), 2) + Math.pow((aY - cY), 2));

		// check if this 3 point can create a triangle
		if (ab + bc > ac && ac + ab > bc && bc + ab > ac) {
			double p = (ab + ac + bc) / 2; // half perimeter
			double area = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
			
			System.out.printf( "%.0f",area);
			
		}

		else {
			System.out.println("0");
		}
	}

}
