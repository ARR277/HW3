package august5_2017;

public abstract class getCircle {

	public abstract String circumference();

	public abstract String area();

	public abstract String surfaceArea();

	public abstract String volume();

	public abstract double Circumference();

	public abstract double Area();

	public abstract double Surface_Area();

	public abstract double Volume();	
	
	public String getCircleInfo(double r) {
		return "\nCircle/Sphere with:\n    radius = "+r+" unit";
	}
	
	private static String printC() {
		return "\t    Circumference(unit): ";
	}
	
	private static String printA() {
		return "\t    Area(unit square): ";
	}
	
	private static String printSA() {
		return "\t    Surface Area(unit square): ";
	}
	
	private static String printV() {
		return "\t    Volume(unit cubic): ";
	}

	protected static String C() {
		return printC();
	}

	protected static String A() {
		return printA();
	}
	protected static String SA() {
		return printSA();
	}
	protected static String V() {
		return printV();
	}

}
