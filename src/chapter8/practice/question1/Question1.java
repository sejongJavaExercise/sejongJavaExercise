package chapter8.practice.question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("프로그램을 시작합니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("예외를 발생시키겠습니까? (y / n) ");
        String answer = scanner.nextLine();
        if(answer.equals("y")){
            System.out.println("예외를 발생시킵니다...");
            try{
                throw new Exception();
            }
            catch(Exception e){
                System.out.println("예외가 발생했습니다.");
            }
        }
        else{
            System.out.println("예외를 발생시키지 않습니다...");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}

