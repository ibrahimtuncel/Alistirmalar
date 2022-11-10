import java.util.*;
public class Iterator1 {

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
			
			String element= listItr.next()+ "*";
			System.out.print(element);
	
		}
		
		
	}
	
	
	

}
