package chapter2.practice.question14;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("a / b = %d", a/b);
        System.out.printf("(double)a / b = %.6f\n", (double)a/b);
        System.out.printf("a / (double)b = %.6f\n", a/(double)b);
    }
}
