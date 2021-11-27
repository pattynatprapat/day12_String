package day12_String;

public class StringEqualMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="java";
		String str2 ="JAVA";
		String str3 ="Java";
		String str4 ="JAVA";
		
		
		System.out.println(str1.equals(str2));//false
		System.out.println(str2.equals(str4));//true
		System.out.println(str3.equals(str4));//false
		
		System.out.println(str1.equalsIgnoreCase(str2));// don't care uppercase
		System.out.println(str2.equalsIgnoreCase(str4));//true
		System.out.println(str3.equalsIgnoreCase(str4));//true
		
		
	}

}
