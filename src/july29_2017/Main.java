package july29_2017;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormulaSquare a, b, c, d, e, f, g;
		a = new FormulaSquare("Square.Perimeter(4)");
		System.out.println( a.name()+" for Perimeter is "+a.getPerimeter() );
		System.out.println( a.name()+" for Area is "+a.getArea() );
		System.out.println( a.name()+" for Volume is "+a.getVolume() );
		b = new FormulaSquare("Square.Area(6)");
		System.out.println( b.name()+" for Perimeter is "+b.getPerimeter() );
		System.out.println( b.name()+" for Area is "+b.getArea() );
		System.out.println( b.name()+" for Volume is "+b.getVolume() );
		c = new FormulaSquare("Square.Volume(3)");
		System.out.println( c.name()+" for Perimeter is "+c.getPerimeter() );
		System.out.println( c.name()+" for Area is "+c.getArea() );
		System.out.println( c.name()+" for Volume is "+c.getVolume() );
		d = new FormulaSquare();
		System.out.println( d.name()+" for Perimeter is "+d.getPerimeter() );
		System.out.println( d.name()+" for Area is "+d.getArea() );
		System.out.println( d.name()+" for Volume is "+d.getVolume() );
		e = new FormulaSquare("Rectangle.Perimeter(2, 4)");
		System.out.println( e.name()+" for Perimeter is "+e.getPerimeter() );
		System.out.println( e.name()+" for Area is "+e.getArea() );
		System.out.println( e.name()+" for Volume is "+e.getVolume() );
		f = new FormulaSquare("Rectangle.Area(5, 3)");
		System.out.println( f.name()+" for Perimeter is "+f.getPerimeter() );
		System.out.println( f.name()+" for Area is "+f.getArea() );
		System.out.println( f.name()+" for Volume is "+f.getVolume() );
		g = new FormulaSquare("Rectangle.Volume(2, 6, 2)");
		System.out.println( g.name()+" for Perimeter is "+g.getPerimeter() );
		System.out.println( g.name()+" for Area is "+g.getArea() );
		System.out.println( g.name()+" for Volume is "+g.getVolume() );

	}

}
