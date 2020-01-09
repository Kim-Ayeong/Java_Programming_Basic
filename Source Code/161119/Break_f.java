
public class Break_f {

	public static double d(int n) {
		return n;
	}
	
	public static void main(String[] args) {
		int i;
		for(i=1; i<10000; i++) {
			if(d(i)<0.001) break;
		}
		
		System.out.println(i);
		}
	}

