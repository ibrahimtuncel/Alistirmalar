import java.util.*;
public class A31 {

	public static void main(String[] args) {
		//carpim tablosu olusturun

		Scanner carpim= new Scanner(System.in);
		System.out.println("bir sayi girinis");
		int sayi= carpim.nextInt();
		
		for (int i=1; i<=sayi; i++) {
			for(int j=1;j<=sayi;j++)
			System.out.print(i*j+" ");
			System.out.println();
		}
	}

}
