package chapter14.practice.question1;

import java.util.Arrays;

public class TwoTimesArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Arrays.stream(arr)
                .map(i -> i * 2)
                .forEach(i -> System.out.print(i + " "));
    }
}