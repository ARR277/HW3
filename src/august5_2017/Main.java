package august5_2017;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes ts = new Shapes();
		Random rand = new Random();
		Circle c = new Circle(rand.nextInt(7)+2);
				
		//square
		double square = rand.nextInt(10)+1;
		System.out.println("Square with the side "+square+" unit: ");
		System.out.println(ts.getSqPerimeter()+"\t    Perimeter(unit): "+ts.Perimeter(square)+"\n");
		System.out.println(ts.getSqArea()+"\t    Area(unit square): "+ts.Area(square)+"\n");
		System.out.println(ts.getCubeSurfaceArea()+"\t    Surface Area(unit square): "+ts.SurfaceArea(square)+"\n");
		System.out.println(ts.getCubeVolume()+"\t    Volume(unit cubic): "+ts.Volume(square)+"\n");
		
		//rectangle
		double l = rand.nextInt(3)+3;
		double w = rand.nextInt(4)+6;
		double h = rand.nextInt(4)+4;
		System.out.println("\nRectangle with:\n    Length = "+l+" unit"+
											"\n    Width = "+w+" unit"+
											"\n    Height = "+h+" unit");
		System.out.println("\t    Perimeter(unit): "+ts.Perimeter(l, w));
		System.out.println("\t    Area(unit square): "+ts.Area(l, w));
		System.out.println("\t    Surface Area(unit square): "+ts.SurfaceArea(l, w, h));
		System.out.println("\t    Volume(unit cubic): "+ts.Volume(l, w, h));
		
		//scalene triangle
		double leg1 = rand.nextInt(3)+3;
		double leg2 = rand.nextInt(2)+6;
		double leg3 = rand.nextInt(3)+8;
		double base = rand.nextInt(4)+4;
		double height1 = rand.nextInt(5)+5;
		double height2 = rand.nextInt(4)+5;
		double length = rand.nextInt(7)+7;
		System.out.println("\nScalene Triangle with:\n    Leg 1 = "+leg1+" unit"+
											"\n    Leg 2 = "+leg2+" unit"+
											"\n    Leg 3 = "+leg3+" unit"+
											"\n    Length = "+length+" unit"+
											"\n    Base = "+base+" unit"+
											"\n    Height = "+height1+" unit");
		System.out.println("\t    Perimeter(unit): "+ts.TriPerimeter(leg1, leg2, leg3));
		System.out.println("\t    Area(unit square): "+ts.TriArea(base, height1));
		System.out.println("\t    Surface Area(unit square): "+
							ts.TriSurfaceArea(length, base, height1, leg1, leg2, leg3));
		System.out.println("\t    Volume(unit cubic): "+ts.TriVolume(base, height1, height2));
		
		//circle
		printToConsole(c.getCircleInfo(c.getRadius()));
		printToConsole(c.circumference()+c.Circumference());
		printToConsole(c.area()+c.Area());
		printToConsole(c.surfaceArea()+c.Surface_Area());
		printToConsole(c.volume()+c.Volume());
	}
	
	public static void printToConsole(String msg) {
		System.out.println(msg);
	}

}
