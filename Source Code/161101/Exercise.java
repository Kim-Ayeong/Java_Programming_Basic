
public class Exercise {

	public static long sumOfSquares(int n) { 
		//camel case ��ҹ��ڸ� ���
		long sum = 0;
		for(int i=0; i<=n; i++) {
			sum += i*i;
			
			/* long square(int i) {
			return i*i;
			} ��
			sum += square(i) �� ���� ����� �� ���� */ 
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfSquares(10));
	}
}
//�������� 3��