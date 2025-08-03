package chapter8.practice.question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        try {
            method();
        }
        catch(Question9Exception e){
            e.printStackTrace();
        }
    }

    static void method()throws Question9Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("어떤 예외를 발생시키겠습니까?");
        System.out.println("1. ArithmeticException");
        System.out.println("2. NullPointerException");
        System.out.println("3. ClassNotFoundException");
        int answer = scanner.nextInt();
        try{
            if(answer == 1){
                throw new ArithmeticException("ArithmeticException 발생");
            }
            else if(answer == 2){
                throw new NullPointerException("NullPointerException 발생");
            }
            else{
                throw new ClassNotFoundException("ClassNotFoundException 발생");
            }
        }
        catch(Exception e){
            Question9Exception question9Exception = new Question9Exception("Question9Exception 발생");
            question9Exception.initCause(e);
            throw question9Exception;
        }
    }
}

class Question9Exception extends Exception{
    Question9Exception(String message){
        super(message);
    }
}