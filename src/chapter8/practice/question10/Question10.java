package chapter8.practice.question10;

public class Question10 {
    public static void main(String[] args) {
        try{
            method();
        }
        catch (Exception e){

        }
    }

    static void method(){
        throw new RuntimeException(new Exception("Exception 발생"));
    }
}
