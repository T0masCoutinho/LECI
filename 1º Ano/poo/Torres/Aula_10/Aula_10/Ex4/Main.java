package Aula_ 10.Ex4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        Scanner input = new Scanner(
                new FileReader(
                        "C:/Users/Asus/OneDrive - Universidade de Aveiro/Documents/2o ano/POO/Aulas/src/Aula_10/Ex4/words.txt"));
        while (input.hasNext()) {
            String word = input.next();
            if (word.matches("[a-zA-Z]+")) {
                if (word.endsWith("s")) {
                    System.out.println(word);
                } else {
                    continue;
                }
                if (word.length() > 2) {
                    map.put(word, word.length());
                }
            }
        }
        input.close();
    }
}