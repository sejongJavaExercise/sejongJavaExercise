package chapter11.notion.question25;

import java.util.*;

public class Question25 {
    public static void main(String[] args) {
        HashSet question25_1 = new HashSet();
        ArrayList arrayList = new ArrayList();
        HashSet question25_2 = new HashSet(arrayList);
        HashSet question25_3 = new HashSet(10);
        HashSet question25_4 = new HashSet(10, (float)0.8);
        HashSet hashSet = new HashSet();
        boolean question25_5 = hashSet.add(1);
        HashSet addSet = new HashSet(Arrays.asList(2, 3, 4, 5));
        boolean question25_6 = hashSet.addAll(addSet);
        boolean question25_7 = hashSet.contains(3);
        boolean question25_8 = hashSet.containsAll(Arrays.asList(3, 4, 5));
        boolean question25_9 = hashSet.isEmpty();
        boolean question25_10 = hashSet.remove(5);
        boolean question25_11 = hashSet.removeAll(Arrays.asList(3, 4));
        HashSet exponentialOf2 = new HashSet(Arrays.asList(2, 4, 8, 16));
        boolean question25_12 = hashSet.retainAll(exponentialOf2);
        int question25_13 = hashSet.size();
        hashSet.clear();
    }
}