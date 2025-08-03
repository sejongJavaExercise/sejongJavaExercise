package chapter11.notion.question8;

import java.util.ArrayList;
import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(10);
        //arrayList = [10, 20, 30, 40, 50, 60, 70, 80, 90]
        for(int i=1;i<10;i++){ arrayList.add(10 * i); }
        List list = arrayList;
        list.add(9, 100);
        int question8_2 = (Integer)list.get(6);
        int question8_3 = list.indexOf(30);
        int question8_4 = (Integer)list.remove(6);
        int question8_5 = (Integer)list.set(5, -60);
        List question8_6 = list.subList(3, 7);
    }
}
