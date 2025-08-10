package chapter2.practice.question16;

import java.util.Scanner;

public class Question16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble(); 
        System.out.printf("%d\n",(int)d);
        System.out.printf("%d", (int)(d+0.5));
    }
}
