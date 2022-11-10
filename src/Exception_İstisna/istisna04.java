package Exception_İstisna;
//satır satır okuma
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class istisna04 {

	public static void main(String[] args) {


		try {
			BufferedReader dosya= new BufferedReader(new FileReader("src/Exception_İstisna/File01"));
			String satir= dosya.readLine();
			
			
			while(satir !=null){
				System.out.println(satir);
				satir= dosya.readLine();
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("bu dosya bulunamiyor");
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("dosya icindeki satirlar okunamadi");
			
		}

	}

}
