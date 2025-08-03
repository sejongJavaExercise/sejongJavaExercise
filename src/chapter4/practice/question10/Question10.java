package chapter4.practice.question10;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                cnt++;
            }
        }
        if (cnt == 2) {
            System.out.println("소수입니다.");
        }
        else{
            System.out.println("소수가 아닙니다.");
        }
    }
}
