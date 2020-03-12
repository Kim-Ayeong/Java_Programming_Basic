
public class Hello {

	public static int f (int x) {
		return x+1;
	}
	public static int square(int x) {
		return x*x;
	}
	public static int add(int x, int y){
		return x + y ;
	}
	public static void main(String[] args) {
		System.out.println(f(3));
		System.out.println(square(add(5,6)));
	}
}
