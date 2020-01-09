import java.io.BufferedReader;
import java.io.FileReader;

public class SumFile {

	public static void main(String[] args) throws Exception {
		String filename = args[0];
		BufferedReader br = new BufferedReader(new FileReader(filename));
		
		double total = 0;
		String line;
		
		while((line = br.readLine()) != null) {
			// line : "1 2 3" > toks : ["1", "2", "3"]
			String[] toks = line.split("\\s+");
			double[] xs = new double[toks.length];
			for(int i=0; i<toks.length; i++) {
				total += Double.parseDouble(toks[i]);
			}
		}
		System.out.println(total);
	}
}
