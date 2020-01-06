
public class Temp {

	public static double f2c (double fahr) {
		double ans;
		ans = 5.0/9.0*(fahr-32);
		return ans; 
	}
	public static void main(String[] args) {
		System.out.println(f2c(100));
	}
}
