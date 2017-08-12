package august6_2017;

public class Trianlge {

	public static void main(String[] args) {
		int n=9, i, j;
		int num = (n/2), space = num, print=1;
		for(i=0; i<num+1; i++) {
			for(j=0; j<space; j++) {
				System.out.print(" ");
			}
			space--;
			for(j=0; j<print; j++) {
				System.out.print("*");
			}
			print+=2;
			System.out.println();
		}
	}
}
