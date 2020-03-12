import java.io.BufferedReader;
import java.io.FileReader;

public class Print {

	public static void main(String[] args) throws Exception {
		String filename = args[0];
		BufferedReader br = 
				new BufferedReader(new FileReader(filename));

		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
