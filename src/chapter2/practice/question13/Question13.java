package chapter2.practice.question13;

import java.util.Scanner;

public class Question13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;

        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        int temp = x;
        x = z;
        z = y;
        y = temp;

        System.out.printf("x = %d, y = %d, z = %d", x, y, z);
    }
}
