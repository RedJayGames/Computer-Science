import java.util.Scanner;


public class BaseConvert {

	public static void main(String[] args) {
		int b, limit, base10Number, digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0, count = 0;
		String newNumber = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("With this program, you can convert\na base-10 number to any base " + 
				"between 2 and 9.\nPlease enter a new base:");
		b = scan.nextInt();
		limit = (int) Math.pow(b,4) - 1;
		System.out.println("Please enter a number to convert.\nNote that the number must be between "
				+ "0 and " + limit + " inclusive.");
		base10Number = scan.nextInt();
		if(base10Number > limit || base10Number < 0){
			System.out.println("Error: Number is outside of acceptable range.\nNext time, please" + 
					" enter a number between 0 and " + limit + " inclusive.");
			//return error for Out Of range, put rest of code in "else" statement
		}else{
			while(count < 4){
				if(count == 0){
					digit1 = base10Number % b;
				}else if(count == 1){
					digit2 = base10Number % b;
				}else if(count == 2){
					digit3 = base10Number % b;
				}else if(count == 3){
					digit4 = base10Number % b;
				}
				base10Number = base10Number / b;
				count++;
			} 
			System.out.println(newNumber + digit4 + digit3 + digit2 + digit1);
		}
		scan.close();
	}
}