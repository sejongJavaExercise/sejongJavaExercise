package chapter7.notion.question49;

public class Question49 { public static void main(String[] args) {} }

class OuterClass{
    private int a = 1;
    class InstanceClass{
        int b = a;
    }
    void outerClassMethod(){
        int CONSTANT = 2;
        class LocalClass{
            int c = CONSTANT;
        }
    }
}
