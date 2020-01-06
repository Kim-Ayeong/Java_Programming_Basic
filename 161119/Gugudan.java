
public class Gugudan {


	public static void gugudan() {
		for(int i=1; i<10; ++i) {
			dan(i);
		}
	}

	public static void dan(int n) {
		System.out.print(n + " : ");
		
		for(int i=1; i<10; i++) {
			System.out.print(n*i + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		gugudan();
	}
}
