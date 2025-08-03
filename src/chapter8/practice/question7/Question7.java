package chapter8.practice.question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        try{
            method();
        }
        catch(NullPointerException e){
            System.out.println("main에서 NullPointerException이 처리되었습니다.");
        }
    }

    static void method() throws NullPointerException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("어떤 예외를 발생시키겠습니까?");
        System.out.println("1. ArithmeticException");
        System.out.println("2. NullPointerException");
        int answer = scanner.nextInt();
        try{
            if(answer == 1){
                throw new ArithmeticException();
            }
            else{
                throw new NullPointerException();
            }
        }
        catch (ArithmeticException e){
            System.out.println("method에서 ArithmeticException이 처리되었습니다.");
        }
    }
}
