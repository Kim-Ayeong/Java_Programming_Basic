import java.util.Arrays;

public class Clone {

	public static void main(String[] args) {
		
		int[] xs = {2,3,4,5,6};
		
		// int[] ys = xs; �� �ϸ� �ȵ�, ���� �� �д� �뵵�θ� ���
		
		int n = xs.length;
		int[] ys = new int[n];
		for(int i=0; i<n;i++) {
			ys[i] = xs[i];
		}
		
		//int[] ys = xs.clone(); �ε� ����
	
		System.out.println(java.util.Arrays.toString(xs));
		System.out.println(xs);
		System.out.println(ys);
	}

}
