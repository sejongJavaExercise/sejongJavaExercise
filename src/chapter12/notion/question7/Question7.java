package chapter12.notion.question7;

import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) {
        Bookshelf<Novel> bookshelf = new Bookshelf<Novel>();
        //bookshelf = new Bookshelf<Comic>();
    }
}

class Book{}
class Novel extends Book {}

class Bookshelf<T extends Book> {
    ArrayList<T> list = new ArrayList<T>();
}