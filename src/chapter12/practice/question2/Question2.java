package chapter12.practice.question2;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        HashMap bookshelf = new HashMap();
        bookshelf.put("Harry Potter", new Book(500, "fantasy"));
        bookshelf.put("Demian", new Book(150, "novel"));
        bookshelf.put("Pride and Prejudice", new Book(1000, "novel"));

        Set titles = bookshelf.keySet();
        Iterator i = titles.iterator();
        while (i.hasNext()) {
            String currentTitle = (String) i.next();
            System.out.println(currentTitle);
        }
    }
}

class Book{
    int totalPages;
    String genre;
    Book(int totalPages, String genre){
        this.totalPages = totalPages;
        this.genre = genre;
    }
}