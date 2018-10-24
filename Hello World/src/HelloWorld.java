import java.util.Random;
import java.lang.Math;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int x = 2;
		int y = 3;
		int sum = x + y;
		System.out.println(sum);
		int z = x + y + sum * 2;
		System.out.println(z);
		System.out.println(z + 1);
		int a = 123 * 5;
		System.out.println(a);
		System.out.println(15 * (5+6));
		float b = 2000000;
		System.out.println(b * b);
		int c = 2000000;
		System.out.println(c * c); 
		int rand = (int) (Math.random()*(2-0));
		System.out.println("Coin flipped!");
		if(rand == 1){
			System.out.println("Heads");
		}else{
			System.out.println("Tails");
		}
		double temp = 75.4;
		String town = "Manchester"; //String stores a message as a variable
		String firstName = "Corbin"; 
		String lastName = "Grosso";
		char middleInitial = 'E'; //char data type stores a single character
		//and must use quotation marks
		boolean isWarm = true; //boolean sets a variable as either true or false.
		//true or false MUST be written in all lowercase
		int d = 3;
		int e = 5;
		System.out.println(d / e);
		double gpa = 3.4;
		if(gpa >= 3.0){
			System.out.println("Great Job!");
		}
		double yourBalance = -.50;
		double siblingBalance = 24;
		if(yourBalance > siblingBalance){
			System.out.println("You're the better sibling!");
		}else if(yourBalance < siblingBalance){
			System.out.println("You're the worse sibling :(");
		}else{
			System.out.println("Both siblings are equal");
		}
		String favFood = "ice cream";
		String name = "Corbin";
		System.out.println("Someone named " + name + " enjoys eating " + favFood + ".");
		favFood = "pizza";
		name = "Adam";
		System.out.println("Someone named " + name + " enjoys eating " + favFood + ".");
		int f = 3, g = 4, h = 5;
		if(f > 10 || g <= 5){
			System.out.println("I like pi.");
		}
		if(f == 3 && g > 2){
			System.out.println("Boo!");
		}
		int remainder = 25%3;
		double value = Math.pow(f,h); //Math.pow raises the first value to the second value (exponents)
		System.out.println(value);
		
		rand = (int) (Math.random()*(10-0));
		remainder = rand % 2;
		System.out.println(rand);
		if(remainder == 0){
			System.out.println("It's even!");
		}else if(remainder == 1){
			System.out.println("It's odd!");
		}
		int radius = (int) (Math.random()*(10-0));
		System.out.println(radius);
		double area = Math.PI * Math.pow(radius,2);
		double circumference = 2 * Math.PI * radius;
		System.out.println("The area is " + area + " and the circumference is " + circumference + ".");
		double rand1 = (double) (Math.random()*(10-0));
		double rand2 = (double) (Math.random()*(10-0));
		double rand3 = (double) (Math.random()*(10-0));
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		if(rand1 > rand2 && rand1 > rand3){
			System.out.println(rand1 + " is the greatest.");
		}else if(rand2 > rand1 && rand2 > rand3){
			System.out.println(rand2 + " is the greatest.");
		}else if(rand3 > rand1 && rand3 > rand2){
			System.out.println(rand3 + " is the greatest.");
		}
		System.out.println(Math.PI); 
	}
}
