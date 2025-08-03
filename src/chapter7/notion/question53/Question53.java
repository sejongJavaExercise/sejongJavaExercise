package chapter7.notion.question53;

public class Question53 {
    public static void main(String[] args) {
        Parent parent;
        Child child = new Child();
        parent = child;
        parent.method();
    }
}

class Parent{
    void method(){
        System.out.println("parent");
    }
}

class Child extends Parent{
    void method() {
        System.out.println("child");
    }
}