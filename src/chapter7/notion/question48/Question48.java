package chapter7.notion.question48;

public class Question48 {
    public static void main(String[] args) {
        OuterClass outerInstance = new OuterClass();
        System.out.println(outerInstance.a);
//        OuterClass.InstanceClass instanceInnerInstance = outerInstance.new InstanceClass();
//        System.out.println(instanceInnerInstance.b); // 권장하지 않음
        System.out.println(OuterClass.StaticClass.i);
        System.out.println(OuterClass.InstanceClass.CONSTANT);
    }
}

class OuterClass{
    int a = 1;
    class InstanceClass{
        int b = 2;
        int c = a;
        //int d = StaticClass.h;
        int e = new StaticClass().h;
        int f = StaticClass.i;
        //int g = new LocalClass().k;
        final static int CONSTANT = 100;
    }
    static class StaticClass{
        int h = 3;
        static int i = 4;
        //int j = new InstanceClass().b;
    }
    void outerClassMethod(){
        class LocalClass{
            int k = 5;
        }
    }
}