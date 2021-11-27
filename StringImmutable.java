package day12_String;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="Hello Java";
		String str2 ="Hello ";
		String str3 ="Java";
		String str4 =str2 + str3;//cannot compare 2string =false
		
		System.out.println(str1);
		System.out.println(str4);
		
		String str5 = new String(str2 + str3);
		
		System.out.println(str1);
		System.out.println(str4);
		System.out.println(str5);
	
		
		boolean result = str1==str4;
		
		System.out.println(result);//false
		System.out.println("-----------");
		System.out.println(str1==str5);
		System.out.println(str1.equals(str5));
		System.out.println("------------");
		
		
		int a =6;
		int b=4;
		int c=2;
		int d=b+c;
		
		boolean result2 = a ==d; // int can compare = true int =integer
		
		System.out.println(result2);//true
	}

}
