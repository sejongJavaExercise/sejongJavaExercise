package chapter12.notion.question14;

import java.util.*;

public class Question14 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayList<Integer> b;
        b = a;

        ArrayList<Object> c = new ArrayList<Object>();
        ArrayList<Integer> d;
        //d = c;

        ArrayList<Integer> e = new ArrayList<Integer>();
        ArrayList<? extends Object> f;
        f = e;
    }
}
