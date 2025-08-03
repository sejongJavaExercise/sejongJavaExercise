package chapter8.practice.question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("어떤 예외를 발생시키겠습니까?");
        System.out.println("1. Question6Exception");
        System.out.println("2. Queston6RuntimeException");
        int answer = scanner.nextInt();
        try{
            if(answer == 1){
                throw new Question6Exception("Question6Exception 발생");
            }
            else{
                throw new Queston6RuntimeException("Queston6RuntimeException 발생");
            }
        }
        catch(Question6Exception e){
            System.out.println(e.getMessage());
            e.print();
        }
        catch(Queston6RuntimeException e){
            System.out.println(e.getMessage());
            e.print();
        }
    }
}

class Question6Exception extends Exception{
    Question6Exception(String message) {
        super(message);
    }
    void print(){
        System.out.println("checked예외입니다.");
    }
}

class Queston6RuntimeException extends RuntimeException{
    Queston6RuntimeException(String message){
        super(message);
    }
    void print(){
        System.out.println("unchecked예외입니다.");
    }
}