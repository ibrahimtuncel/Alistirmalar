package Exception_İstisna;

import java.io.FileNotFoundException;

public class istisna05 {

	public static void main(String[] args) {

		String str= "";
		System.out.println(str.length());
		
		String str2= null;
		
		try {
			
			
			System.out.println(str2.length());
			
			
			
		}catch(NullPointerException e) {
		System.out.println("Length() null stringler icin kullanilamaz "+ e.getMessage())	;
		
		}finally {
			System.out.println("finally calisir");
		}
	
		System.out.println("sonuc");
	}

}
