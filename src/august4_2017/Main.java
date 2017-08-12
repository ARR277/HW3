package august4_2017;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Roses are red, Violets are blue, Sugar is sweet, And so are you.";
		System.out.println("Sentence A:\n\t"+a+"\n");
		String b = "King Henry drank much dark chocalate milk.";
		String c = "King Philip cross over the fence and got shot.";
		StringBuffer str  = new StringBuffer("King Philip cross over the fence and got shot.");
		String d = "Life is temporarily and death is permanently, that is the fate of all men.";
		String e = "     I won the prize to Six Flag in Penn. with free booking hotel.   ";

		Random rand = new Random();
		StringClass n1 = new StringClass(a);
		StringClass n2 = new StringClass(c);
		StringClass n3 = new StringClass(d);
		StringClass n4 = new StringClass(e);
		int num1 = rand.nextInt(n1.length());
		int num2 = rand.nextInt(n2.length());
		int start = rand.nextInt(n1.length()/6);
		int end = rand.nextInt(start+ (n1.length()/2) );
		int num3 = rand.nextInt(n3.length());
		char[] printArray;
		int num4 = rand.nextInt(10);
		
		System.out.println( n1.charAt(num1) );
		
		System.out.print( n1.compareTo("Roses are red, Violets are blue")+"\t" );
		System.out.println( n1.compareTo("roses are red, violets are blue, sugar is sweet,") );
		
		System.out.println(n1.compareToIgnoreCase("roses are red, violets are blue, sugar is sweet,"));

		System.out.println("\nSentence B:\n\t"+b+"\n");
		System.out.println(n1.concat(" "+b));
		System.out.println(n1.contain(b));
		
		System.out.println("\nSentence C:\n\t"+c+"\n");
		System.out.println(n1.contentEqual(str));
		System.out.println(n2.contentEqual(str));
		
		System.out.println(n1.convertToLowerCase());
		System.out.println(n2.convertToUpperCase());
		System.out.println(n1.doubleToString(123.568));
		System.out.println(n1.equalString("Roses are red, Violets are blue, Sugar is sweet, And so are you."));
		System.out.println(n1.equalString("Roses are Red, Violets are Blue, Sugar is Sweet, And so are You."));
		System.out.println(n1.equalString("Roses are Red, Violets are Blue, Sugar is Sweet, And so are You."));
		System.out.println(n2.indexOf(num2));
		System.out.println(n2.indexOf("cross over the fence"));
		System.out.println(n2.integerToString(456));
		System.out.println(n2.lastIndexString("and got"));
		System.out.println(n2.replace('o', 'j'));
		
		System.out.println("\nSentence D:\n\t"+d+"\n");
		System.out.println(n3.replaceFisrt("death", "paradise"));
		System.out.println(n1.subSequenceString(start, end));
		System.out.println(n3.substring(num3));
		System.out.println(n1.substring(start, end));
		char[] print = n3.toCharArray();
		for(char printed: print) {
			System.out.print(printed+" ");
		}
		System.out.println("\nSentence E:\n\t"+e+"\n");
		System.out.println(n4.trimString());
		printArray = n4.toCharArray(start, end, num4);
		for(char printed: printArray) {
			System.out.print(printed+" ");
		}
		

	}

}
