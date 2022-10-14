package Exception_İstisna;
import java.util.*;
public class istisna09 {

	public static void main(String[] args) {

		Scanner klavye= new Scanner(System.in);
		System.out.println("lutfen ysınısı girinis");
		int yas= klavye.nextInt();
		
		yasini(yas);
	}
		
	public static void yasini(int yas) {
		if(yas<=0) {
			System.out.println("yas icin uygun olmayan rakam girdinis");
			
		}else {
			System.out.println(yas);
			
		}
		
	}
	
}


