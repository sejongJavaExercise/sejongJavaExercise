package chapter5.practice.question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n/2; i++) {
            int tmp=arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = tmp;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
