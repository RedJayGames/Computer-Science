
public class HeatIndex {
	public static void main(String[] args) {
		final int T = 80;
		double HI, R = 0;
		while(R <= 100){
			HI = -42.379 + 2.04901523 * T + 10.14333127 * R + 
					-(0.22475541 * T * R) + 
					-(6.83 * Math.pow(10,-3) * Math.pow(T,2)) + 
					-(5.481717 * Math.pow(10,-2) * Math.pow(R,2)) + 
					1.22874 * Math.pow(10,-3) * Math.pow(T,2) * R + 
					8.5282 * Math.pow(10,-4) * T * Math.pow(R,2) + 
					-(1.99 * Math.pow(10,-6) * Math.pow(T,2) * Math.pow(R,2));
			System.out.println(R + "\t\t" + HI);
			R = R + 10;
		}
	}
}