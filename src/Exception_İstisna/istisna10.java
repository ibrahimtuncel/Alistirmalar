package Exception_İstisna;
import java.util.*;
public class istisna10 {

	public static void main(String[] args) {
		// IllegalStateException
		
		List<Integer>liste=new ArrayList<>();

		liste.add(21);
		liste.add(22);
		liste.add(23);
		System.out.println(liste);
		
		Iterator<Integer> itr=liste.iterator();
		itr.next();
		itr.remove();
		System.out.println(itr);
		
	}
	

}
