
public class Student2 {

	public static void main(String[] args) {
		String name = "하현우";
		String ID = "121212";
		Student s = makeStudent(name, ID);
		System.out.println(s.name);
		System.out.println(name);
		
		int money = work(s);
		System.out.println(money);
		System.out.println(s.money);
	}
	public static int work(Student input) {
		int money = input.money;
		input.money = 2000;
		return money;
	}
	public static Student makeStudent(String name, String ID) {
		Student result = new Student(name, ID);
		name = "김윤아";
		return result;
	}
}