package chapter3.practice.question8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = s.charAt(0);
        boolean isDigit = (ch >= '0' && ch <= '9'); // '0'~'9' 범위 판별
        System.out.println(isDigit);
        sc.close();
    }
}
