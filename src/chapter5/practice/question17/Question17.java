package chapter5.practice.question17;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] arr = new int[n][m];
        double[] avg = new double[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            avg[i] = sum / (double) m;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(avg[i]);
            System.out.print(" ");
        }
    }
}
