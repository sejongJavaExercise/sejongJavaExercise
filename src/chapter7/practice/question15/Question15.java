package chapter7.practice.question15;

public class Question15 {
    public static void main(String[] args) {
        OuterClass outerInstance = new OuterClass();
        outerInstance.print();
    }
}

class OuterClass{
    int x = 1;
    class InstanceClass{
        int x = 2;
        void method(){
            int x = 3;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(OuterClass.this.x);


        }
    }
    void print(){
        InstanceClass innerInstance = new InstanceClass();
        innerInstance.method();
    }
}