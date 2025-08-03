package chapter12.practice.question2;

import java.util.*;

public class Question2new {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "ghi");

        Collection values = map.values();
        for(Object object : values){
            System.out.println((String) object);
        }
    }
}
