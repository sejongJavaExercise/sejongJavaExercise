package chapter5.notion.question10;

import java.util.Arrays;

public class Question10 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] arr2 = {50, 40, 30, 20, 10};
        boolean question10_1 = Arrays.equals(arr, arr2);
        String question10_2 = Arrays.toString(arr);
        int[] question10_3 = Arrays.copyOf(arr, arr.length);
        int[] question10_4 = Arrays.copyOfRange(arr, 1, 4);
        Arrays.sort(arr);
    }
}
