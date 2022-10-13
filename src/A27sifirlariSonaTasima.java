import java.util.Arrays;

public class A27sifirlariSonaTasima {

	/*ebay mülakat sorusu
	arrray da sıfır olan elemanları en sona tasıma*/
	
	public static void main(String[] args) {

		int a[]= {3,8,0,4,2,0,5,15,0};
		int b[]= new int[a.length];
		
		System.out.print(Arrays.toString(b));
		
		int index =0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]!=0) {
			  b[index]=a[i];
			  index++;
			}
		}
		
		System.out.println();
		
		for(int w:b) {
		
		System.out.print((w)+ " ");
		}
		
		System.out.println();
		
		Arrays.sort(b);
		
		for(int k=0; k<a.length; k++) {
			System.out.print(b[k]+ " ");
		
	}

}
}
