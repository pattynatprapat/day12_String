package day12_String;

public class EmptyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "";
		
		System.out.println(str.length());
		
		String str2 = new String();
		System.out.println(str2.length());
		
		
		 String word = new String();
         for(int s=1;s<=30;s++) {
         	if(s%3==0) {
         		word="Fin";
         	}
         	if(s%5==0) {
         		word="Ra";
         	}
         	if(s%5==0 && s%3==0) {
         		word="Finra";
         	}

         	if(word.length()>0) {
         	System.out.println(word);
         	}else {
         	System.out.println(s);
}
         	word="";
         
		
	}

       char[] chars = {'J','a','V','a'};//array
         
       String letter = new String(chars);
       System.out.println(letter);
         
        
        
         
}
}