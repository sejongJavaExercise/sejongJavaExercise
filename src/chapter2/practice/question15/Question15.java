package chapter2.practice.question15;

import java.util.Scanner;

public class Question15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        System.out.printf("%d\n",a * 1000000000);
        System.out.printf("%d", (long)a * 1000000000);
    }
}
