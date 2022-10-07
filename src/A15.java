import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class A15 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(17);
		list.add(23);
		list.add(111);
		list.add(17);
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(-35);
		list.add(-15);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);

		System.out.println("en kucuk deger"+ list.get(0));
		
		System.out.println("en buyuk deger"+ list.get(list.size()-1));
	}
	

}
