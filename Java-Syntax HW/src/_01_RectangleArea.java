import java.util.Scanner;


public class _01_RectangleArea {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first side of the rectangle:");
		int sideA = input.nextInt();
		System.out.print("Enter the second side of the rectangle:");
		int sideB = input.nextInt();
		
		System.out.println("The rectangles area is: " + sideA*sideB);
		
	}

}
