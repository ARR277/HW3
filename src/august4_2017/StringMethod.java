package august4_2017;

public interface StringMethod {
	
	public char charAt(int index);
	
	public int compareTo(String name);
	
	public int compareToIgnoreCase(String name);

	public String concat(String name);
	
	public boolean contain(String name);

	public boolean contentEqual(StringBuffer sb);
	
	public String convertToLowerCase();

	public String convertToUpperCase();

	public String doubleToString(double number);

	public boolean equalString(String name);

	public boolean equalStringIgnoreCase(String name);
	
	public int indexOf(String match);
	
	public int indexOf(int index);
	
	public String integerToString(int number);
	
	public int lastIndexString(String match);
	
	public int length();

	public String replace(char oldLetter, char newLetter);
	
	public String replaceFisrt(String match, String replace);
	
	public String[] splitToWords(String match);
	
	public String[] splitToWords(String match, int capacity);
	
	public String subSequenceString(int start, int end);
	
	public String substring(int index);
	
	public String substring(int start, int end);

	public char[] toCharArray();

	public char[] toCharArray(int start, int end);

	public char[] toCharArray(int start, int end, int startArray);
	
	public String trimString();

}
