package Exception_İstisna;
import java.util.*;
public class istisna03 {

	public static void main(String[] args) {

		
		
		
		
		int a=25;
		int b=0;
		
		try {
			System.out.println(a/b);
			
		}catch (ArithmeticException e) {
			
			System.out.println("herhangi  bir sayi sifira bolunemez.");
		}
		
		finally{
		System.out.println("dongu tamamlandi");
		}
	}

}
