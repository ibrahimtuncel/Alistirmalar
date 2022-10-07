package Ders36AbstractClass_Method;

public class Kopek extends Hayvan{
	
	public static void main(String[] args) {
		
		Sahip insam= new Sahip();
		Kedi kedi=new Kedi();
		
		Hayvan tekir= new Kedi();
		tekir.sesCikar();
		
		Hayvan golden= new Kopek();
		golden.sesCikar();
		
		kedi.ciftestir(tekir);
		
		//insan.sahiplendir(golden);
		
		}
	public void havlar(){
		
		
	}
	
	protected void sesCikar() {
		System.out.println("Hav Hav");
	}	
	

	@Override
	public void yemek() {
		
		
	}

	

}
