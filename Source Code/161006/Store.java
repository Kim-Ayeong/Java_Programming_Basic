
public class Store {

	public static double wage(double time, double minimum_wage_rate,
			double extra_wage_rate, double standard_time){
		double wage = 0; //time = 0 일 때 wage = 0 이므로 초기값을 넣어줌
		double mwr = minimum_wage_rate;
		double ext = extra_wage_rate;
		
		if(time>40){
			wage = standard_time * mwr + (time - standard_time)*ext;
		}
		else{
			wage = time * mwr;
		}
		return wage;
	}
	
	public static void main(String[] args) {
		System.out.println(wage(35, 6030, 7500, 40));
		System.out.println(wage(41, 6030, 7500, 40));                                                                                 

	}

}
