package chapter11.notion.question31;

import java.util.*;

public class Question31 {
    public static void main(String[] args) {
        TreeSet qustion31_1 = new TreeSet();
        HashSet hashSet = new HashSet();
        TreeSet qustion31_2 = new TreeSet(hashSet);
        TreeSet qustion31_3 = new TreeSet(Comparator.reverseOrder());
        TreeSet treeSet = new TreeSet(Arrays.asList(50, 10, 30, 40, 20));
        System.out.println(treeSet); // 출력값을 예상해서 작성하시오.
        boolean qustion31_4 = treeSet.add(60);
        boolean qustion31_5 = treeSet.addAll(Arrays.asList(70, 80, 90, 100));
        int qustion31_6 = (Integer) treeSet.ceiling(40);
        int qustion31_7 = (Integer) treeSet.floor(40);
        int qustion31_8 = (Integer) treeSet.higher(40);
        int qustion31_9 = (Integer) treeSet.lower(40);
        boolean qustion31_10 = treeSet.contains(70);
        boolean qustion31_11 = treeSet.containsAll(Arrays.asList(10, 20, 30));
        TreeSet qustion31_12 = (TreeSet) treeSet.descendingSet();
        int qustion31_13 = (Integer) treeSet.first();
        int qustion31_14 = (Integer) treeSet.last();
        TreeSet qustion31_15 = (TreeSet) treeSet.subSet(30, 70);
        TreeSet qustion31_16 = (TreeSet) treeSet.subSet(30, false, 70, true);
        TreeSet qustion31_17 = (TreeSet) treeSet.headSet(50);
        TreeSet qustion31_18 = (TreeSet) treeSet.tailSet(50);
        //참고 : headSet과 tailSet도 boolean 타입 매개변수 inclusive를 사용할 수 있다.
        boolean qustion31_19 = treeSet.isEmpty();
        boolean qustion31_20 = treeSet.remove(100);
        boolean qustion31_21 = treeSet.retainAll(Arrays.asList(10, 30, 50, 70, 90));
        int qustion31_22 = treeSet.size();
        treeSet.clear();
    }
}
