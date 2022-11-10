
public class A29 {

	public static void main(String[] args) throws InterruptedException {
		// 10 dk lık sureyi geriye doğru consolde yazdirma
	
		int saat=5;
		
		for(int k=saat-1;k>=0;k--) {
		for(int i=59;i>=0;i--) {
			for(int j=60; j>=0;j--) {
				
				Thread.sleep(1000);
				
				System.out.println(k+" saat"+i+" dakika "+ j+" saniye kaldi");
			}
		}	
		}
		System.out.println("vakit doldu");
	}

}
