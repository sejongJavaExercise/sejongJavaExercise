package chapter7.notion.question51;

public class Question51 {
    public static void main(String[] args) {
        Anonymous a = new Anonymous(){
            void method(){}
        };
        //a.method();
    }
}

interface Anonymous{}
