import java.util.Scanner;
public class Alıstırma3 {
	//kare oluşturma
	
	public static void main(String[] args) {
		 System.out.println("Lutfen bir sayi giriniz");
		 
		 Scanner klavye = new Scanner(System.in);
	        int sayi = klavye.nextInt();
	        
	        
	        for( int i=0;i<sayi; i++) {
	        	for( int j=0;j<sayi; j++) {
	        		System.out.print("* ");
	        	}
	        	
	        	
	        	System.out.print("\n");
	        }
	}

}
