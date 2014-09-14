
import java.util.Scanner;
public class SumTwoNumbers {
	public static void main(String[] args) {
	int a;
	int b;
	
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
		System.out.print("Enter first number=");
		a=input.nextInt();
		
		System.out.print("Enter second number=");
		b=input.nextInt();
		
		System.out.print("Result:"+(a+b));
}
}
