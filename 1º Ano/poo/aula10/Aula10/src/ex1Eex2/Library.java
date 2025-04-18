package ex1Eex2;

import java.util.*;

public class Library {
    Map<String, List<book>> generoBooks;

    public Library(){
        generoBooks = new HashMap<>();
    }
    
    public void addBook(String genero, book Book){
        generoBooks.computeIfAbsent(genero, k -> new ArrayList<>()).add(Book);
    }

    public void removeBook(String genero, book Book){
        generoBooks.getOrDefault(Book, Collections.emptyList()).remove(Book);
    }

    public void updateBook(String genero, book oldBook, book newBook){
        List<book> books = generoBooks.getOrDefault(genero, Collections.emptyList());
        if (books.contains(oldBook)) {
            int index = books.indexOf(oldBook);
            books.set(index, newBook);
        }
    }

    public void printLibrary() {
        for (Map.Entry<String, List<book>> entry : generoBooks.entrySet()) {
            System.out.println("Genre: " + entry.getKey());
            for (book Book : entry.getValue()) {
                System.out.println(Book);
            }
            System.out.println();
        }
    }

    public void printGenres() {
        System.out.println("Genres:");
        for (String genero : generoBooks.keySet()) {
            System.out.println(genero);
        }
    }

    public void printBooks() {
        System.out.println("Books:");
        for (List<book> books : generoBooks.values()) {
            for (book Book : books) {
                System.out.println(Book);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<book>> entry : generoBooks.entrySet()) {
            sb.append("Genre: ").append(entry.getKey()).append("\n");
            for (book Book : entry.getValue()) {
                sb.append(Book).append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
