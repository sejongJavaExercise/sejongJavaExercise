package chapter8.practice.question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("프로그램을 시작합니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("예외를 발생시키겠습니까? (y / n) ");
        String answer = scanner.nextLine();
        if(answer.equals("y")){
            System.out.println("어떤 예외를 발생시키겠습니까?");
            System.out.println("1. ArithmeticException");
            System.out.println("2. NullPointerException");
            int exceptionNumber = scanner.nextInt();
            try{
                if(exceptionNumber == 1){
                    System.out.println("ArithmeticException을 발생시킵니다...");
                    throw new ArithmeticException("0을 0으로 나눕니다.");
                }
                else{
                    System.out.println("NullPointerException을 발생시킵니다...");
                    throw new NullPointerException("null값의 참조변수에 접근합니다.");
                }
            }
            catch (ArithmeticException e){
                System.out.println("ArithmeticException이 발생했습니다.");
                System.out.println("에러 메세지 : " + e.getMessage());
            }
            catch (Exception e){
                System.out.println("Exception이 발생했습니다.");
                e.printStackTrace();
            }
        }
        else{
            System.out.println("예외를 발생시키지 않습니다...");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
