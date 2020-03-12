
public class 구구단2 {

	public static void main(String[] args) {
	
		int i;
		int d;
		i = 2;
		d = 1;
		
		while(i<10) {
			d = 1;
				while(d<10) {
					System.out.println(String.format("%d*%d = %d",i,d,i*d));
					//= C에서 printf("%d * %d = %d")
					d++;
				}
			i++;
			}
		}
	}