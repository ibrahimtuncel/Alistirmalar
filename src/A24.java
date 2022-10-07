
public class A24 {

	//bir Stringin palindrom olup olmadıgını tespit eden bir kod yaını.
	//tersi kendisi olan
	
	
	public static void main(String[] args) {
		
		String s= "12321";
		String tertenS= "";
		
		int sonInx= s.length()-1;//4
		
		while(sonInx>-1){//4,3,2,1,0
	
		tertenS= tertenS + s.charAt(sonInx);
		
		sonInx--;
		
		}
		
		if(s.equals(tertenS)) {
			System.out.println("bu bir palindrom");
		}
		else {
			System.out.println("bu bir palindrom degidir");
			}

}
}