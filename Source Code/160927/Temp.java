
public class Temp {

	public static double f2c(double f) {
		
		double ans;
		ans = 5.0*(f-32)/9.0;
		return ans;
	
	}
	public static void main(String[] args) {
		System.out.println(f2c(75));
	}
}
