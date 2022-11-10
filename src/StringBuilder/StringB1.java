package StringBuilder;

public class StringB1 {

	public static void main(String[] args) {
		
		String str="Alistirma";
		
		str.substring(2);
		str.toUpperCase();
		System.out.println(str);
		System.out.println(str.substring(2));
		System.out.println(str.toUpperCase());

		
		//1. yol=
		
		StringBuilder sb= new StringBuilder();
		System.out.println(sb.capacity());//16
		sb.append("Ali java sever");
		System.out.println(sb);
		
		//2.yol=
		StringBuilder sb1= new StringBuilder("veli python calisir ");
		System.out.println(sb1);
		System.out.println(sb1.length());
		sb1.append("ahmet sql ogrendi");
		System.out.println(sb1);	
		
		//3.yol=
		
		StringBuilder sb2= new StringBuilder(5);
		sb2.append("seynep");
		System.out.println(sb2.capacity());
		sb2.append("seynep tester olarak is buldu");
		System.out.println(sb2.capacity());
		
		
		StringBuilder sb3= new StringBuilder("java");
		sb3.append("+").append("selenium").append("+").append("SQL").append(" bilen is bulunur");
		System.out.println(sb3);
		
		sb3.append(" hayat guseldir", 0,10);
		System.out.println(sb3);
		
		sb3.append(sb2, 0,20);
		System.out.println(sb3);
		
		System.out.println(sb3.charAt(5));
		System.out.println(sb3.deleteCharAt(5));
		System.out.println(sb3.delete(5,13));
		
		
		//reverse ters cevirme
		StringBuilder sb4= new StringBuilder("veli python calisir ");
		sb4.reverse();
		System.out.println(sb4);
		
		System.out.println(sb4.indexOf("p"));
		System.out.println(sb4.indexOf("m"));
		System.out.println(sb4.indexOf("i",12));
		
		//insert ekleme
		
		System.out.println(sb2.insert(12, " merhaba arakadalar "));
		
		
		//replace
		System.out.println(sb2.replace(5, 10, "*-_-*"));
		
		
		//set char
		
		sb2.setCharAt(12, '?');
		System.out.println(sb2);
		
		
		//trimToSize
		StringBuilder sb5= new StringBuilder("Ahmet");
		System.out.println(sb5.capacity());//21
		
		sb5.trimToSize();
		System.out.println(sb5.capacity());//5
	
	}

}
