package august5_2017;

public class Shapes extends TheSquares {

	private String perimeter = 	"    Let \"leg\" be = Each side of a Scalene Trianlge."
							+ "\n    Let \"P\" be = Perimeter of a Scalene Triangle.\n"
							+ "\n\tP = leg1+leg2+leg3\n";

	private String area = 	"    Let \"b\" be = Base of a Scalene Trianlge."
						+ "\n    Let \"h\" be = Height of a Scalene Triangle."
						+ "\n    Let \"A\" be = Area of a Scalene Triangle.\n"
						+ "\n\tA = (b*h)/2\n";

	private String surfaceArea =	"    Let \"l\" be = Length of a Scalene Trianlge."
								+ "\n    Let \"P\" be = Perimeter of a Scalene Triangle."
								+ "\n    Let \"A\" be = Area of a Scalene Triangle."
								+ "\n    Let \"SA\" be = Surface Area of a Scalene Triangle (Prism).\n"
								+ "\n\tSA = 2*A + P*l\n";

	private String volume =  	"    Let \"h'\" be = Height of a Scalene Trianlge."
							+ "\n    Let \"A\" be = Area of a Scalene Triangle.\n"
							+ "\n    Let \"V\" be = Volume of a Scalene Triangle (Prism).\n"
							+ "\n\tV = A*h\n";

	public String getPerimeter() {
		return perimeter;
	}

	public String getArea() {
		return area;
	}

	public String getSurfaceArea() {
		return surfaceArea;
	}

	public String getVolume() {
		return volume;
	}

	public double TriPerimeter(double leg1, double leg2, double leg3) {
		return leg1+leg2+leg3;
	}
	
	public double TriArea(double base, double height) {
		return 0.5*base*height;
	}
	
	public double TriSurfaceArea(	double length, double base, double height,
								double leg1, double leg2, double leg3) {
		return 2*TriArea(base, height)+TriPerimeter(leg1, leg2, leg3)*length;
	}
	
	public double TriVolume(double base, double height1, double height2) {
		return TriArea(base, height1)*height2;
	}
}
