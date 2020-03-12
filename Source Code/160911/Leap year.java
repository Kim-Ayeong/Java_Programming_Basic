import java.util.Scanner;

public class 윤년 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		int year = Integer.parseInt(input); //int year = 2004; (x)
		if(year%4 ==0) {
			if(year%100 ==0){
				if(year%400 ==0) {
					System.out.println("윤년이다.");	
				}
				else {
					System.out.println("윤년이 아니다.");
				}
			}
			else {
			System.out.println("윤년이다.");
			}
		}
		else {
			System.out.println("윤년이 아니다.");
			}
		}
	}