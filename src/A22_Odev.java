import java.util.*;

public class A22_Odev {

		public static void main(String[] args) {
			
			List<Integer>c= new ArrayList<Integer>();
			
			int arr[][]= {{11,2},{3,24,5},{6,7,9,10}};
			
			
				for(int i=0; i<arr.length;i++) {
					for( int j= 0; j<arr[i].length; j++) {
						c.add(arr[i][j]);
					}
				}
				System.out.println(c);
				
				
				Integer brr[]= c.toArray(new Integer [0]);
				 System.out.println(Arrays.toString(brr));
				 
				 
				 for (int i=0; i<brr.length; i++) {
						System.out.print(brr[i]+" ");
					}
		}	 
				 

	}