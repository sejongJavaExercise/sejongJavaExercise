package chapter2.practice.question12;

import java.util.Scanner;

public class Question12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력해주세요 >>> ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("문자열을 입력해주세요 >>> ");
        String str = scanner.nextLine();

        System.out.printf("x = %d, str = %s", x, str);
    }
}
