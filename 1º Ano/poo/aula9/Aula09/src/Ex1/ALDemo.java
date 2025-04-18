
package Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ALDemo {
        public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10) 
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++) 
            System.out.println("Elemento: " + c1.get(i));
        

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);

        Set<pessoa> c3 = new HashSet<>();
        c3.add(new pessoa("Alina", 1234, new DateYMD(22, 3, 2000)));
        System.out.println(c3);

        Set<DateYMD> c4 = new TreeSet<>();
        c4.add(new DateYMD(11, 4, 2010));
        c4.add(new DateYMD(1, 4, 1999));
        c4.add(new DateYMD(14, 12, 2005));
        c4.add(new DateYMD(5, 1, 2023));
        c4.add(new DateYMD(30, 5, 1985));
        System.out.println(c4);
    }
}