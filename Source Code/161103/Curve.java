
public class Curve {
	/* f(x)
	  [0,10) curve
	  0.0, 0.1, ..., 9.9
	  f(0.0), f(0.1), ..., f(9.9)
	 */
	
	public static double f(double x) {
		return Math.exp(-x);
		}
	
	public static void main(String[] args) {
		
		int n = 100;
		double dens[] = new double[n];
		
		/* double beg = 0;
		double end = 10;
		double gridsize = (end-beg)/n;
		
		for(int i=0; i<n; ++i) {
			double x = beg + i * gridsize;
			dens[i] = f(x);
		} 와 같음
		 */
		
		for(int i=0; i<n; ++i) {
			dens[i] = f(i/10.0);
		}
		/*
		 int m = dens.length 크기를 먼저 알고난 후 배열 짜기
		 [0], [1], ..., [m-1]
		 dens[] ~
		 */
		
		System.out.println(dens[3]);
	}

}
