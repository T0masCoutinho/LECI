package Aula_12.Ex2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {

        String nomeArquivo = "./src/Aula_12/Ex2/a_cidade_e_as_serras.txt";
        String nomeArquivoResultado = "./src/Aula_12/Ex2/report.txt";

        try {
            // Leitura do arquivo
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(nomeArquivo), StandardCharsets.UTF_8));
            String linha;
            Map<Character, Map<String, Integer>> agrupamento = new TreeMap<>();

            // Processamento das palavras
            while ((linha = reader.readLine()) != null) {
                // Configura o delimitador de palavras
                Scanner input = new Scanner(linha);
                input.useDelimiter("[^a-zA-Z]+");

                while (input.hasNext()) {
                    String palavra = input.next();
                    palavra = palavra.toLowerCase();

                    // Verifica se a palavra tem três ou mais caracteres
                    if (palavra.length() >= 3) {
                        char inicial = palavra.charAt(0);

                        // Adiciona a palavra ao agrupamento
                        if (!agrupamento.containsKey(inicial)) {
                            agrupamento.put(inicial, new TreeMap<>());
                        }

                        Map<String, Integer> palavrasIniciais = agrupamento.get(inicial);
                        palavrasIniciais.put(palavra, palavrasIniciais.getOrDefault(palavra, 0) + 1);
                    }
                }

                input.close();
            }

            reader.close();

            // Escrita do arquivo resultado
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(nomeArquivoResultado), StandardCharsets.UTF_8));

            for (char inicial : agrupamento.keySet()) {
                writer.write(inicial + ": ");

                Map<String, Integer> palavrasIniciais = agrupamento.get(inicial);
                List<String> palavrasOrdenadas = new ArrayList<>(palavrasIniciais.keySet());
                Collections.sort(palavrasOrdenadas);

                for (String palavra : palavrasOrdenadas) {
                    int ocorrencias = palavrasIniciais.get(palavra);
                    writer.write(palavra + ", " + ocorrencias + "; " + "\n");
                }

                writer.newLine();
            }

            writer.close();

            System.out.println("Estrutura de dados escrita com sucesso no arquivo: " + nomeArquivoResultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
