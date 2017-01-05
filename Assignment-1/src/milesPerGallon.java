import java.util.Scanner;
public class milesPerGallon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter Miles Travelled: ");
		int miles = s.nextInt();
		System.out.print("Enter Gallons used: ");
		float gallons = s.nextFloat();
		
		float mpg = miles / gallons;
		
		System.out.println("Great! You have the fuel efficency of " + mpg + " Miles Per Gallon");
		
		s.close();
	}

}
