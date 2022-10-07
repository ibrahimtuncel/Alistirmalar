import java.util.Arrays;

public class Alıstırma13 {

		public static void main(String[] args) {
			
		double d[]= new double[6];	
		
		d[0]=2.3;
		d[1]=2.4;
		d[2]=2.9;
		d[3]=2.6;
		d[4]=2.4;
		d[5]=2.8;	
		
		System.out.println(Arrays.toString(d));
		
		double toplam=0;
		// for (int i=0;i<d.length; i++){
			// toplam= toplam +d[i];
			 
			 
			 for (double eleman:d){      //for each
				 toplam= toplam + eleman;
				 
	}
System.out.println(toplam);
}
}