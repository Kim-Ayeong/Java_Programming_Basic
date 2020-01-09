import java.lang.Math;

public class my {
	public static double f(double x){
		return 1.3 + 2.75 * Math.log(Math.abs(x-2));
	}
	public static double g(double x){
		return Math.pow(x,3) + 2.75 * Math.exp(-x) + Math.sin(2*x+1);
	}
	
	public static void main(String[] args) {
		System.out.println(f(1.5));
		System.out.println(g(2.0));
	}
}
