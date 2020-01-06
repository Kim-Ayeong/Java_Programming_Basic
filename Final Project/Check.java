package final_homework;

public class Check {

	public static void main(String[] args) {
		Department d1 = new Department("AA", 10, 20, 30); // 생성자 1으로 인스턴스 d1 생성
		Department d2 = new Department("aa 40 50 60"); // 생성자 2로 인스턴스 d2 생성
		
		System.out.println(d1.toString()); 
		System.out.println(d1.getAverage());
		
		System.out.println(d2.toString());
		System.out.println(d2.getAverage());

	}
}
