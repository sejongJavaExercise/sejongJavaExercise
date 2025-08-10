package chapter3.practice.question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean outOfRange = !(0 <= x && x <= 100); // 논리 부정 연산자 사용
        System.out.println(outOfRange);
        sc.close();
    }
}
