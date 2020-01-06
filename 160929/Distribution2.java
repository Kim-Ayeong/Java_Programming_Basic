import java.lang.Math;

public class Distribution2 {

	public static double dnorm(double x, double m, double s){
		double ans;
		double a = x - m;
		ans = Math.exp(-(a*a)/(2*s*s)) / Math.sqrt(2*Math.PI*s*s);
		return ans;
	}
	public static double dnorm(double x){
		return dnorm(x, 0, 1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(dnorm(0,0,1));
		System.out.println(dnorm(0,0,2));
		System.out.println(dnorm(0));

	}

}
