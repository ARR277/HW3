package august4_2017;

public class StringClass implements StringMethod{

	private String name;
	
	public StringClass(String name) {
		this.name = name;
	}
	
	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return name.charAt(index);
	}

	@Override
	public int compareTo(String name) {
		// TODO Auto-generated method stub
		return this.name.compareTo(name);
	}

	@Override
	public String concat(String name) {
		// TODO Auto-generated method stub
		return this.name.concat(name);
	}

	@Override
	public boolean contain(String name) {
		// TODO Auto-generated method stub
		return this.name.contains(name);
	}

	@Override
	public String convertToLowerCase() {
		// TODO Auto-generated method stub
		return name.toLowerCase();
	}

	@Override
	public String convertToUpperCase() {
		// TODO Auto-generated method stub
		return name.toUpperCase();
	}

	@Override
	public boolean equalString(String name) {
		// TODO Auto-generated method stub
		return this.name.equals(name);
	}

	@Override
	public boolean equalStringIgnoreCase(String name) {
		// TODO Auto-generated method stub
		return this.name.equalsIgnoreCase(name);
	}

	@Override
	public int indexOf(String name) {
		// TODO Auto-generated method stub
		return this.name.indexOf(name);
	}

	@Override
	public int indexOf(int index) {
		// TODO Auto-generated method stub
		return name.indexOf(index);
	}

	@Override
	public String integerToString(int number) {
		// TODO Auto-generated method stub
		return Integer.toString(number);
	}

	@Override
	public String doubleToString(double number) {
		// TODO Auto-generated method stub
		return Double.toString(number);
	}

	@Override
	public int lastIndexString(String match) {
		return name.lastIndexOf(match);
	}
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return name.length();
	}

	@Override
	public String replace(char oldLetter, char newLetter) {
		return name.replace(oldLetter, newLetter);
	}
	
	@Override
	public String replaceFisrt(String match, String replace) {
		return name.replace(match, replace);
	}

	@Override
	public String[] splitToWords(String match) {
		return name.split(match);
	}
	
	@Override
	public String[] splitToWords(String match, int capacity) {
		return name.split(match, capacity);	
	}
	
	@Override
	public String substring(int index) {
		// TODO Auto-generated method stub
		return name.substring(index);
	}

	@Override
	public String substring(int start, int end) {
		// TODO Auto-generated method stub
		return name.substring(start, end);
	}

	@Override
	public char[] toCharArray() {
		return name.toCharArray();
	}

	@Override
	public String trimString() {
		// TODO Auto-generated method stub
		return name.trim();
	}

	@Override
	public String subSequenceString(int start, int end) {
		return (String) name.subSequence(start, end);
	}
	
	@Override
	public int compareToIgnoreCase(String name) {
		return this.name.compareToIgnoreCase(name);
	}
	
	@Override
	public char[] toCharArray(int start, int end) {
		char [] temp = null;
		name.getChars(start, end, temp, 0);
		return temp;
	}
	
	@Override
	public char[] toCharArray(int start, int end, int startArray) {
		char [] temp = new char[length()];
		name.getChars(start, end, temp, startArray);
		return temp;
	}
	
	@Override
	public boolean contentEqual(StringBuffer sb) {
		return name.contentEquals(sb);
	}
	
}
