
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator2 {

	public static void main(String[] args) {
		
		List<String>list01= new ArrayList<>();
		
		list01.add("Tom");
		list01.add("Ali");
		list01.add("Canan");
		
		System.out.println(list01);
		
		for(String w:list01) {
			w=w+"*";
		}
		System.out.println(list01);
		
		ListIterator<String>listItr= list01.listIterator();
		
		while(listItr.hasNext()) {
			String element= listItr.next();
			
			System.out.print(element);
			listItr.set(element+ "*");
			
		}
		System.out.println();
			System.out.print(list01);
			System.out.println();
			
			
			//elemanlari guncelle ve tersten yasdirma
			List<String>list02= new ArrayList<>();
			
			list02.add("Apple");
			list02.add("Samsung");
			list02.add("Huawei");
			list02.add("Sony");
			
			System.out.println(list02);
						
			ListIterator<String>Itr= list02.listIterator();
			
			while(Itr.hasNext()) {
				Itr.next();			
			}
			
			while(Itr.hasPrevious()) {
			String eleman=Itr.previous();
			Itr.set(eleman+"?");
			}
			
			Collections.reverse(list02);
			System.out.println(list02);
			
			
			//LİSTıTERATOR İLE ELEMAN SİLME ve ekleme
			
			List<String>list03= new ArrayList<>();
			list03.add("A");
			list03.add("B");
			list03.add("C");
			
			ListIterator<String>İ01= list03.listIterator();
			System.out.println(list03);
			
			İ01.hasNext();
			İ01.next();
			İ01.remove();
			
			System.out.println(list03);
			
			
			List<String>list04= new ArrayList<>();
			list04.add("w");
			list04.add("y");
			list04.add("m");
			
			ListIterator<String>İ04= list04.listIterator();
			System.out.println(list04);
			
			
			İ04.add("l");
			İ04.add("k");
			System.out.println(list04);
			
			İ01.hasNext();
			İ01.next();
			İ04.add("!!!");
			
			
			System.out.println(list04);
			
			while(İ04.hasNext()){
				İ04.next();
			}
			
			İ04.add("v");
			İ04.add("s");
			System.out.println(list04);
			
			İ04.hasPrevious();
			İ04.previous();
			İ04.add("..?..");
			System.out.println(list04);
			
			
			List<String>list05= new ArrayList<>();
			list04.add("ww");
			list04.add("yy");
			list04.add("mm");
			
			Iterator <String>i05= list05.iterator();
			
			while(i05.hasNext()){
				i05.next();
			}
			
		}
		
		
	}
	
	
	

