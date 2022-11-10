import java.util.Scanner;

public class A32 {

	public static void main(String[] args) {
		// magasa alisverisi kart,indirim hesaplama
		
		Scanner klavye= new Scanner(System.in);
		System.out.println("alis adedi girinis");
		int adet= klavye.nextInt();
		adet=Math.abs(adet);
		
		
		System.out.println("fiyat girinis");
		double fiyat= klavye.nextDouble();
		
		System.out.println("uyelik kartinis var ise kart=1 var,2 yok");
		int kart= klavye.nextInt();
		
		if(kart==1 && adet>10) {
			System.out.println(adet*fiyat*0.80);
		}
		else if(kart==1 && adet<11) {
			System.out.println(adet*fiyat*0.85);
		}
		else if (kart==2 && adet>10) {
			System.out.println(adet*fiyat*0.85);
		}
		else if (kart==2 && adet<11) {
			System.out.println(adet*fiyat*0.90);
		}	
			
		 double sonuc = kart== 1 ? (adet>10 ? (adet*fiyat*0.80) : (adet*fiyat*0.85))  : (adet<11 ? (adet*fiyat*0.85) : (adet*fiyat*0.90)) ;
			
			
	        System.out.println(sonuc);
		
		
		
		}
		
	}

