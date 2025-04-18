package Aula_12.Ex1;

import java.util.*;
import java.nio.charset.Charset;
import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        // Escreva um programa que leia um ficheiro de texto à sua escolha e que conte o
        // número de
        // palavras diferentes existentes. Por exemplo, o resultado poderá ser:
        // Número Total de Palavras: 161
        // Número de Diferentes Palavras: 112

        // Ler ficheiro major.txt
        ArrayList<String> words = readFile("./src/Aula_12/Ex1/major.txt");
        Map<String, Map<String, Integer>> map = new TreeMap<>();

        for (int i = 0; i < words.size() - 1; i++) {
            String word = words.get(i);
            String nextWord = words.get(i + 1);

            if (map.containsKey(word)) {
                Map<String, Integer> mapWord = map.get(word);
                if (mapWord.containsKey(nextWord)) {
                    mapWord.put(nextWord, mapWord.get(nextWord) + 1);
                } else {
                    mapWord.put(nextWord, 1);
                }
            } else {
                Map<String, Integer> mapWord = new TreeMap<>();
                mapWord.put(nextWord, 1);
                map.put(word, mapWord);
            }
        }
        // imprimir no formato pedido
        System.out.println("Número Total de Palavras: " + words.size());
        System.out.println("Número de Diferentes Palavras: " + map.size());
    }

    public static ArrayList<String> readFile(String path) throws IOException {
        Scanner input = new Scanner(new FileReader(path, Charset.forName("UTF-8")));
        input.useDelimiter("[\\t\\n\\r.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\\' ]+");

        ArrayList<String> words = new ArrayList<String>();

        while (input.hasNext()) {
            String word = input.next();
            // check if word is new and add it to the list
            if (word.length() > 2 && !words.contains(word)) {
                words.add(word.toLowerCase());
            }
        }
        return words;
    }
}
