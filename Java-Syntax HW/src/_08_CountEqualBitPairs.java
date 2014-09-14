import java.util.Scanner;

public class _08_CountEqualBitPairs {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		int counter = 0;
		int bitPair11;
		int numberOneCount = number;
		for (int i = 0; i < 16; i++) {
			bitPair11 = numberOneCount & 3;
			if (bitPair11 == 3) {
				counter++;

			}
			numberOneCount = numberOneCount >> 1;
		}

		int bitPair00;
		int numberZeroCount = number;

		while (numberZeroCount > 0) {
			bitPair00 = (numberZeroCount ^ 3) & 3;
			if (bitPair00 == 3) {
				counter++;
			}
			numberZeroCount = numberZeroCount >> 1;
		}

		System.out.println(counter);

	}
}
