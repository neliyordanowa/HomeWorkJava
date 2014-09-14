import java.util.Scanner;


public class _05_DecimalToHexadecimal {
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		 int decimal = input.nextInt();
		 String hexademical = Integer.toHexString(decimal); // convert Dec t0 Hex
		 
		 System.out.println(hexademical.toUpperCase());
	}

}
