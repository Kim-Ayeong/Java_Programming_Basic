import java.lang.Math;

public class Finance {

	public static double fv(double p, double r, double n){
		
		double ans;
		ans = p * Math.pow(1+r, n);
		return ans;
	
	}
	public static void main(String[] args) {
		System.out.println(fv(1000000, 0.0277, 10));
	}
}
