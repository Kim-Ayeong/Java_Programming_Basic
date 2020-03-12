
public class Stat3 {

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
	
	//plus([1,2,3], [4,5,6,7,8,9]) > [5,7,9,8,10,12]
	//크기가 큰 배열 기중, 크기가 작은 배열은 반복
	
	public static void main(String[] args) {
		
		
		
	}

}
