package chapter3.practice.question12;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // 삼항 연산자(조건 연산자)만을 사용하여 최댓값 선택
        int max = (a >= b ? (a >= c ? a : c) : (b >= c ? b : c));
        System.out.println(max);
        sc.close();
    }
}
