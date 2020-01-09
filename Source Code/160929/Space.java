
public class Space {

	public static double dist(double x1, double y1, double x2, double y2){
		double d;
		double dx = x1 - x2;
		double dy = y1 - y2;
		d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}
	//double d, a = x1-x2, b = y1-y2;
	//d = Math.sqrt(a*a + b*b);
	//return d;
	
	public static double dist(double x, double y){
		return dist(0.0, 0.0, x, y);
	}
	//double d;
	//d = Math.sqrt(x*x + y*y);
	//return d;
	
	public static void main(String[] args) {
		
		System.out.println(dist(1, 2, 3, 4));
		System.out.println(dist(3, 4));
		
	}

}
