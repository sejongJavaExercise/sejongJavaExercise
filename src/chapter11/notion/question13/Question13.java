package chapter11.notion.question13;

import java.util.*;

public class Question13 {
    public static void main(String[] args) {
        ArrayList question13_1 = new ArrayList();
        ArrayList question13_2 = new ArrayList(10);
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 3; i++) {hashSet.add(new Integer(i + 1)); }
        ArrayList question13_3 = new ArrayList(hashSet);

        ArrayList arrayList = new ArrayList(); // [10, 20, 30, 40]
        for (int i = 0; i < 4; i++) {arrayList.add((i + 1) * 10); } // autoBoxing
        boolean question13_4 = arrayList.add(50);
        arrayList.add(5, 60);
        ArrayList arrayList2 = new ArrayList(); // [70, 80, 90, 100]
        for (int i = 0; i < 4; i++) { arrayList2.add(new Integer((i + 7) * 10)); }
        boolean question13_5 = arrayList.addAll(arrayList2);
        boolean question13_6 = arrayList.contains(50);
        int question13_7 = (Integer) arrayList.get(2);
        int question13_8 = arrayList.indexOf(80);
        boolean question13_9 = arrayList.isEmpty();
        int question13_10 = (Integer) arrayList.remove(3);
        boolean question13_11 = arrayList.remove(new Integer(30));
        boolean question13_12 = arrayList.removeAll(arrayList2);
        int question13_13 = (Integer) arrayList.set(1, 30);
        int question13_14 = arrayList.size();
        List question13_15 = arrayList.subList(1, 4);
        arrayList.clear();
    }
}
