package chapter4.practice.question22;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int m = x > y ? x : y;
        int result = m;
        while (true) {
            if (m % x == 0 && m % y == 0) {
                result = m;
                break;
            }
            m++;
        }
        System.out.println(result);
    }
}
