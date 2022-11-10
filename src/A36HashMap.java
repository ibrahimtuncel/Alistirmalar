import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A36HashMap {

	
	/*Bir cumlede kullanilan herbir kelimenin kac sefer kullanildigini gosteren bir kod yaziniz
	 Orn: "Java is easy, Type codes to learn Java. To earn money learn Java."
	 output: Java=3, is=1, easy=1, Type=1, ....learn=2, ....*/

	public static void main(String[] args) {
		String str= "Java is easy, Type codes to learn Java. To earn money learn Java.";
		
		str=str.replaceAll("\\p{Punct}","" ).toLowerCase();
		System.out.println(str);
		
		Map<String, Integer>sonuc= new HashMap<>();
		String[] kelime= str.split(" ");
		
		System.out.println(Arrays.toString(kelime));
		
		for(String w:kelime) {
			
			Integer degerSayisi=sonuc.get(w);
			if(degerSayisi==null) {
			sonuc.put(w,1);	
			
			}else {
			sonuc.put(w,degerSayisi+1 );
			}
		}
		
		System.out.println(sonuc);
	}

}
