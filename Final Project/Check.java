package final_homework;

public class Check {

	public static void main(String[] args) {
		Department d1 = new Department("AA", 10, 20, 30); // ������ 1���� �ν��Ͻ� d1 ����
		Department d2 = new Department("aa 40 50 60"); // ������ 2�� �ν��Ͻ� d2 ����
		
		System.out.println(d1.toString()); 
		System.out.println(d1.getAverage());
		
		System.out.println(d2.toString());
		System.out.println(d2.getAverage());

	}
}
