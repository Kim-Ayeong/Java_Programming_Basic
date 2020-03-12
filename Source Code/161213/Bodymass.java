import java.io.BufferedReader;
import java.io.FileReader;

public class Bodymass {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("bodymass.txt"));
		
		String[] colnames = br.readLine().trim().split("\\s+");
		String line;
		
		while((line = br.readLine()) != null) {
			String[] toks = line.trim().split("\\s+");
			String name = toks[0];
			int age = Integer.parseInt(toks[1]);
			String sex = toks[2];
			double height = Double.parseDouble(toks[3]);
			double weight = Double.parseDouble(toks[4]);
			double bmi = weight / ((height/100.0) * (height/100.0));
			
			System.out.println(name + " " + bmi);
		}
	}

}
