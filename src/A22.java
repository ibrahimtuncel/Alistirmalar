import java.util.Arrays;
import java .util.Scanner;
public class A22 {



	public static void main(String[] args) {
		
		Scanner klavye= new Scanner(System.in);
		System.out.println("lutfen arrayin boyutunu girini");
		int boyut= klavye.nextInt();
		
		String arr [] = new String[boyut];
		
		for(int i= 0; i<arr.length; i++) {
			System.out.println("lutfen elemani girini");
			arr[i]= klavye.next();
	}
		System.out.println(Arrays.toString(arr));

		int toplam=0;
		
		for(int i=0; i<arr.length;i++){
			
			toplam= toplam+ arr[i].length();
}
		System.out.println(toplam);
}
}