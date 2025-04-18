package avaliacao;

import java.util.*;
import java.io.*;

public class BookManager {

    public HashMap <Integer, Book> library = new HashMap <> ();
    public Book b;
    public Scanner sc;

    public void addBook(Book b) {
        library.put(b.getId(), b);;
    }

    public boolean removeBook(int id) {
        for (int key : library.keySet()) {
            if (key == id) {
                library.remove(id);
                return true;
            }
        }
        return false;
    }

    public Book getBook(int id) {
        for (int key : library.keySet()) {
            if (key == id)
                b = library.get(id);
                return b;
        }
        return null;
    }

    public double calculateBookLoanCost (int days, int id) {
        BookCostCalculator bcc = new BookCostCalculator();
        if (library.containsKey(id)) {
                    
            b = library.get(id);
    
                
               return  bcc.calculateCost(days);
                
            }

        return 0.0;
        
    }


    public void printAllBooks() {
        for (int key : library.keySet()) {
            b = library.get(key);
            System.out.println(b);
        }
    }

    

}
