
public class QuadEqsolver {

	public static void Solve(double a, double b, double c){
		if(a == 0){
			if(b == 0){
				System.out.print("해가 없다.");
			} else {
				 System.out.println("");
			}
		
		} else {
			
			double d = b*b - 4*a*c;
			if(d < 0) {
				System.out.println("");
			} else if(d == 0) {
				 System.out.println("");
			} else{
				System.out.println("");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
	}

}
