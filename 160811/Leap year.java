import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		int year = Integer.parseInt(input); //int year = 2004; (x)
		if(year%4 ==0) {
			if(year%100 ==0){
				if(year%400 ==0) {
					System.out.println("�����̴�.");	
				}
				else {
					System.out.println("������ �ƴϴ�.");
				}
			}
			else {
			System.out.println("�����̴�.");
			}
		}
		else {
			System.out.println("������ �ƴϴ�.");
			}
		}
	}