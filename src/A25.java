import java.util.*;
public class A25 {

	public static void main(String[] args) {
		List<Double> maas= new ArrayList<>();
		maas.add(5000.0);
		maas.add(6000.0);
		maas.add(4500.0);
		maas.add(3900.0);
		maas.add(7200.0);
		System.out.println(maas);
		
		for(int i=0; i<maas.size(); i++) {
			maas.set(i, maas.get(i)*1.1);
		}
		System.out.println(maas);
	}

}
