/****************************************************************************
*
* Created by: Patrick Nguyen
* Created on: October 2016
* This Program Sorts Uses the Vehicle Class For Testing
*
****************************************************************************/
import java.util.Scanner;

public class Main {

    // function to restrict value inputed to only be a double 
	public static double restrictInputToDouble()
	{
		Scanner scan = new Scanner(System.in);
	
		boolean isValid = false;
		double sideLength = 0;
		
		// process
		while(isValid == false){
			try {
				sideLength = Double.parseDouble(scan.nextLine());
				isValid = true;		
			} 
			
			catch (NumberFormatException e) {
				
				System.err.println("Invalid Input!");
		    
			}
		}
		return sideLength;
	}
	
	
	public static void main (String args[])
	{	  
		// variables
		double side1;
		double side2;
		double side3;
		
		while (true)
		{
			// goes to recursion procedure
			System.out.println("Enter the Value For Side #1");
			side1 = restrictInputToDouble();
			System.out.println("Enter the Value For Side #2");
			side2 = restrictInputToDouble();
			System.out.println("Enter the Value For Side #3");
			side3 = restrictInputToDouble();

			Triangle Triangle1 = new Triangle(side1, side2, side3);

			if (Triangle1.isValid().equals(true))
			{
				// users can manually display properties if they wish, but 
				// showing all properties makes it alot easier to show info
				Triangle1.showProperties();
			}
			else
			{
				System.out.println("TRIANGLE IS NOT VALID");
			}
		}
		
	}
}
