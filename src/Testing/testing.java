package Testing;

public class testing {

	public static void main(String[] args) {
		int[] days = {1, 2, 3, 4, 5};
		int total = 0;
		
		int hourPay = 10;
		int subTotal=0;
		for(int j=0; j<5; j++){
			int hours=days[j];
			subTotal+=(hours*hourPay);
		}
		total+=subTotal;
		
		System.out.println(total);
	}
}
