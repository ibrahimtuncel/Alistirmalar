import java.util.*;
public class A26 {
// girilen sayının rakamları tolamını bulma
	
	public static void main(String[] args) {
		
		Scanner sayi= new Scanner (System.in);
		System.out.println("Bir sayi girini");
		int rakam= sayi.nextInt();
		
		int rakamlarinToplami=0;
		
		do {
			rakamlarinToplami += rakam%10;
			rakam = rakam/10;
			
		}while(rakam>0);
		
		System.out.println(rakamlarinToplami);
		
sayi.close();
	}

}

/*for(int i=0; i<rakam; i++) {
	
	rakamlarinToplami += rakam%10;
	rakam= rakam/10;
	i--;
}
System.out.println(rakamlarinToplami);
*/