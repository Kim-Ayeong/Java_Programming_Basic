import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Bodymass2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new FileReader("bodymass.txt"));
		
		String[] colnames = br.readLine().trim().split("\\s+");

		Patient[] tempArr = new Patient[100000];
		String line;
		int count = 0;
		
		while((line = br.readLine()) != null) {
			
			String[] toks = line.trim().split("\\s+");
			String name = toks[0];
			int age = Integer.parseInt(toks[1]);
			String sex = toks[2];
			double height = Double.parseDouble(toks[3]);
			double weight = Double.parseDouble(toks[4]);
			
			Patient p = new Patient(name, age, sex, height, weight);
			tempArr[count++] = p;
		}
		Patient[] pats = Arrays.copyOf(tempArr, count);
	
	}
}
