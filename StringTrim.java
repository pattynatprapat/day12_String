package day12_String;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello java       ";
		System.out.println(str);
		System.out.println(str.length());
		
		str = str.trim();
		System.out.println(str.length()); //delete empty space 
		
		String str2 ="       TechCircle";
		
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println(str2.trim());
		System.out.println(str2);
		
		str2 = str2.trim();
		System.out.println(str2);
	
		String str3 ="    Hello techcircle     ";
		System.out.println(str3.length()); //25
		
		str3=str3.trim();
		System.out.println(str3.length());//16
		
		
			
	
	}

}
