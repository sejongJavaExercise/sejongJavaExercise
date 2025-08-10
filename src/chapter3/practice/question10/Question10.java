package chapter3.practice.question10;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = (x >= y) ? x : y; // 삼항 연산자 사용
        System.out.println(max);
        sc.close();
    }
}
