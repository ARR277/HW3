package july29_2017;

public class FormulaSquare {

	private final String P = "Perimeter", A = "Area", V = "Volume";
	private String type;
	private boolean noType;
	private String name;
	private Rectangle rect;
	private boolean notRectangle;
	public FormulaSquare() {
		name = "Nothing";
		noType = true;
	}
	public FormulaSquare(String shapeCal) {
		if(shapeCal.isEmpty())new FormulaSquare();
		name = shapeCal;
		noType = false;
		if(shapeCal.contains("Rectangle")) {goToRectangle(shapeCal);}
		else {goToRealSquare(shapeCal);}
	}
	
	public String name() {
		return name;
	}

	private void goToRealSquare(String shapeCal) {
		notRectangle = true;
		type = shapeCal.substring(shapeCal.indexOf(".")+1, shapeCal.indexOf("("));
		double temp = Double.parseDouble(shapeCal.substring(shapeCal.indexOf("(")+1, shapeCal.indexOf(")")));
		if(type.equals(P)         ) {new Perimeter(temp);}
		else if(type.equals(A)    ) {new Area(temp);     }
		else if(type.equals(V)    ) {new Volume(temp);   }
	}
	
	private double goToNull() {
		// TODO Auto-generated method stub
		return 0.00;
	}

	public double getPerimeter() {
		if(noType || !type.equals(P)) return goToNull();
		else if(notRectangle)return Perimeter.getPerimeterValue();
		return rect.getPerimeter();
	}

	public double getArea() {
		if(noType || !type.equals(A)) return goToNull();
		else if(notRectangle) return Area.getAreaValue();
		return rect.getArea();
	}
	
	public double getVolume() {
		if(noType || !type.equals(V)) return goToNull();
		else if(notRectangle)return Volume.getVolumeValue();
		return rect.getVolume();
	}
	
	private static class Perimeter{
		private static double s;
		private Perimeter(double s) {
			Perimeter.s = s;
		}
		private static double getPerimeterValue() {
			return 4*s;
		}
	}
	
	private static class Area{
		private static double s;
		private Area(double s) {
			Area.s = s;
		}
		private static double getAreaValue() {
			return s*s;
		}
	}
	
	public static class Volume{
		private static double s;
		private Volume(double s) {
			Volume.s = s;
		}
		private static double getVolumeValue() {
			return s*s*s;
		}
	}
	
	private void goToRectangle(String shapeCal) {
		notRectangle = false;
		int indexSt, indexCom, indexFn;
		double a, b, c;
		type = shapeCal.substring(shapeCal.indexOf(".")+1, shapeCal.indexOf("("));
		indexSt = shapeCal.indexOf("(")+1;
		indexCom = shapeCal.indexOf(",");
		indexFn = shapeCal.indexOf(")");
		a = Double.parseDouble(shapeCal.substring(indexSt, indexCom));
		if( type.equals(P) || type.equals(A) ) {
			b = Double.parseDouble(shapeCal.substring(indexCom+1, indexFn));
			rect = new Rectangle(a, b, type);
		}
		if( type.equals(V) ) {
			shapeCal = shapeCal.substring(indexCom+1);
			indexCom = shapeCal.indexOf(",");
			b = Double.parseDouble(shapeCal.substring(0, indexCom));
			shapeCal = shapeCal.substring(indexCom+1);
			c = Double.parseDouble(shapeCal.substring(0, shapeCal.indexOf(")")));
			rect = new Rectangle(a,b,c);
		}
	}
}
