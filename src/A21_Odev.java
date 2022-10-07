
import java.util.*;
public class A21_Odev {

	public static void main(String[] args) {
		
		String adTrue = "admin";
		String sifreTrue = "sfr1234";
		
		int denemeSayisi = 3;
	
		Scanner klavye = new Scanner(System.in);
		
		
		while(denemeSayisi >0) {
		
		System.out.println("Kullanici adi giriniz.");	
		String ad = klavye.nextLine();
		System.out.println("Sifrenizi giriniz.");	
		String sifre = klavye.nextLine();	
		
		if(adTrue.equals(ad)&&(sifre.equals(sifreTrue)))
		{
			System.out.println("Hesabiniza giris yaptiniz");
			break;
		}
		else
		{
			System.out.println("Lutfen kullanici adi ve sifrenizi tekrar giriniz.");
		}
		denemeSayisi--;
		}
		
		
		if(denemeSayisi == 0) {
		
			System.out.println("Hesabiniz bloke oldu");
			
		}
			
	}
}
		


