import java.util.*;
public class A19 {

	public static void main(String[] args) {
		
	// her elemanı 2 arttıran  bir methot yasın.
		
		
				ArrayList<Integer> list1 = new ArrayList<>();
				list1.add(3);
				list1.add(45);
				list1.add(12);
				list1.add(25);
				list1.add(16);
				list1.add(48);
				list1.add(7);
				list1.add(128);
				System.out.println(list1);
				
				herElemaniİkiArttır(list1);
	}
	
	public static void herElemaniİkiArttır(ArrayList<Integer> list1) {
		
		for(int i= 0; i<list1.size(); i++) {
			list1.set(i, list1.get(i)+2);
			
	}
		System.out.println(list1);
	
	
	}

}
