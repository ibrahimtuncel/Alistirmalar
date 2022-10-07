package Ders36AbstractClass_Method;

public abstract class Hayvan {

	public abstract void  yemek(); //abstract methodu== soyut
		
	public void icmek() { // concrete==somut
		System.out.println("Hayvanlar su icer.");
	}	
	protected abstract void sesCikar();
		
	
	}


