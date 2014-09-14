import java.util.Scanner;

public class _04_SmallestNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		float minValue;
		// System.out.println(Math.min(a, Math.min(b, c)));

		if (a <= b) {

			minValue = a;
			if (c < minValue) {
				minValue = c;
			}
			
		}
		else {
			minValue=b;
			if (c < minValue) {
				minValue = c;
			}
			
		}
		
		System.out.println(minValue);
	}
	
}