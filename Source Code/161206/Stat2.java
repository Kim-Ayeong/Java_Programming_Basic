
public class Stat2 {

	public static double sum(double[] xs) {
		double total = 0;
		for(int i=0; i<xs.length; i++) {
			total += xs[i];
		}
		return total;
	}
	
	public static double mean(double[] xs) {
		double total = 0;
		for(int i=0; i<xs.length; i++) {
			total += xs[i];
		}
		return total / xs.length;
	}
	
	public static void main(String[] args) {
		
		String command = args[0];
		double[] xs = new double[args.length - 1];
		
		for(int i=0; i<xs.length; i++) {
			xs[i] = Double.valueOf(args[i+1]);
		}
		
		String outputMessage = "";
		double ans;
	
		if(command.equals("sum")) {
			outputMessage = "sum : ";
			ans = sum(xs);
		} else if(command.equals("mean")) {
			outputMessage = "mean : ";
			ans = mean(xs);
		} else {
			outputMessage = command + "is not implemented";
			ans = 0;
		}
		System.out.printf("%s %10.3f", outputMessage, ans);
	}
}
