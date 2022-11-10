import java.util.Scanner;


public class A33 {

	public static void main(String[] args) {
		// kredi kartı isim,soyisim---ilk harf, kart no son dört yasdirma
		
		
		Scanner klavye= new Scanner(System.in);
		
		System.out.println("Lutfen isim, soyisim ve kredi karti no girinis");
		
	
		/*System.out.println("Lutfen isim, soyisim ve kredi karti no girinis");
		String isim= klavye.nextLine();
		String soyİsim= klavye.nextLine();
		String kartNo= klavye.nextLine();
		
		String gislenmisİsim=isim.charAt(0)+ isim.substring(1).replaceAll("[a-z]", "*");
		String gislenmissoyİsim=soyİsim.substring(0, 1)+ soyİsim.substring(1).replaceAll("[a-z]", "*");
		String gislenmisKart= kartNo.substring(0,9).replaceAll("[0-9]","*")+" "+ kartNo.substring(9);
		
		System.out.println(gislenmisİsim +"\n"+ gislenmissoyİsim+"\n"+  gislenmisKart);
		*/
			//2.yol
		String str=klavye.nextLine();
		String ad= str.split(" ")[0];
		String soyAd= str.split(" ")[1];
		String kart2= str.split(" ")[2];
	
		
		String gislenmisAd=ad.substring(0,1).toUpperCase()+ ad.substring(1).replaceAll("[a-z]", "*");
		String gislenmissoyAd=soyAd.substring(0,1).toUpperCase()+ soyAd.substring(1).replaceAll("[a-z]", "*");
		//String gislenmiskart2= kart2.substring(0,9).replaceAll("[0-9]","*")+ kart2.substring(9);
		
		String gislenmiskart2=" ";
		
		for(int i=0; i<kart2.length();i++) {
			if(i<kart2.length()-4) {
				gislenmiskart2= gislenmiskart2+ "*";
			}else {
				gislenmiskart2= gislenmiskart2+ kart2.charAt(i);
			}
		}
		System.out.println(gislenmisAd +"\n"+ gislenmissoyAd+"\n"+  gislenmiskart2);
	}
}
