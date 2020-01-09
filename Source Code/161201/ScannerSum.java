import java.util.Scanner;

public class ScannerSum {

public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		
		System.out.print("Type numbers : ");
		
		while(s.hasNextLine()) {
			String line = s.nextLine();
			if(line.trim() =="exit") break;
			
			line = line.trim();
			String[] tok = line.split("\\s+");
			
			double total = 0;
			for(int i=0; i<tok.length; i++) {
				total += Double.valueOf(tok[i]);
			}
		System.out.println(total);
		}	
	}
}
