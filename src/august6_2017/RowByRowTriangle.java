package august6_2017;

public class RowByRowTriangle {

	public static void main(String[] args) {
		int n=9, i, j;
		int print = 1;
		for(i=0; i<n; i++) {
			for(j=0; j<print; j++) {
				System.out.print("*");
			}
			print++;
			System.out.println();
		}
	}
}
