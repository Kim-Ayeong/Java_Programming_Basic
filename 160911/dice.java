
public class ÁÖ»çÀ§ {
	private int number;
	
	public void roll() {
		Random rand = new Random();
		number = rand.nextInt(6)+1;
	}
	public int getNum() {
		return number;
	}
}
