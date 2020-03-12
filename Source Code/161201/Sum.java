
public class Sum {

	public static void main(String[] args) {
		
		double total = 0;
		for(int i=0; i<args.length; i++) {
			double x = Double.valueOf(args[i]);
			total += x;
		}
		System.out.println(total);
	} //java Sum 1 3 5 6 4
}

//cmd 창에서 javac Sum.java > java Sum 1 3 5
