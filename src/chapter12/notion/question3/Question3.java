package chapter12.notion.question3;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        List<Novel> novels = new ArrayList<>();
        List<Book> bookshelf = new ArrayList<>();
        //novels.add(new Book());
        novels.add(new Novel());
        bookshelf.add(new Book());
        bookshelf.add(new Novel());
    }
}

class Book{}
class Novel extends Book{}