import java.util.Scanner;
public class Alıstırma2 {
	//switch metoduyla harf seçimi
	
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.println(" Lutfen bir harf girini. \nA \nB \nC");
		
			char harf = klavye.next().toUpperCase().charAt(0);
		
		switch (harf) {
		
			case 'A' :
		
			System.out.println(" jAVA KOLAYDIR");
			break;
			
			case 'B' :
			
			System.out.println(" jAVA ÖĞRENMEK İÇİN ÇALISMALIYI");
			break;
			
			case 'C' :
			
			System.out.println(" jAVA EĞLENCELİDİR");
			break;
			
			default:
				System.out.println(" gecerli harf girini");
		}
		
		

	}

}