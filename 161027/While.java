
public class While {

	public static double d(int n) {
		double d;
		d = Math.sqrt(n)-Math.sqrt(n-1);
		return d;		
	}
	
	public static void main(String[] args) {
		
		int n = 1;
		double d = d(n);
		while(d>0.001){
			d = d(n);
			n++;
			// n++;
			// d = d(n); �� �� ���� ��°��� �ٸ�
		}
		
		System.out.println(n);
		//5-17
	}

}
