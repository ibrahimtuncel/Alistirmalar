package Ders36AbstractClass_Method;
import java.util.*;

public class forEachLoop1 {

	public static void main(String[] args) {
		
		
		List<Character> list1 = new ArrayList<>();
		
		list1.add('a');
		list1.add('b');
		list1.add('c');
		list1.add('d');
		list1.add('e');
		list1.add('g');
		list1.add('t');

		System.out.println(list1);
		
		//1.yol for loop
		
		for(int i=0; i<list1.size();i++) {
			System.out.print(list1.get(i)+"!");
		}
		System.out.println();
		
			//2.yol for each loop
		
		for(Character w:list1) {
		 System.out.print(w+ "!");
		}
		System.out.println();
		
	//listedeki ünsüsleri yasdır.
		
		for (Character w:list1) {
			if(w=='a' || w=='e' || w=='i'|| w=='o'||w=='u') {
				continue;
		}
		System.out.print(w+ "?");
		}
	System.out.println();
	
		//ascıı deger yasdırma
	
	for(Character asciideger:list1) {
		System.out.print(asciideger+ ":"+ (int)asciideger +" ");
	}
	System.out.println();
	
	
	int toplam=0;
	for(Character asciideger:list1) {
	toplam+= asciideger;	
	}
	System.out.println(toplam);
	
	
	//son harf veya ilk harfe göre yasdırma
	String s[]= {"ahmet", "mehmet", "olcay","fatma"};
	
	for (String w:s) {
		
	if (!w.endsWith("y")) { //!w, startsWith
		System.out.println(w);
	}
	if (w.startsWith("a")) {
		System.out.println(w);
	}
	}

	}
}