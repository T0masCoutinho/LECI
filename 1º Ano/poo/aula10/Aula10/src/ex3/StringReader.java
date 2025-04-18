package ex3;

import java.util.*;

public class StringReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String frase = sc.nextLine();

        HashMap<Character, List<Integer>> charIndiceHashMap = new HashMap<>();

        for (int i = 0; i < frase.length(); i++){
            char ch = frase.charAt(i);

            charIndiceHashMap.putIfAbsent(ch, new ArrayList<>());

            charIndiceHashMap.get(ch).add(i); //vais buscar o current character e adiciona o value index
        }

        for( Map.Entry<Character, List<Integer>> entry: charIndiceHashMap.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    sc.close();
 }
}
