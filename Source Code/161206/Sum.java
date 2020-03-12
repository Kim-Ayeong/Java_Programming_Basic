import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Sum {

	public static void main(String[] args) throws Exception {
		// 예외는 던진다.
		System.out.println(new FileReader(new File("data.txt")));
		// = new FileReader("data.txt");
		// 고유 메모리 주소 출력
		
		BufferedReader br = 
				new BufferedReader(new FileReader(new File("data.txt")));
		
		double[] xs = new double[50];
		int count = 0;
		String line;
		
		while((line = br.readLine()) != null) {
			//br.readLine 은 한줄씩 읽음, 돌아올 수 없음, 해당 줄이 없으면 null
			
			String[] toks = line.trim().split("\\s+");
			//line : "1 2 3" > toks : ["1", :2", "3"]
			
			for(int i=0; i<toks.length; i++) {
				xs[count++] = Double.valueOf(toks[i]);
			}
		}
		
		System.out.println(count);
		xs = Arrays.copyOf(xs, count);
		System.out.println(Arrays.toString(xs));
	}
}
