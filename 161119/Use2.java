
public class Use2 {

	public static void main(String[] args) {
		
		int[] xs = new int[] {1,3,5,7,9};
		
		double m = xs[0];
		for(int i=1; i<xs.length; ++i) {
			if(m<xs[i]) {
				m = xs[i];
			}
		}
	}
} // 최대를 구할 때
