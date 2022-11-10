import java.util.ArrayList;
import java.util.List;

public class A37_Lambda {
//lambda ile elemanlarin karelerini bosluk birakarak yasdir.
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(131);
        l.add(14);
        l.add(9);
        l.add(10);
        l.add(4);
        l.add(12);
        l.add(15);

        System.out.println(l);
        
        l.stream().filter(t-> t%2==0).map(t->t*t).forEach(t-> System.out.print(t+ " "));
        l.stream().map(t->t*t).forEach(t-> System.out.print(t+ " "));
        
       
        
        
        char a =117;
        System.out.println(a);
       
        char b='u';
        System.out.println(b);
        
        int t= b;
        System.out.println(t);
        
        
	}

}
