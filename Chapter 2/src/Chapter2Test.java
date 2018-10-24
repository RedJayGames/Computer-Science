import java.util.Scanner;


public class Chapter2Test {

	public static void main(String[] args) {
		//wind chill equation
		double t, v, w; 
		Scanner scan = new Scanner(System.in);

//		System.out.println("Please enter the temperature in Fahrenheit:");
//		t = scan.nextDouble(); //gets temperature
//
//		System.out.println("Please enter the wind speed in miles per hour:");
//		v = scan.nextDouble(); //gets wind speed
//
//		if(Math.abs(t) > 50){
//			System.out.println("The temperature is out of range.\nPlease ensure it is between" + 
//					" -50 and 50 inclusive.");
//		}else if(v > 120 || v < 3){
//			System.out.println("The wind speed is out of range.\nPlease ensure it is between" + 
//					" 3 and 120 inclusive.");
//		}else{
//			w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16); //wind chill equation
//
//			System.out.println("The wind chill is "+ w);
//		}
		//day of the week calculator
		int m = 0, d, y, x, y0, m0, d0;
		String givenMonth;

		System.out.println("Please enter a month:");
//		m = scan.nextInt();
				givenMonth = scan.nextLine();

		//turning given month into a value for the formula
		if(givenMonth.equals("January")){
			m = 1;
		}else if(givenMonth.equals("February")){
			m = 2;
		}else if(givenMonth.equals("March")){
			m = 3;
		}else if(givenMonth.equals("April")){
			m = 4;
		}else if(givenMonth.equals("May")){
			m = 5;
		}else if(givenMonth.equals("June")){
			m = 6;
		}else if(givenMonth.equals("July")){
			m = 7;
		}else if(givenMonth.equals("August")){
			m = 8;
		}else if(givenMonth.equals("September")){
			m = 9;
		}else if(givenMonth.equals("October")){
			m = 10;
		}else if(givenMonth.equals("November")){
			m = 11;
		}else if(givenMonth.equals("December")){
			m = 12;
		}

		System.out.println("Please enter a day:");
		d = scan.nextInt();

		System.out.println("Please enter a year:");
		y = scan.nextInt();

		//Formula for Day of the Week
		y0 = y - (14 - m) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = m + 12 * ((14 - m) / 12) - 2;
		d0 = (d + x + 31 * m0 / 12) % 7;

		System.out.println(d0);
	}
}
