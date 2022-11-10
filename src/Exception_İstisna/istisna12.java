package Exception_İstisna;

import java.util.*;

public class istisna12 {

	public static void main(String[] args) {
		
		System.out.println("Lutfen ilk sayiyi giriniz. ");
		Scanner klavye = new Scanner(System.in);
	        int a = klavye.nextInt();
	    System.out.println("Lutfen ilk ikinci giriniz. ");
	        int b = klavye.nextInt();
	        
	        
		try {
			bolme(a,b);
		}catch(sayiyiBireBolmeException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void bolme(int a, int b) throws sayiyiBireBolmeException {
			if(b==1) {
			throw new sayiyiBireBolmeException("bir sayiyi bire bolmekle ayni sayi elde edilir.");	
		}
		System.out.println("sonuc: " +a/b);
		
	}
	
	private static class sayiyiBireBolmeException extends Throwable{
		public sayiyiBireBolmeException(String s) {
			super(s);
		}
	}
}
