import java.util.Arrays;
	import java.util.HashMap;
	import java.util.Map;

public class A38_Odev {
	
		/*Bir cumlede kullanilan herbir kelimenin kac sefer kullanildigini gosteren bir kod yaziniz
		 Orn: "Java is easy, Type codes to learn Java. To earn money learn Java."
		 output: Java=3, is=1, easy=1, Type=1, ....learn=2, ....*/

		public static void main(String[] args) {
			String str= "Java is easy, Type codes to learn Java. To earn money learn Java.";
			String str2="";
			
			str=str.replaceAll("\\p{Punct}","" ).toLowerCase();
			str2=str.replace(" ","");
			System.out.println(str2);
			
			Map<String, Integer>sonuc= new HashMap<>();
			String[] kelime= str2.split("");
		
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



