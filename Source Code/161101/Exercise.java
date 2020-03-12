
public class Exercise {

	public static long sumOfSquares(int n) { 
		//camel case 대소문자를 섞어서
		long sum = 0;
		for(int i=0; i<=n; i++) {
			sum += i*i;
			
			/* long square(int i) {
			return i*i;
			} 과
			sum += square(i) 로 나눠 사용할 수 있음 */ 
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfSquares(10));
	}
}
//연습문제 3번