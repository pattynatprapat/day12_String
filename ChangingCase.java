package day12_String;

public class ChangingCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "jaVa";
		
		System.out.println(word.toLowerCase());  // change to lower case
		//System.out.println(word);//print same no 8
	
		word =word.toLowerCase();
		
		System.out.println(word);
		
		word =word.toUpperCase();
		System.out.println(word);
		
		
		String str1 = "techcircle";
		String str2 = "TechCircle";
		
		boolean result = str1.equals(str2);
		
		boolean result2 = str1.toLowerCase().equals(str2.toLowerCase());
		System.out.println(result);//false
		System.out.println(result2);//true
		
		
	}

}
