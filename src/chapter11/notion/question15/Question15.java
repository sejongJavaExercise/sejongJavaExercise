package chapter11.notion.question15;

import java.util.*;

public class Question15 {
    public static void main(String[] args) {
        List list = new ArrayList(); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        for (int i = 0; i < 10; i++) {list.add((i + 1) * 10); }
        for (int i = 0; i < list.size(); i++) { list.remove(i); }
        //for (int i = arrayList.size() - 1; i >= 0; i--) { arrayList.remove(i); }
    }
}
