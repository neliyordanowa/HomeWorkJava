import java.util.Scanner;

public class _09_PointsInsideHouse {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		float pointX = input.nextFloat();
		float pointY = input.nextFloat();
		//check if the point is in the rectangle:
		boolean triangleIn = false;
		if (((22.5 - 12.5) * (pointY - 8.5) - (8.5 - 8.5) * (pointX - 12.5) <= 0)
				&& ((17.5 - 12.5) * (pointY - 8.5) - (3.5 - 8.5)
						* (pointX - 12.5) >= 0)
				&& ((22.5 - 17.5) * (pointY - 3.5) - (8.5 - 3.5)
						* (pointX - 17.5) >= 0)) {
			triangleIn = true;
		}
		
		//Check if the point is in the rectangles: 
		boolean recIn = false;
		if (((pointX >= 12.5 && pointX <= 17.5) && (pointY >= 8.5 && pointY <= 13.5))
				|| ((pointX >= 20.5 && pointX <= 22.5) && (pointY >= 6 && pointY <= 13.5))) {
			recIn = true;
		}

		if (triangleIn || recIn) {
			System.out.println("Intside!");
		} else {
			System.out.println("Outside!");
		}
	}

}
