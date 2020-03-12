
public class 주사위 {
	private int number;
	
	public void roll() {
		Random rand = new Random();
		number = rand.nextInt(6)+1;
	}
	public int getNum() {
		return number;
	}
}
