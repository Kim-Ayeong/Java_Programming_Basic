
public class Series {

	public static int a(int n) {
		return n*n + n;
	}
	public static void main(String[] args) {
	
		int s = 0;
		for(int i=1; i<100; i++) {
			
			System.out.println("a(" + i + ")=" +a(i));
			// a(1)=2 ~ a(99)=9900 출력
			// 예제 1
			
			s += a(i);
			System.out.println(s += a(i));
			// 수열의 합 출력
			// 예제 2
		}
	}

}
