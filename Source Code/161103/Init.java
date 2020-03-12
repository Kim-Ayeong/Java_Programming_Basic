import java.util.Arrays;

public class Init {

	public static void main(String[] args) {
		
		int xs[] = new int[10];
		
		for(int i=0; i<10; ++i) {
			xs[i] = i;
		}
		
		System.out.println(java.util.Arrays.toString(xs));

	}

}
