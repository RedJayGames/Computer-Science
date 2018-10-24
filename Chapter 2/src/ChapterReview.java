//		Self-Review Questions
//		2.1 classes and methods
//		2.2 the user does not need to know how the object works to use it
//			2.3 stores values and can be used as variables
//			2.4 the value of the string
//			2.5 print does not set the cursor on a new line
//			2.6 specifications necessary to carry out a method
//			2.7 \n \t etc. carries out a command. backslash tells program that next character is special
//			2.8 declare data type then name variable. end there and define later or = value
//			2.9 2 ^ 32
//			2.10 list of characters in a particular order
//			2.11 math follows order of operations
//			2.12 4
//			2.13 4. no double present
//			2.14 you are not losing information
//			2.15 enumerators allow data type creation with custom values
//			2.16 creates a new thing
//			2.17 wrapper class
//			2.18 bundle of commands by class that are built into java but are not loaded by default
//			2.19 it is used too commonly to not be added by default
//			2.20 can be called without creating an object of that type
//			2.21 applet is transferred online application is stand-alone
//			
//		Multiple Choice
//			2.1 C
//		2.2 E
//		2.3 D
//		2.4 B
//		2.5 A
//		2.6 E
//		2.7 A <
//		2.8 C
//		2.9 D
//		2.10 B
//			
//		True/False
//		2.1 True
//		2.2 False
//		2.3 True
//		2.4 True
//		2.5 True
//		2.6 False
//		2.7 True
//		2.8 True
//			
//		Short Answer (skip 2.8)
//			2.1 prints “I gotta be me!” and sets cursor on next line
//		2.2 Here we go!12345
//			Test this if you are not sure.Another.
//			
//			All done.
//		2.3 It’s on two lines without a cancatinator
//		2.4 50 plus 25 is 5025
//		2.5 He thrusts his fists
//			against the posts
//		      and still insists
//			he sees the “ghost”
//		2.6 A. 5
//		B. 5.0
//		C. 3
//		D. 3.4
//		E. 1.0
//		F. 1.33020344
//		G. 0
//		H. 0.625
//		I. 0.625
//		J. 0.0
//		K. 3
//		L. 3.0
//		M. 0.0
//		N. 2
//		O. 6
//		P. 17
//		Q. 0
//		2.7 A. 1 2 3
//			B. 1 2 3
//			C. 3 1 2
//			D. 3 1 2
//			E. 1 2 3
//			F. 1 2 3
//			G. 1 2 3
//			H. 2 1 3
//			I. 2 1 3
//			J. 3 1 2
//			K. 2 1 3 4
//			L. 3 1 2 4
//			M. 1 2 4 3
//			N. 1 3 2 4
//		2.8 enum Day {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday};
//		Day Sunday;
//		2.9 Quest for tze Holy Grail quest for tze zoly grail
//		2.10 double num3 = Math.pow(num1 + num2, 1 / 2);
//		2.11 Math.abs(total);
//		2.12 A. 0-19 inclusive
//			B. 1-8 inclusive
//			C. 10-54 inclusive
//			D. -50-49 inclusive
//		2.13 Random rand = new Random();
//		rand.nextInt(11);
//		rand.nextInt(501);
//		rand.nextInt(10) + 1;
//		rand.nextInt(500) + 1;
//		rand.nextInt(26) + 25;
//		rand.nextInt(26) - 10;
//			
//		Programming Projects (2.10 and 2.13 only)
import java.util.Random;
import java.util.Scanner;

public class ChapterReview {

	public static void main(String[] args) {
		//Area of a triangle using Heron's formula
		Scanner scan = new Scanner(System.in);
		double a, b, c, s, area;

		System.out.println("Please enter your first side length:");
		a = scan.nextInt();

		System.out.println("Please enter your second side length:");
		b = scan.nextInt();

		System.out.println("Please enter your third side length:");
		c = scan.nextInt();

		s = (a + b + c) / 2;
		//System.out.println(s);
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); //Heron's formula
		System.out.println("The area of the triangle is " + area);



		//Phone number generator
		Random rand = new Random();
		int digit1, digit2, digit3, digits456, digit7, digit8, digit9, digit10;
		String concat = "";

		digit1 = rand.nextInt(8);
		digit2 = rand.nextInt(8);
		digit3 = rand.nextInt(8);
		digits456 = rand.nextInt(743);
		digit7 = rand.nextInt(10);
		digit8 = rand.nextInt(10);
		digit9 = rand.nextInt(10);
		digit10 = rand.nextInt(10);

		if(digits456 >= 100){
			System.out.println(concat + digit1 + digit2 + digit3 + "-" + digits456 + "-" + digit7 + digit8 + digit9 + digit10);
		}else if(digits456 >= 10 && digits456 < 100){
			System.out.println(concat + digit1 + digit2 + digit3 + "-" + 0 + digits456 + "-" + digit7 + digit8 + digit9 + digit10);
		}else{
			System.out.println(concat + digit1 + digit2 + digit3 + "-" + 0 + 0 + digits456 + "-" + digit7 + digit8 + digit9 + digit10);
		}
		scan.close();
	}
}


	//		AP-Style Multiple Choice
	//		2.1 E <
	//		2.2 B
	//		2.3 C