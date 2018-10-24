//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
public class Paint
{
	public static void main(String[] args)
	{
		final int COVERAGE = 350; //paint covers 350 sq ft/gal
		double length, width, height, doors, windows; //declare integers length, width, and height;

		double totalSqFt; //declare double totalSqFt;

		double paintNeeded; //declare double paintNeeded;

		Scanner scan = new Scanner (System.in);//declare and initialize Scanner object

		System.out.print("What is the length of the room?"); //Prompt for and read in the length of the room
		length = scan.nextDouble();
		System.out.print("What is the width of the room?");//Prompt for and read in the width of the room
		width = scan.nextDouble();
		System.out.print("What is the height of the room?");//Prompt for and read in the height of the room
		height = scan.nextDouble();
		System.out.print("How many doors are in the room?");
		doors = scan.nextDouble();
		System.out.print("How many windows are in the room?");
		windows = scan.nextDouble();

		totalSqFt = 2 * length * height + 2 * width * height - 20 * doors - 15 * windows;//Compute the total square feet 
		//to be painted – think about the dimensions of each wall
		if(totalSqFt < 0){
			System.out.println("This is invalid. Please double check your numbers.");
		}else{
			paintNeeded = Math.ceil(totalSqFt / COVERAGE);//Compute the amount of paint needed

			System.out.println("length: " + length + "\nwidth: " + width + "\nheight: " + height);
			//Print the length, width, and height of the room and the
			System.out.println("gallons of paint needed: " + paintNeeded);//number of gallons of paint needed.
		}
	}
}
