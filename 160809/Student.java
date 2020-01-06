
public class Student {
	String name;
	String ID;
	int money;
	
	public Student(String name, String ID){
		this.name = "yeong";
		this.ID = "1161";
	}
	public void addMoney(int add){
		this.money += add;
	}
	public boolean eatFood(int howmuch){
		if( this.money < howmuch) {
			return false;
		}
		else{
			this.money -= howmuch;
			return true;
		}
	}
}
