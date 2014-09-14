import java.util.Locale;
import java.util.Scanner;


public class _03_PointsInsideFigure {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		float pointX = input.nextFloat();
		float pointY=input.nextFloat();
		
		if (((pointX>=12.5 && pointX<=17.5) && (pointY>=6 && pointY<=13.5))
		|| ((pointX>=20 && pointX<=22.5) && (pointY>=6 && pointY<=13.5))
		|| ((pointX>=17.5 && pointX<=20) && (pointY>=6 && pointY<=8.5))){
			System.out.println("Inside!");
		}
		else {
			System.out.println("Outside!");
		}
		
	}

}
