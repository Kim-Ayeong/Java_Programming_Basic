import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String a = input.split(" ")[0]; //사이에 공백 넣기
		String b = input.split(" ")[1]; //사이에 공백 넣기
		
		System.out.println(a);
		System.out.println(b);
		
		scan.close(); //입력창 닫기
		
		int c = Integer.parseInt(a); //문자열을 숫자로
		int d = Integer.parseInt(b); //문자열을 숫자로

		if(c%d > 3){
			System.out.println(c);
		}
		else{
			System.out.println(d);
			}
		}
		
	}
