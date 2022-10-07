import java.util.*;
public class A14 {

	public static void main(String[] args) {
		// cumlede kac kelime oldugunu bulma
		
		Scanner cumle= new Scanner(System.in);
		System.out.println("lutfen bir cumle kurunu");
		
		String metin= cumle.nextLine();
		
		String ar[]= metin.replaceAll("[\\p{Punct}]", "").split(" ");
		
		System.out.println(Arrays.toString(ar));
		System.out.println(ar.length);
		
		
		
		
		//cumledeki en uun kelimeyi bulma
		
		String s= "daha fala java ogrenmek, icin kurs. gerekli mi?";
		String kelime[]=s.replaceAll("[\\p{Punct}]", "").split(" ");
		System.out.println(Arrays.toString(kelime));
		
		Arrays.sort(kelime);
		System.out.println(Arrays.toString(kelime));
		
		Arrays.sort(kelime, Comparator.comparingInt(String::length));
		System.out.println(Arrays.toString(kelime));
		
	}

}
