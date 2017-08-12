package august6_2017;

public class Update extends CurrentPrice{

	private final static float discountFixed = (float)0.25;
	
	public static float tax(float currPrice, float tax) {
		return discountFixed(currPrice*(1+tax), discountFixed);
	}

	private static float discountFixed(float currPrice, float discount) {
		return currPrice*(1-discount);
	}

}
