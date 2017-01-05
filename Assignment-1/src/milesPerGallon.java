import java.util.Scanner;
public class milesPerGallon {
	public static void main(String[] args) {
		
		//Create a new Scanner object s to take input from user
		Scanner s= new Scanner(System.in);
		
		//Accept the input from user for Miles travelled
		System.out.print("Enter Miles Travelled: ");
		int miles = s.nextInt();
		
		//Accept the input form user for Gallons used
		System.out.print("Enter Gallons used: ");
		float gallons = s.nextFloat();
		
		//Calcuate the Miles Per Gallon using the formula miles divided by gallons
		float mpg = miles / gallons;
		
		//Printing the output to console
		System.out.println("Great! You have the fuel efficency of " + mpg + " Miles Per Gallon");
		
		//Closing the Scanner object s
		s.close();
	}

}
