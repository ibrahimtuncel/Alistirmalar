import java.util.Arrays;

public class Alıstırma12 {

	public static void main(String[] args) {
		
		int arr[][]= new int[3][2];
		
		System.out.println(Arrays.deepToString(arr));
		
		arr[0][1]= 12;
		arr[1][1]= 15;
		arr[2][0]= 27;
		System.out.println(Arrays.deepToString(arr));
		
		int brr[][]= {{2,3}, {12,13,14,15,16},{2,-2,-3,-4}};
		System.out.println(Arrays.deepToString(brr));
		
		//array in elemanlarının toplamını veren bir kod
		int crr[][]= {{2,3}, {12,13,14}};
		int toplam= 0;
		
			for(int i=0; i<crr.length;i++) {
				for( int j= 0; j<crr[i].length; j++) {
					toplam= toplam + crr[i][j];
				}
			}
			System.out.println(toplam);
	}

}
