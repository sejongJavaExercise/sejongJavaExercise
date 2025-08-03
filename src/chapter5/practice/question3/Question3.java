package chapter5.practice.question3;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = sum / (double) n;
        System.out.println(avg);
    }
}
