package ex1Eex2;

import java.util.*;
public class main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to genres
        library.addBook("Drama", new book("Hamlet", "William Shakespeare", 1600));
        library.addBook("Drama", new book("Death of a Salesman", "Arthur Miller", 1949));
        library.addBook("Fantasy", new book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997));
        library.addBook("Science Fiction", new book("Dune", "Frank Herbert", 1965));
        library.addBook("Mystery", new book("The Maltese Falcon", "Dashiell Hammett", 1930));

        // Printing the library
        System.out.println("Printing library:");
        library.printLibrary();
        System.out.println();

        // Printing genres only
        System.out.println("Printing genres only:");
        library.printGenres();
        System.out.println();

        // Printing books only
        System.out.println("Printing books only:");
        library.printBooks();
        System.out.println();

        // Printing library using toString()
        System.out.println("Printing library using toString():");
        System.out.println(library.toString());
    }



}
