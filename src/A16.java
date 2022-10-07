import java.util.*;

public class A16 {
	
	
	public static void main(String[] args) {
		
		Character arr []= new Character[4];
		arr[0]= 'a';
		arr[1]= 'b';
		arr[2]= 'c';
		arr[3]= 'd';

		System.out.println(Arrays.toString(arr));
	
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		//array i  Arraylist e cevirme
		//1.yol
		List<Character>c= new ArrayList<Character>();
			
		for(int i=0; i<arr.length; i++) {
			c.add(arr[i]);
		}
		System.out.println(c);
		
		c.add('f');
		System.out.println(c);
		
		c.add(4, 'e');
		System.out.println(c);
		
		c.remove(3);
		System.out.println(c);
		
		c.set(0, 'A');
		System.out.println(c);
			
		c.clear();
		System.out.println(c);
		
		
		//2.yol	
		List<Character>c1= Arrays.asList(arr);	
		System.out.println(c1);
		
		System.out.println();
		
		
		//Arraylist i array[] a cevirme
		List<Integer> list4 = new ArrayList<>();
		
		 list4.add(12);
		 list4.add(1);
		 list4.add(6);
		 list4.add(32);
		 
		 System.out.println(list4);
		 
		 Integer arr2[]= list4.toArray(new Integer [0]);
		 System.out.println(Arrays.toString(arr2));
		 
		 
		 for (int i=0; i<arr2.length; i++) {
				System.out.print(arr2[i]+" ");
			}
		 
	}
}


