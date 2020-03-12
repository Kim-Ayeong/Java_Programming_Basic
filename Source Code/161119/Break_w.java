import java.lang.Math;

public class Break_w {

	public static double d(int n) {
		return Math.exp(-n) + 0.001;
	}
	
	public static void main(String[] args) {
		
		int n=1;
		double d = d(n);
		while(d>0.001) {
			n++;
			d = d(n);
			if(n>10000) break;
		}
		
		System.out.println(n);
	}
}
