
public class Test7 {

	public static void main(String[] args) {
		char[] arr = {'가', '나', '다', '라', '마'};
		String s = "가나다라마";
		System.out.println(arr);
		System.out.println(s);
		
		int i = 0;
		int size = arr.length;
		for(i = 0; i<size; i++){ //size는 배열의 층수 = 5
			
			if(arr[i] == '나'){
				arr[i] = 'A'; // '나' 대신 'A' 출력
			}
			System.out.println(arr[i]);
		}

	}

}
