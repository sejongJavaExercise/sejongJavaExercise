package chapter11.notion.question33;

import java.util.*;

public class Question33 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(Arrays.asList(10));
        Collections.addAll(arrayList, 20, 30, 40, 50);
        Collections.rotate(arrayList, 2);
        Collections.swap(arrayList, 2, 4);
        Collections.shuffle(arrayList);
        Collections.sort(arrayList);
        Collections.binarySearch(arrayList, 50);
        int question33_7 = (Integer) Collections.max(arrayList);
        int question33_8 = (Integer) Collections.min(arrayList);
        ArrayList anotherList = new ArrayList(Arrays.asList(60, 70, 80, 90, 100));
        boolean question33_9 = Collections.disjoint(arrayList, anotherList);
        Collections.fill(arrayList,50);
        Collections.copy(anotherList, arrayList);
        Collections.replaceAll(arrayList, 50, 100);
    }
}
