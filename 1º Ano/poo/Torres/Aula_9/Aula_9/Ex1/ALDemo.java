package Aula_9.Ex1;

import Aula_6.Ex1.Pessoa;
import Aula_5.Ex1.DateYMD;
import Aula_7.Ex2.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        if (c1.contains(50)) {
            System.out.println("Contém o elemento 50");
        } else {
            System.out.println("Não contém o elemento 50");
        }

        for (int i = 0; i < c1.size(); i++) {
            System.out.println("Elemento: " + c1.get(i) + " na posição " + i);
        }

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

        Set<Pessoa> c3 = new HashSet<>();

        Pessoa p1 = new Pessoa("Ana Santos", 98012244, new DateYMD(5, 10, 1988));
        c3.add(p1);
        c3.add(p1);
        c3.add(new Pessoa("João", 123456789, new DateYMD(1, 1, 2000)));
        c3.add(new Pessoa("Maria", 987654321, new DateYMD(4, 2, 2010)));
        c3.add(new Pessoa("Joana", 123456789, new DateYMD(11, 10, 2003)));
        c3.add(new Pessoa("Joaquim", 123456789, new DateYMD(23, 7, 2000)));
        c3.add(new Pessoa("Jorge", 123456789, new DateYMD(29, 1, 2000)));
        System.out.println(c3);

        Set<Data> c4 = new TreeSet<>();

        Data d1 = new Aula_7.Ex2.DateYMD(1, 1, 2000);
        c4.add(d1);
        Data d2 = new Aula_7.Ex2.DateYMD(4, 2, 2010);
        c4.add(d2);
        Data d3 = new Aula_7.Ex2.DateYMD(11, 10, 2003);
        c4.add(d3);
        Data d4 = new Aula_7.Ex2.DateYMD(23, 7, 2000);
        c4.add(d4);
        Data d5 = new Aula_7.Ex2.DateYMD(29, 1, 2000);
        c4.add(d5);
        System.out.println(c4);

    }
}