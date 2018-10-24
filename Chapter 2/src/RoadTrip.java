import java.text.NumberFormat;


public class RoadTrip {

	public static void main(String[] args) {
		double distance = 2758.9, mpgCity = 35, mpgHighway = 41, mpgAverage, driveTime = 41,
				gasPrice = 2.79, hotelPriceAverage = 168.2, foodPriceAverage = 40, peopleAmount = 7,
				activityPrices = 30, minimumWage = 8.60;
		
		mpgAverage = mpgHighway * .9 + mpgCity * .1;
		double daysOfTrip = Math.ceil(driveTime / 7) * 2 + 7; //days to drive back and forth plus one
		//week of events
		double gasPriceTotal = 2 * distance / mpgAverage * gasPrice;
		double hotelPriceTotal = hotelPriceAverage * daysOfTrip;
		double tripPriceTotal = gasPriceTotal + hotelPriceTotal + foodPriceAverage *
				daysOfTrip + activityPrices * 7;
		double myShareOfCost = tripPriceTotal / peopleAmount;
		double jobHours = Math.ceil(myShareOfCost / minimumWage);
		double savingsPerWeek = myShareOfCost / 36; //36 weeks until graduation
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println("The trip will take " + daysOfTrip + " days.\nIt will cost a total of " + 
				money.format(tripPriceTotal) + ".\nHotels will cost a total of " + 
				money.format(hotelPriceTotal) + ".\nGas will cost a total of " + 
				money.format(gasPriceTotal) + ".\nMy share of the cost is " + 
				money.format(myShareOfCost) + ".\nIt will take me a total of " + jobHours + 
				" hours of work to earn enough money.\nI will have to save " + 
				money.format(savingsPerWeek) + " per week in order to have enough money by "
						+ "graduation.");
	}

}
