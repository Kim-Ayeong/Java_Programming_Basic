
public class Class2 {

	public static double sum(double[] xs) {

		double[][] arr = new double[][] {{1,2,3},{4,5},{5}};
		double total = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; i++) {
				total += arr[i][j];
			}
		}
		return total;
	}
}
//다차원 배열 총합 구하기
