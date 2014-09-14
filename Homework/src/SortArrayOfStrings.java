
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class SortArrayOfStrings {
	public static void main(String[] args) {
		
		System.out.println("Enter number:");
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		
		String inputString[]=new String[n];
		
		for (int i = 0; i < inputString.length; i++) {
			inputString[i]=input.next();
		}
		
		Arrays.sort(inputString);
		
		for (String output : inputString) {
			System.out.println(output);
		}
	}
}
