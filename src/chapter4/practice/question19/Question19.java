package chapter4.practice.question19;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int m = x > y ? y : x;
        int result=m;
        for (int i = m; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
