
public class Example_3_10 {

	public static void main(String[] args) {
		
		int n = 1;
		int deposit = 1;
		int total = deposit;
		
		while(total<100000000) {
			//1억 = 1e8
			n++;
			deposit *= 2;
			total += deposit;
			System.out.println(n + " " + deposit + " " + total);
		}
		System.out.println(n);
	}
}
//연습문제 2번
