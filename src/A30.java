
public class A30 {

	public static void main(String[] args) {

		/*
		 ekmek kelimesinin ilk ve son gorunumu arasinda kullanilan bir string
		 stringin sandvic olup olmadigini kontrol
		 ekmekmaydonosekmek= bası sonu ayni
		 
		 */
		String kelime= ("ekmekmaydonosekmek");
		System.out.println(kelime);
		
		int ilkGorunum= kelime.indexOf("ekmek");
		int sonGorunum= kelime.lastIndexOf("ekmek");
		
		System.out.println("ilk indeks "+ ilkGorunum+ " ve son indeks "+ sonGorunum);
		
		if(ilkGorunum==sonGorunum) {
			System.out.println(" sandvic degildir.");
			
		}else {
			System.out.println("sandvic");
			System.out.println("ara kelime "+kelime.substring(ilkGorunum+5, sonGorunum));
		}

	}

}
