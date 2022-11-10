package Exception_İstisna;
import java.util.*;
public class istisna09 {

	public static void main(String[] args )throws Exception{

		Scanner klavye= new Scanner(System.in);
		System.out.println("lutfen yasinizi giriniz");
		int yas= klavye.nextInt();
		
		
		try {
		yasiniz(yas);
	}catch (Exception e) {
		System.out.println("yas icin negatif bir rakam girdiniz");	
	}
	}	
	
	public static void yasiniz(int yas) {
		if(yas<=0) {
			throw new IllegalArgumentException();
			
		}else {
			//throw new IllegalArgumentException();
			System.out.println(yas);
		}
	}	
}


