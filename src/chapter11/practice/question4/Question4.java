package chapter11.practice.question4;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Integer[] arr = {5, 4, 7, 8, 10, 2, 3, 1, 6, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,new ReverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}

class ReverseOrder implements Comparator{
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Integer && o2 instanceof Integer))
            return -1;
        else{
            Integer x = (Integer) o1;
            Integer y = (Integer) o2;
            return x.compareTo(y) * -1;
        }
    }
}
