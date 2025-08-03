package chapter7.notion.question43;

public class Question43 {
    public static void main(String[] args) {
        Anonymous x = new Anonymous() {
            public void method() {
                System.out.println("interface implemented");
            }
        };
        x.method();
    }
}

interface Anonymous{
    void method();
}