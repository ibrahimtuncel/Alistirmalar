package Exception_İstisna;

import java.util.*;

public class istisna11 {

	//custom Exception kendin istisna atama ve olusturma
	
	public static void main(String[] args) {
		
		System.out.println("Lutfen puaninizi giriniz. ");
		Scanner klavye = new Scanner(System.in);
	        int tercih = klavye.nextInt();
	        
	        
		try {
			puanCheckEt(tercih);
		
		
	}catch (IllegalPuanException e)	{
		
		System.out.println(e.getMessage());
		
	}

	}
	
	//custom exceptionexception kednin olustruma

	public static void puanCheckEt(int puan) throws IllegalPuanException{
		if(puan<0 || puan>100) {
			throw new IllegalPuanException("sinav puani 0 ile 100 arasinda olmali");
		
		}
		
		System.out.println("sinav puaniniz:"+ puan);
	}
	public static class IllegalPuanException extends Exception{
		
		public IllegalPuanException(String mesaj) {
			super(mesaj);
		}
		
	}
	
	
	
}









