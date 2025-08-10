package chapter3.practice.question13;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = s.charAt(0);
        boolean isUpper = (ch >= 'A' && ch <= 'Z');
        System.out.println(isUpper);
        sc.close();
    }
}
