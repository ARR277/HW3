package august6_2017;

public class CurrentPrice {

	public static void printMsg(String msg) {
		System.out.println(msg);
	}
	
	public static float tax(float currPrice, float tax) {
		return currPrice*(1+tax);
	}
	
	public  static float discount(float currPrice, float discount) {
		return currPrice*(1-discount);
	}
	
}
