
public class BMI {

	public static double bmi(double h, double w){
		double ans;
		ans = w / (h*h);
		return ans;
	}
	
	public static void main(String[] args) {
		
		System.out.println(bmi(1.75, 63));
		
	}

}
