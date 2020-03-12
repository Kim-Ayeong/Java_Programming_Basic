public class Class1 {

	public static double dot(double[] xs, double[] ys) {
		int n = xs.length;
		double total = 0;
		
		for(int i=0; i<n; i++) {
			total += xs[i] * ys[i];
		}
		return total;
	}
}
// 벡터 내적 구하기 = x1*y1 +x2*y2 + x3*y3
