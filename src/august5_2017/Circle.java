package august5_2017;

public class Circle extends getCircle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String circumference() {
		// TODO Auto-generated method stub
		return getCircle.C();
	}

	@Override
	public String area() {
		// TODO Auto-generated method stub
		return getCircle.A();
	}

	@Override
	public String surfaceArea() {
		// TODO Auto-generated method stub
		return getCircle.SA();
	}

	@Override
	public String volume() {
		// TODO Auto-generated method stub
		return getCircle.V();
	}

	@Override
	public double Circumference() {
		// TODO Auto-generated method stub
		return 2.00*Math.PI*radius;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double Surface_Area() {
		// TODO Auto-generated method stub
		return 4.00*Area();
	}

	@Override
	public double Volume() {
		// TODO Auto-generated method stub
		return (Surface_Area()*radius)/3.00;
	}
	
}
