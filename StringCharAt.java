package day12_String;

public class StringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//					  0123
		String str = "Java";
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
	//	System.out.println(str.charAt(4)); not in 'charector'
		//			  0123456789
		String word ="TechCircle";
		System.out.println(word.length());//10 (Techcircle)
		System.out.println(word.charAt(6));//r chars = position
		System.out.println(word.charAt(3));//h
		System.out.println(word.charAt(9));//e
		
		System.out.println(word.charAt(10-1));//e
		System.out.println(word.charAt(word.length()-1));//e show last charector
											//20    -1
	
	}

}
