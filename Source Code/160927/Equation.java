import java.lang.Math;

public class Equation {

	public static double solveQuadEq(double a, double b, double c){
		
		double ans;
		ans = (-b + Math.sqrt(b*b - 4*a*c))/ 2*a;
		return ans;
		
	}
	public static void main(String[] args) {
		System.out.println(solveQuadEq(1.0, -2.0, 1.0));
	}

}
