package final_homework;

public class Department {

	String name;
	int rating;
	int complaints;
	int privileges; // ������� ����
	
	public Department(String name, int rating, int complaints, int privileges) {
		this.name = name;
		this.rating = rating;
		this.complaints = complaints;
		this.privileges = privileges;
	} // ������ 1
	
	public Department(String line) {
		String toks[] = line.trim().split("\\s+");
		this.name = toks[0];
		this.rating = Integer.valueOf(toks[1]);
		this.complaints = Integer.valueOf(toks[2]);
		this.privileges = Integer.valueOf(toks[3]);
	} // ������ 2
	
	public String toString() {
		return name + "(" + ((rating + complaints + privileges)/3) + ")";
	} // �ڵ����
	
	public String getName() {
		return this.name;
	}
	
	public int getRating() {
		return this.rating;
	}
	
	public int getCompaints() {
		return this.complaints;
	}
	
	public int getPrivileges() {
		return this.privileges;
	} // �ʿ��� �Ӽ� ��������
	
	public int getAverage() {
		return (this.rating + this.complaints + this.privileges)/3;
	} // ������ ��� ��������
	
}
