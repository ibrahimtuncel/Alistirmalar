



import java.util.*;
public class A23 {

	public static void main(String[] args) {
		
		//String adTrue = "admin";
		//String sifreTrue = "sfr1234";
		int sifreTrue= 1234;
		
		int denemeSayisi = 0;
	
		Scanner klavye = new Scanner(System.in);
		System.out.println("Kullanici adi ve sifrenizi giriniz.");
		
		
		while(denemeSayisi < 3) {
			
		//String ad = klavye.nextLine();
		int  sifre = klavye.nextInt();	
		denemeSayisi=denemeSayisi+1;
			
		
		if( sifre == sifreTrue)
		{
			System.out.println("Hesabiniza giris yaptiniz");
		}
		
			else
			{
				if(denemeSayisi== 3)
				{
					System.out.println("Hesabiniz bloke oldu.");
				}
				else
				{
					System.out.println("Lutfen kullanici adi ve sifrenizi giriniz.");
				}
			
			}
		}
		
}
}