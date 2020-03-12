import java.util.Arrays;

public class Stat5 {

	public static double[] seq(double from, double to, double by) {
		double n = (to - from) / by;
		double[] ans = new double [(int)n];
		for(int i=0; i<n; i++) {
			ans[i] = from + by * i;
		}
		return ans;
	}

	public static double[] rep(double x, int n) {
		double[] ans = new double [n];
		for(int i=0; i<n; i++) {
			ans[i] = x;
		}
		return ans;
	}
	
	public static double[] rep(double[] xs, int n) {
		int m = xs.length * n;
		double[] ans = new double [m];
		for(int i=0; i<m; i++) {
			ans[i] = xs[i % xs.length];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		double[] xs = {1.0, 2.0, 3.0};
		
		System.out.println(Arrays.toString(seq(1.0, 2.0, 0.2)));
		System.out.println(Arrays.toString(rep(1.0, 4)));
		System.out.println(Arrays.toString(rep(xs, 2)));
	}
}
