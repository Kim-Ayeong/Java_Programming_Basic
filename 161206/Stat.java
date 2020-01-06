import java.util.Scanner;

public class Stat {

	public static void main(String[] args) {
		
		double total = 0;
		for(int i=0; i<args.length; i++) {
			double x = Double.valueOf(args[i]);
			total += x;
		}
		System.out.println(total);
	}
}
//cmd â > cd C:\workspace\command\src >
//javac Stat.java > java Stat 1 3 5 > 9
