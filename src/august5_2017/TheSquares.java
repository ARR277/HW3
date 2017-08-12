package august5_2017;

public class TheSquares implements Square, Rectangle{

	private String sqPerimeter = 	"    Let \"s\" be = Each side of a Square."
								+ "\n    Let \"P\" be = Perimeter of a Square.\n"
								+ "\n\tP = 4*s\n";

	private String sqArea = 	"    Let \"s\" be = Each side of a Square."
							+ "\n    Let \"A\" be = Area of a Square.\n"
							+ "\n\tA = s^2\n";

	private String cubeSurfaceArea =	"    Let \"s\" be = Each side of a Square."
									+ "\n    Let \"SA\" be = Surface Area of a Square (Prism).\n"
									+ "\n\tSA = 6*s^2\n";

	private String cubeVolume =  	"    Let \"s'\" be = Each side of the Square."
								+ "\n    Let \"V\" be = Volume of a Square (Prism).\n"
								+ "\n\tV = s^3\n";

	private String rectPerimeter = 	"    Let \"l\" be = Length of a Rectangle."
								+ "\n    Let \"w\" be = Width of a Rectangle.\n"
								+ "\n    Let \"P\" be = Perimeter of a Rectangle.\n"
								+ "\n\tP = 2*(l+w)\n";

	private String rectArea = 	"    Let \"l\" be = Length of a Rectangle."
							+ "\n    Let \"w\" be = Width of a Rectangle.\n"
							+ "\n    Let \"A\" be = Area of a Rectangle.\n"
							+ "\n\tA = l*w\n";

	private String rectSurfaceArea =	"    Let \"l\" be = Length of a Rectangle."
									+ "\n    Let \"w\" be = Width of a Rectangle.\n"
									+ "\n    Let \"h\" be = Height of a Rectangle.\n"
									+ "\n    Let \"SA\" be = Surface Area of a Rectangle.\n"
									+ "\n\tSA = 2*(l*w+w*h+l*h)\n";

	private String rectVolume =  	"    Let \"l\" be = Length of a Rectangle."
								+ "\n    Let \"w\" be = Width of a Rectangle.\n"
								+ "\n    Let \"h\" be = Height of a Rectangle.\n"
								+ "\n    Let \"V\" be = Volume of a Rectangle.\n"
								+ "\n\tV = l*w*h\n";


	public String getSqPerimeter() {
		return sqPerimeter;
	}

	public String getSqArea() {
		return sqArea;
	}

	public String getCubeSurfaceArea() {
		return cubeSurfaceArea;
	}

	public String getCubeVolume() {
		return cubeVolume;
	}

	public String getRectPerimeter() {
		return rectPerimeter;
	}

	public String getRectArea() {
		return rectArea;
	}

	public String getRectSurfaceArea() {
		return rectSurfaceArea;
	}

	public String getRectVolume() {
		return rectVolume;
	}

	@Override
	public double Perimeter(double length, double width) {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}

	@Override
	public double Area(double length, double width) {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double SurfaceArea(double length, double width, double height) {
		// TODO Auto-generated method stub
		return 2*(length*width+length*height+height*width);
	}

	@Override
	public double Volume(double length, double width, double height) {
		// TODO Auto-generated method stub
		return length*width*height;
	}

	@Override
	public double Perimeter(double side) {
		// TODO Auto-generated method stub
		return 4*side;
	}

	@Override
	public double Area(double side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double SurfaceArea(double side) {
		// TODO Auto-generated method stub
		return 6*(side*side);
	}

	@Override
	public double Volume(double side) {
		// TODO Auto-generated method stub
		return side*side*side;
	}

}
