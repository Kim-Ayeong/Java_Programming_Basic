import java.lang.Math;
import java.util.Arrays;

public class Stat4 {

	public static double[] plus(double[] xs, double[] ys) {
		int n = xs.length;
		double[] ans = new double[n];
		for(int i=0; i<n; ++i) {
			ans[i] = xs[i]+ys[i];
		}
		return ans;
	}
	
	public static double[] multiply(double[] xs, double[] ys) {
		int a = Math.max(xs.length, ys.length);
		double[] ans = new double [a];
		for(int i=0; i<xs.length; i++) {
			ans[i] = xs[i] * ys[i];
		}
		return ans;
	}
	
	/*
	 public static double[] range(double[] xs) {
		double[] ans = new double [2];
		ans[0] = min(xs);
		ans[1] = max(xs);
		return ans;
	} Stat3 과 연결
	*/

	public static double[] random(int n) {
		double[] ans = new double [n];
		for(int i=0; i<n; i++) {
			ans[i] = Math.random();
		}
		return ans;
	}
	
	public static void main(String[] args) {
	
		double[] xs = {1.0, 2.0, 3.0};
		double[] ys = {4.0, 5.0, 6.0};
		
		System.out.println(Arrays.toString(plus(xs, ys)));
		System.out.println(Arrays.toString(multiply(xs, ys)));
		// System.out.println(Arrays.toString(range(xs))); >> [1.0, 3.0] 출력
		System.out.println(Arrays.toString(random(6)));
	}
}
