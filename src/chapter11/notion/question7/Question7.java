package chapter11.notion.question7;

import java.util.ArrayList;
import java.util.Collection;

public class Question7 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(10);
        //arrayList = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        for(int i=1;i<10;i++){ arrayList.add(i); }
        Collection c = arrayList;

        boolean question7_1 = c.add(10);
        boolean question7_2 = c.contains(3);
        boolean question7_3 = c.isEmpty();
        boolean question7_4 = c.remove(7);
        int question7_5 = c.size();
        c.clear();
    }
}
