import java.util.Arrays;

public class A34 {

	public static void main(String[] args) {
		// ogrenci sinav ortalamsi hesaplama  , varags=puan
		
		System.out.println(sinavOrtalama("Ahmet", 75,85,60,95));
		System.out.println(sinavOrtalama("Ali", 75,85,60,95,66,88,70));
	}
	
	public static String sinavOrtalama(String isim, double ...varags) {
		double puanToplami=0;
		for(double notlar:varags) {
			puanToplami+= notlar;
		
		
	}
		return isim+ "'in sinav ortalamasi:"+ String.format("%.2f",puanToplami/varags.length);
		//return isim+ " in sinav ortalamasi:"+ (puanToplami/varags.length);
	}

}
