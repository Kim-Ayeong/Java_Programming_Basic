
public class Test1 {

	public static void main(String[] args) {
		int i = 10;
		
		if(i%2 ==0){ //2로 나누어 떨어짐
			if(i%5 == 0){ //5로 나누어 떨어짐
				System.out.println("2의 배수이면서 5의 배수");
			}
			else{
				System.out.println("2의 배수");
			}
		}
		else{
			System.out.println("2의 배수가 아님");
		}
	}
}


