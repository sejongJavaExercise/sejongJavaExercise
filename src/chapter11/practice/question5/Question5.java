package chapter11.practice.question5;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        HashSet a = new HashSet(Arrays.asList(1, 2, 3, 4, 5));
        HashSet b = new HashSet(Arrays.asList(4, 5, 6, 7, 8));
        HashSet intersection = new HashSet();
        HashSet difference = new HashSet();
        HashSet sum = new HashSet();
        //a와 b의 교집합을 만드는 코드
        Iterator iterator=b.iterator();
        while (iterator.hasNext()) {
            Object elementOfB = iterator.next();
            if(a.contains(elementOfB))
                intersection.add(elementOfB);
        }
        //a와 b의 차집합을 만드는 코드
        iterator=a.iterator();
        while (iterator.hasNext()) {
            Object elementOfA = iterator.next();
            if(!b.contains(elementOfA))
                difference.add(elementOfA);
        }
        //a와 b의 합집합을 만드는 코드
        iterator=a.iterator();
        while (iterator.hasNext())
            sum.add(iterator.next());
        iterator=b.iterator();
        while (iterator.hasNext())
            sum.add(iterator.next());
    }
}
