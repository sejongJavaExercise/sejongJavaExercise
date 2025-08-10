package chapter3.practice.question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean inRange = (0 <= x) && (x <= 100);
        System.out.println(inRange);
        sc.close();
    }
}
