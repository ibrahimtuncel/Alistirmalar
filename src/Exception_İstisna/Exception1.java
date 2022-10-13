package Exception_İstisna;
import java.io.*;
public class Exception1 {

	

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream dosya= new FileInputStream("src/Exception_İstisna/File01");
		
		int i=0;
		
		while((i= dosya.read())!=-1){
			System.out.print((char)i);
			
		}
		dosya.close();
	}

}
