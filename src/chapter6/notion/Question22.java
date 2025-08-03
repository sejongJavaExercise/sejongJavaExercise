package chapter6.notion;

public class Question22 {
    public static void main(String[] args) {
        Box a = new Box();
        a.value = 2;
        plusA(a);
        System.out.println(a.value);
    }

    static void plusA(Box box){
        box.value++;
    }
}

class Box {
    int value;
}