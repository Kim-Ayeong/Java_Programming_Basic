import java.util.Arrays;

public class Multidimensional {

	public static double[][] matrix(double[] arr, int nrow, int ncol) {
		double[][] ans = new double[nrow][ncol];
		
		for(int i=0; i<nrow; i++) {
			for(int j=0; j<ncol; j++) {
				ans[i][j] = arr[i*ncol + j];
			}
		}
		return ans;
	}
	// matrix(arr, nrow, ncol)
	// matrix([1,2,3,4,5,6], 2, 3) >>[[1,2,3], [4,5,6]]
	
	
	public static void main(String[] args) {
		int[][] m = new int[5][3];
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				m[i][j] = i*j;
			}
		}
		// create 5 by 3 matrix
		
		for(int i=0; i<5; ++i) {
			for(int j=0; j<3; ++j) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		int total = 0;
		for(int i=0; i<5; ++i) {
			for(int j=0; j<3; ++j) {
				total += m[i][j];
			}
		}
		System.out.println(total);
		
		System.out.println(Arrays.toString(m)); // 주소
		System.out.println(m[3][2]);
		
		double[] arr = {1,2,3,4,5,6};
		System.out.println(matrix(arr, 2, 3));
	}

}
