package chapter14.practice.question2;

import java.util.Arrays;

public class ArrSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr)
                .sum();
        System.out.println(sum);
    }
}