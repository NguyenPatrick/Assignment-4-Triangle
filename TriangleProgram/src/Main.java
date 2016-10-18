/****************************************************************************
*
* Created by: Patrick Nguyen
* Created on: October 2016
* This Program Sorts Uses the Vehicle Class For Testing
*
****************************************************************************/
import java.util.Scanner;

public class Main {

	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		  
		double side1 = 0;
		double side2 = 0;
		double side3 = 0;

		if (scan.hasNextDouble())
		{			
			side1 = scan.nextInt();
		}
		else
		{
			System.out.println("NOT A DOUBLE!");
		}
		if (scan.hasNextDouble())
		{
			
			side2 = scan.nextInt();
		}
		else
		{
			System.out.println("NOT A DOUBLE!");
		}
			
		if (scan.hasNextDouble())
		{			
			side3 = scan.nextInt();
		}
		else
		{
			System.out.println("NOT A DOUBLE!");
		}
			
		System.out.println(side1 + side2 + side3);
			
		
		Triangle Triangle1 = new Triangle(side1, side2, side3);

		
		
	}
}
