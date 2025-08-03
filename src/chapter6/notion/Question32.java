package chapter6.notion;

public class Question32 {
    public static void main(String[] args) {
        method1();
        method4();
    }

    public static void method1(){}
    public static void method2(){
        System.out.println("Hello world!");
    }

    public static void method3(){
        method1();
        method2();
    }

    public static void method4(){
        method3();
    }
}
