import java.util.Arrays;

public class Clone {

	public static void main(String[] args) {
		
		int[] xs = {2,3,4,5,6};
		
		// int[] ys = xs; 로 하면 안됨, 복제 후 읽는 용도로만 사용
		
		int n = xs.length;
		int[] ys = new int[n];
		for(int i=0; i<n;i++) {
			ys[i] = xs[i];
		}
		
		//int[] ys = xs.clone(); 로도 가능
	
		System.out.println(java.util.Arrays.toString(xs));
		System.out.println(xs);
		System.out.println(ys);
	}

}
