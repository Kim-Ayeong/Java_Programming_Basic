
public class Test7 {

	public static void main(String[] args) {
		char[] arr = {'��', '��', '��', '��', '��'};
		String s = "�����ٶ�";
		System.out.println(arr);
		System.out.println(s);
		
		int i = 0;
		int size = arr.length;
		for(i = 0; i<size; i++){ //size�� �迭�� ���� = 5
			
			if(arr[i] == '��'){
				arr[i] = 'A'; // '��' ��� 'A' ���
			}
			System.out.println(arr[i]);
		}

	}

}
