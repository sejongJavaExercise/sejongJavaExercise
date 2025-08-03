package chapter12.notion.question4;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        List<Novel> novels = new ArrayList<>();
        novels.add(new Novel("Harry Potter"));
        novels.add(new Novel("Sherlock Holmes"));
        //print(novels);
    }

    static void print(List<Book> list) {
        for (Book book : list) {
            System.out.println(book.title);
        }
    }
}

class Book{
    String title;
    Book(String title){ this.title = title; }
}

class Novel extends Book {
    Novel(String title){
        super(title);
    }
}
