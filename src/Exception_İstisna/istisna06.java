package Exception_İstisna;

public class istisna06 {

	public static void main(String[] args) {
		
		String str[]= {"A", "B","C","D"};
		
		System.out.println(str[2]);
		
		
		try {
			System.out.println(str[4]);	//ArrayIndexOutOfBoundsException:
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayda olmayan bir deger atadiniz."+ e.getMessage());
			
		}
		
		//ClassCastException istisna 7
		
		try {
			Object t=70;
			String sayi= (String) t;//ClassCastException	
		}catch (ClassCastException e) {
			System.out.println("ClassCastException hatası aldınız.");
		}
		
		
		String s="1234";
		System.out.println(s+5);//birleştirme yapar toplama yapmas
		
		int s2= Integer.parseInt(s);
		System.out.println(s2+5);
		
   
		// istisna 8 NumberFormatException: For input string: "1a2b3c!"
		String s3="1a2b3c!";
			
		try {
			int deger=Integer.parseInt(s3);
		}catch (NumberFormatException e) {
			System.out.println("String icersinde rakam disinda kaarakter kullanilmistir");
			
		}
	
	}
	}

