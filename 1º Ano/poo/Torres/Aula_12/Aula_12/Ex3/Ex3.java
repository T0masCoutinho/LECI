package Aula_12.Ex3;

import java.util.*;
import java.io.*;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();
        try {
            movies = getMoviesList("./src/Aula_12/Ex3/movies.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro movies.txt não encontrado.");
            System.exit(1);
        }

        // b)
        System.out.println("b)");
        System.out.println(movies);

        // c) 1.
        movies.sort(Comparator.comparing(Movie::getScore).reversed());
        System.out.println("\n");
        System.out.println("c) 1:");
        System.out.println(movies);
        // c) 2.
        movies.sort(Comparator.comparing(Movie::getRunningTime));
        System.out.println("\n");
        System.out.println("c) 2:");
        System.out.println(movies);

        // d)
        Set<String> genresSet = new HashSet<>();
        for (Movie movie : movies) {
            genresSet.add(movie.getGenre());
        }
        System.out.println("\n");
        System.out.println("d)");
        System.out.println(genresSet);

        // e)
        String comedyMovies = "";
        System.out.println("Qual a categoria de filmes que pretende?");
        try (Scanner sc = new Scanner(System.in)) {
            String genre = sc.nextLine();
            if (!genresSet.contains(genre)) {
                System.out.println("Não existe essa categoria de filmes.");
                System.exit(1);
            } else {
                for (Movie movie : movies) {
                    if (movie.getGenre().toLowerCase().equals(genre) && movie.getScore() > 60) {
                        comedyMovies += movie.getName() + "\n";
                    }
                }
            }
        }
        try {
            generateFile(comedyMovies, "./src/Aula_12/Ex3/myselection.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Movie> getMoviesList(String filePath) throws FileNotFoundException {
        ArrayList<Movie> movies = new ArrayList<>();

        Scanner sc = new Scanner(new FileInputStream(filePath));
        sc.nextLine();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] fields = line.split("\t");
            Movie movieToAdd = new Movie(fields[0], Double.valueOf(fields[1]), fields[2], fields[3],
                    Integer.valueOf(fields[4]));
            movies.add(movieToAdd);
        }

        movies.sort(Comparator.comparing(Movie::getName));

        return movies;
    }

    public static void generateFile(String data, String path) throws IOException {
        PrintWriter out = new PrintWriter(new File(path));
        out.print(data);
        out.close();
    }
}
