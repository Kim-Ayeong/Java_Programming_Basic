
public class Health {

	public static double bmi(double height, double weight){
		double h = height/100.0;
		double w = weight;
		return w/(h*h);
	}
	public static String bmicat(double bmi) {
		String cat;
		if(bmi < 18.5){
			cat = "��ü��";
		}
		else if(bmi < 23) {
			cat = "����";
		}
		else if(bmi < 25) {
			cat = "��ü��";
		}
		else if(bmi < 30) {
			cat = "�浵 ��";
		}
		else if(bmi < 35) {
			cat = "�ߵ ��";
		}
		else {
			cat = "�� ��";
		}
		return cat;
	}
	// �������� 3��
	
	public static void main(String[] args){
		System.out.println(bmi(163, 48));
		System.out.println(bmicat(bmi(163, 48)));
		
	}
}
