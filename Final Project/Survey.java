package final_homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Survey {

	private static final int max = 100;
	private static String[] col;
	private static Department[] data; // ������� ����
	
	public static void readData(String filename) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(filename)); // ���� �б�
		
		col = br.readLine().trim().split("\\s+");
		
		String line;
		int count = 0;
		
		Department[] d = new Department[max];
		
		while((line = br.readLine())!= null) {
			d[count++] = new Department(line);
		}
		//line��  Department �迭�� d�� ���پ� ����ֱ�
		
		data = Arrays.copyOf(d, count);
		//d�� data�� ��� ����ֱ�
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		String filename = s.nextLine();
		
		readData(filename); // ���� �б�
		
		System.out.printf("%10s %10s\n", "NAME","AVERAGE");
		
		for(int i=0; i<data.length; i++) {
			System.out.printf("%10s %10d\n", data[i].getName(), data[i].getAverage());
		} // �̸�, ��� ���
	
	}

}
