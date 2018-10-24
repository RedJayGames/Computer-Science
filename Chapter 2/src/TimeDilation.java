
public class TimeDilation {
	public static void main(String[] args) {
		System.out.println("v\t\t\ttv");
		double tv, v;
		final int C = 3 * (int) Math.pow(10, 8);
		final int T0 = 100;
		
		v = .01 * C;
		tv = T0 / Math.pow((1 - (Math.pow(v,2)) / (Math.pow(C,2))),0.5);
		System.out.println(v + "\t" + tv);
		
		v = .1 * C;
		tv = T0 / Math.pow((1 - (Math.pow(v,2)) / (Math.pow(C,2))),0.5);
		System.out.println(v + "\t\t" + tv);
		
		v = .5 * C;
		tv = T0 / Math.pow((1 - (Math.pow(v,2)) / (Math.pow(C,2))),0.5);
		System.out.println(v + "\t\t" + tv);
		
		v = .9 * C;
		tv = T0 / Math.pow((1 - (Math.pow(v,2)) / (Math.pow(C,2))),0.5);
		System.out.println(v + "\t\t" + tv);
		
		v = .95 * C;
		tv = T0 / Math.pow((1 - (Math.pow(v,2)) / (Math.pow(C,2))),0.5);
		System.out.println(v + "\t\t" + tv);
		
		v = .99 * C;
		tv = T0 / Math.pow((1 - (Math.pow(v,2)) / (Math.pow(C,2))),0.5);
		System.out.println(v + "\t\t" + tv);
		
		v = .999 * C;
		tv = T0 / Math.pow((1 - (Math.pow(v,2)) / (Math.pow(C,2))),0.5);
		System.out.println(v + "\t\t" + tv);
		
		v = .9999 * C;
		tv = T0 / Math.pow((1 - (Math.pow(v,2)) / (Math.pow(C,2))),0.5);
		System.out.println(v + "\t" + tv);
		
	}
}