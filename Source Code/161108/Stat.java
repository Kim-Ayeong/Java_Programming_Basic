import java.lang.Math;

public class Stat {
	
	//runif(n) > [n1, n2,..., nn]
	public static double[] runif(int n) {
		double[] ans = new double[n];
		for(int i=0; i<n; ++i) {
			ans[i] = Math.random();
			//System.out.println(Math.random()); 로 하면 저장되지 않음
		}
		return ans;
	}
	
	public static double sum(double[] xs) {
		int n = xs.length;
		double ans = 0;
		for(int i=0; i<n; ++i) {
			ans += xs[i];
		}
		return ans;
	}
	
	public static double mean(double[] xs) {
		return sum(xs)/xs.length;
	}
	
	public static double var(double[] xs) {
		double ss = 0;
		double m = mean(xs);
		for(int i=0; i<xs.length; i++) {
			double d = xs[i]-m;
			ss += d*d;
		}
		return ss/(xs.length-1);
	}
	
	public static double sd(double[] xs) {
		return Math.sqrt(var(xs));
	}
	
	
	public static void main(String[] args) {
		double[] xs = runif(30);
		double total = sum(xs);
		double ave = mean(xs);
		double v = var(xs);
		double s = sd(xs);
		
		System.out.println(s);
	}
}

