import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String a = input.split(" ")[0]; //���̿� ���� �ֱ�
		String b = input.split(" ")[1]; //���̿� ���� �ֱ�
		
		System.out.println(a);
		System.out.println(b);
		
		scan.close(); //�Է�â �ݱ�
		
		int c = Integer.parseInt(a); //���ڿ��� ���ڷ�
		int d = Integer.parseInt(b); //���ڿ��� ���ڷ�

		if(c%d > 3){
			System.out.println(c);
		}
		else{
			System.out.println(d);
			}
		}
		
	}
