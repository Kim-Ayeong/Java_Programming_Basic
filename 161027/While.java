
public class While {

	public static double d(int n) {
		double d;
		d = Math.sqrt(n)-Math.sqrt(n-1);
		return d;		
	}
	
	public static void main(String[] args) {
		
		int n = 1;
		double d = d(n);
		while(d>0.001){
			d = d(n);
			n++;
			// n++;
			// d = d(n); 로 쓸 때와 출력값이 다름
		}
		
		System.out.println(n);
		//5-17
	}

}
