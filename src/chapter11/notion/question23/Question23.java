package chapter11.notion.question23;

import java.util.*;

public class Question23 {
    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
        int[] question23_1 = Arrays.copyOf(arr, arr.length);
        int[] question23_2 = Arrays.copyOf(arr, 10);
        int[] question23_3 = Arrays.copyOfRange(arr, 1, 4);
        int[] question23_4 = new int[10];
        Arrays.fill(question23_4, 2);
        Arrays.sort(arr);
        int question23_6 = Arrays.binarySearch(arr, 50);
        String question23_7 = Arrays.toString(arr);
        int[] arr2 = {10, 20, 30, 40, 50};
        int[][] matrix1 = {
                {1, 0},
                {0, 1}
        };
        int[][] matrix2 = {
                {1, 0},
                {0, 1}
        };
        String question23_8 = Arrays.deepToString(matrix1);
        boolean question23_9 = Arrays.equals(arr, arr2);
        boolean question23_10 = Arrays.deepEquals(matrix1, matrix2);
        List question23_11 = Arrays.asList(10, 20, 30);
        System.out.println(Arrays.equals(matrix1, matrix2));
    }
}
