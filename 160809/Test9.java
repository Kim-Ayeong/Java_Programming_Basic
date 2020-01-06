
public class Test9 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		System.out.println("1");
		int plus = plus(a,b);
		System.out.println("2");
		System.out.println("-=-");
		System.out.println(plus); //return값 출력, ex) return 0; 이면 0 출력
	}
	public static int plus(int a, int b){
		System.out.println("a");
		System.out.println("b");
		int result = a+b;
		System.out.println(result);
		return result;
	}
}
