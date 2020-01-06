

public class Stat2 {
	
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
	//앞의 분산 함수와 같음

}
