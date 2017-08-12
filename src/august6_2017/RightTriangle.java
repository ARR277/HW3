package august6_2017;

public class RightTriangle {

	public static void main(String [] args) {
		int n=9, i, j;

		int num = (n/2)+1, space;
		for(i=1; i <= num; i++){
			space = num-i;
			for(j=0; j < space; j++){
				System.out.print(" ");
			}
			for(j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
