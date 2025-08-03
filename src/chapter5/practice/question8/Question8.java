package chapter5.practice.question8;

import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
