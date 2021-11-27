package day12_String;

public class StringReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "Aiden";
		
		String word2 = word1.replace('n','t');
		System.out.println(word1);
		
		System.out.println(word2);
		
		String str = "House, Mostly Along Party Line, Censures Gosar For Violent";
		String str2 = str.replace("House", "Techcircle");
		System.out.println(str);
		System.out.println(str2);
		
		String str3 =str.replace(" ", "");
		System.out.println(str3);
		
		str3 =str.replace(",", ""); //remove (,)
		System.out.println(str3);
		
	}

}
