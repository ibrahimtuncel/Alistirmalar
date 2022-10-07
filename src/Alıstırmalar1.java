import java.util.Scanner;
public class Alıstırmalar1 {
	//ASCII deger bulma
	
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		
		System.out.println(" Lutfen bir karakter girini");
		
		char karakter = klavye.next().charAt(0);
		int in = karakter;
		
		
		System.out.println(karakter+ "ASCII değeri: "+ in);
		
		

	}

}
