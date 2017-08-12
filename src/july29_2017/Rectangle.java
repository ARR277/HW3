package july29_2017;

public class Rectangle {

	private final String P = "Perimeter", A= "Area";
	private double length;
	private double width;
	private double height;
	private boolean triSide;
	
	public Rectangle(double length, double width, String type) {
		this.length = length;
		this.width = width;
		height = 1;
		triSide = false;
		goToPerimeter_Area(type);
	}
	
	private void goToPerimeter_Area(String type) {
		// TODO Auto-generated method stub
		if(type.equals(P))new RectPerimeter(length, width);
		if(type.equals(A))new RectArea(length, width);
	}

	public Rectangle(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		triSide = true;
		goToVolume();
	}
	
	private void goToVolume() {
		// TODO Auto-generated method stub
		new RectVolume(length, width, height);
	}

	private static class RectPerimeter{
		private static double s;
		private RectPerimeter(double a, double b) {
			RectPerimeter.s = a+b;
		}
		private static double getRectPerimeterValue() {
			return 2*s;
		}
	}
	
	private static class RectArea{
		private static double s;
		private RectArea(double a, double b) {
			RectArea.s = a*b;
		}
		private static double getRectAreaValue() {
			return s;
		}
	}
	
	private static class RectVolume{
		private static double s;
		private RectVolume(double a, double b, double c) {
			RectVolume.s = a*b*c;
		}
		private static double getRectVolumeValue() {
			return s;
		}
	}

	public double getPerimeter() {
		return RectPerimeter.getRectPerimeterValue();
	}

	public double getArea() {
		return RectArea.getRectAreaValue();
	}
	
	public double getVolume() {
		if(!triSide) return 0.00;
		return RectVolume.getRectVolumeValue();
	}


}
