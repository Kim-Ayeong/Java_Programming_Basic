
public class Class3 {

	public static double[] plus(double[] xs, double[] ys) {
		double[] longer = xs.length > ys.length? xs : ys;
		double[] shorter = xs.length > ys.length? ys : xs;
		
		double[] ans = new double[longer.length];
		for(int i=0; i<longer.length; i++) {
			ans[i] = longer[i] + shorter[i % shorter.length];
		}
		return ans;
	}
}
// 길이가 다른 배열 더하기
