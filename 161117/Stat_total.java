import java.lang.Math;
import java.util.Arrays;

public class Stat_total {
	
	//runif(n) > [n1, n2,..., nn] 만듬
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
		int n = xs.length;
		double sumsq = 0;
		double sum = 0;
		for(int i=0; i<n; i++) {
			sumsq += xs[i]*xs[i];
			sum += xs[i];
		}
		double v = sumsq/(n-1) - sum*sum /(n*(n-1));
		return v;
	}
	
	public static double sd(double[] xs) {
		return Math.sqrt(var(xs));
	}
	
	public static double max(double[] xs) {
		double ans;
		ans = xs[0];
		for(int i=1; i<xs.length; ++i) {
			if(ans<xs[i]) ans = xs[i];
		}
		return ans;
	}
	
	public static double min(double[] xs) {
		double ans;
		ans = xs[0];
		for(int i=1; i<xs.length; ++i) {
			if(ans>xs.length) ans = xs[i];
		}
		return ans;
	}
	
	//range([1,3,2,7,-3,-1]) > [-3,7]
	
	public static double[] range(double[] xs) {
		double[] ans = new double[2];
		ans[0] = min(xs);
		ans[1] = max(xs);
		return ans;
	}
	
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

	public static double[] random(int n) {
		  double[] ans = new double [n];
		  for(int i=0; i<n; i++) {
		   ans[i] = Math.random();
		  }
		  return ans;
		 }
	
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
		
		double[] as = runif(5);
		
		System.out.println(as);
		
		double[] xs = {1.0, 2.0, 3.0};
		
		System.out.println(sum(xs));
		System.out.println(mean(xs));
		System.out.println(var(xs));
		System.out.println(sd(xs));
		System.out.println(max(xs));
		System.out.println(min(xs));

		double[] ys = {4.0, 5.0, 6.0};
		
		System.out.println(Arrays.toString(plus(xs, ys)));
		System.out.println(Arrays.toString(multiply(xs, ys)));
		  // System.out.println(Arrays.toString(range(xs))); >> [1.0, 3.0] 출력
		
		System.out.println(Arrays.toString(random(6)));
		
		System.out.println(Arrays.toString(seq(1.0, 2.0, 0.2)));
		System.out.println(Arrays.toString(rep(1.0, 4)));
		System.out.println(Arrays.toString(rep(xs, 2)));
	}
}

