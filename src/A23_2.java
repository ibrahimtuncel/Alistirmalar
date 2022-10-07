
public class A23_2 {

	public static void main(String[] args) {

		int a[]= {4,6,5,-10,8,5,20};
		sayiCifti(a,10);
	}
	
	public static void sayiCifti(int a[], int toplam) {
		
		int sayac=0;
		
		
		for(int i=0; i<a.length; i++) {
			for(int k= i+1; k<a.length; k++) {
				if(a[i]+ a[k]== toplam ) {
				System.out.println(a[i]+"+"+ a[k]+ "="+ toplam);
				sayac++;
			}
		}

}
		
		System.out.println(sayac);
}
}