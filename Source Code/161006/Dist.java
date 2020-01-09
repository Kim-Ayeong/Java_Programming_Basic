
public class Dist {

	public static double f(double x){
		double dens;
		if(-1 <= x && x < 0){
			dens = 1 + x;
		} else if(0 <= x && x < 1){
			dens = 1 - x;
		} else{
			dens = 0.0;
		} //�� ������ �� ��ü�� �Ǵ��� ����, �ߺ� x
		return dens;
	}
	//3-17
	
	public static double dexp(double x, double lambda){
		double dens;
		
		if(lambda <= 0){
			return -1;
		}
		if(x >= 0){
			dens = (Math.exp(-x / lambda)) / lambda;
		}
		else {
			dens = 0;
		}
		return dens;
	}
	// �������� 2��
	
	public static void main(String[] args) {
		System.out.println(f(0.2));
		
		System.out.println(dexp(-1, 1));
		System.out.println(dexp(1, -1));
		System.out.println(dexp(1, 1));
		
	}

}
