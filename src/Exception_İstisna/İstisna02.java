package Exception_İstisna;
import java.io.*;
public class İstisna02 {

	public static void main(String[] args) {
		
		
		
		try {
			
			FileInputStream dosya= new FileInputStream("src/Exception_İstisna/File01");
			
			 int i=0;
				while((i= dosya.read())!=-1) {
			
					System.out.print((char)i);
					
					}
			
		} catch (FileNotFoundException e) {
			System.out.println("verdiginis adres yanlistir.");

			//e.printStackTrace();
			System.out.println(e.getMessage());
		
		} catch (IOException e) {
			System.out.println("dosya icindeki karakterler okunamadi");
		}
		
	}
}
