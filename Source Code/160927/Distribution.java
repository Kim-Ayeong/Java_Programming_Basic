import java.lang.Math;

public class Distribution {
	
	public static double pexp(double x, double lambda) {
		double ans;
		ans = 1 - Math.exp(-lambda * x);
		// ans = 1- Math.pow(Math.E, -lambda*x) 와 같음
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(pexp(2.3, 1.2));
	}
}
