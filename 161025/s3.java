
public class s3 {

	public static double dnorm(double x) {
		return Math.exp(-x*x/2) / Math.sqrt(2*Math.PI);
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			double x = (double)i /10;
			System.out.println("dnorm(" + x + ")=" + dnorm(x));
		}
	}
}
