
public class Health {

	public static double bmi(double height, double weight){
		double h = height/100.0;
		double w = weight;
		return w/(h*h);
	}
	public static String bmicat(double bmi) {
		String cat;
		if(bmi < 18.5){
			cat = "저체중";
		}
		else if(bmi < 23) {
			cat = "정상";
		}
		else if(bmi < 25) {
			cat = "과체중";
		}
		else if(bmi < 30) {
			cat = "경도 비만";
		}
		else if(bmi < 35) {
			cat = "중등도 비만";
		}
		else {
			cat = "고도 비만";
		}
		return cat;
	}
	// 연습문제 3번
	
	public static void main(String[] args){
		System.out.println(bmi(163, 48));
		System.out.println(bmicat(bmi(163, 48)));
		
	}
}
