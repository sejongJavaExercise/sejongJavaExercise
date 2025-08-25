package chapter3.practice.question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x + y); // 덧셈
        System.out.println(x - y); // 뺄셈
        System.out.println(x * y); // 곱셈
        System.out.println((double)x / y); // 나눗셈
        System.out.println(x % y); // 나머지
        sc.close();
    }
}
