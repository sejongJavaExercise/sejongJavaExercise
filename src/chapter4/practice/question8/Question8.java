package chapter4.practice.question8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            int r = (int) (Math.random() * (y - x) + x);
            System.out.printf("%d ",r);
        }
    }
}
