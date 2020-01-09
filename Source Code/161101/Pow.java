
public class Pow {

	public static int pow(int a, int b) {
		int total = 1;
		for(int i=0; i<b; i++) {
			total *= a;
		}
	return total;
	}
	
	public static void main(String[] args) {
		System.out.println(pow(2,30));
		System.out.println(pow(2,32));
	}
}
//연습문제 1번
