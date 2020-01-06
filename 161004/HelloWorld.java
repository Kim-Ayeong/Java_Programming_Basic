package cond;

public class HelloWorld {

	boolean is_odd(int n){
		return n%2 ==1;
		}
	public static int max(int a, int b) {
		int ans;
		if (a>b){
		ans = a;
		}
		else {
		ans = b;
		}
		return ans;
		}
			// = return a>b? a:b;
	
	public static void main(String[] args) {
	
		System.out.println(7+4*3>20);
		System.out.println(Math.PI>3);
		System.out.println(Math.pow(2, 100)>Math.pow(10,  30));
		System.out.println("------");

		boolean p = 7+4*3 >= 20;
		boolean q = Math.PI > 3;
		double c = Math.pow(2, 10);
		boolean r = 1e30 < c && c < 1e31;
			// 1e30 = Math.pow(10,30)
			//3.715e13 = 3.715*10^13
			//0.2e10 = (0.2*10)^10 (?) =/ 2^10
		
		System.out.println(!p||q && !q||r);
		System.out.println("------");
		
		System.out.println(max(11,15));
		
		System.out.println(0.2e10);
	}

}
