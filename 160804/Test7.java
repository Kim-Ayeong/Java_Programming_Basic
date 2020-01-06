import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		scan.close();
		
		int a = Integer.parseInt(input);
		
		if(a>5){
			System.out.println("A.");
		}
		else if(a>0){
			System.out.println("B.");
		}
		else{
			System.out.println("C.");
		}
		
		System.out.println("출력입니다.");
		System.out.println(input);
		
	}

}
