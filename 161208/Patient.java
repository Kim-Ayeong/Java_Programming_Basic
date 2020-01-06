
public class Patient {

	String name;
	int age;
	double height;
	double weight;
	
	public Patient(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String toString() {
		return this.name + "(" + this.age +")";
	}
	// 기본 구조
	
	public double bmi() {
		double h = this.height / 100;
		return weight / (h*h);
	}

	public static void main(String[] args) {
		Patient p = new Patient("john", 22, 160.0, 55.0);
			System.out.println(p.bmi());
	}
}
