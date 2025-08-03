package chapter7.notion.question52;

public class Question52 {
    public static void main(String[] args) {
        int x = 1;
        Anonymous a = new Anonymous(){
            public void method(){ /*x++;*/ }
        };
    }
}

interface Anonymous{ void method(); }
