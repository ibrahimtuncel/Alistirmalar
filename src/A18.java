import java.util.*;
public class A18 {
	
	
	public static void main(String[] args) {
		
		//List'eki elementler arasi minimum farki bulunuz
		
		
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
		
		
		ArrayList<Integer> list2 = new ArrayList<>();

        for(int i =0; i<list1.size(); i++) {
        	for(int j =i+1; j<list1.size(); j++) {
        	list2.add(Math.abs(list1.get(i)-list1.get(j)));	
        	}
        }
        	System.out.println(list2);
        	
        	Collections.sort(list2);
        	System.out.println(list2);
        	
        	System.out.println(list2.get(0));
        	
        	System.out.println(list2.size());
        	
        	System.out.println(list2.get(list2.size()-1));
	}

}
