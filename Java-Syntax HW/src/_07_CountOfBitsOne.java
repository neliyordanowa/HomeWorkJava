import java.util.Scanner;

public class _07_CountOfBitsOne {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		int counter = 0;
		int bit;
		for (int i = 0; i < 16; i++) {
			bit = number & 1;
			if (bit == 1) {
				counter++;

			}
			number = number >> 1;
		}

		System.out.println(counter);
	}

}
