package chapter4.practice.question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            int r = (int) (Math.random() * (y - x + 1) + x);
            System.out.printf("%d ",r);
        }
    }
}
