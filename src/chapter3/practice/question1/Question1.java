package chapter3.practice.question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 사용자로부터 정수 입력
        x++;                  // 증감 연산자 사용하여 1 증가
        System.out.println(x);
        sc.close();
    }
}
