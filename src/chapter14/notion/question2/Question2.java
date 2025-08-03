package chapter14.notion.question2;

public class Question2 {
    public static void main(String[] args) {
        //F f = (a, b) -> Math.max(a, b);
//        F f = new F() {
//            @Override
//            public int method(int a, int b) {
//                return a > b ? a : b;
//            }
//        };
        F f = name -> System.out.printf("Hello %s", name);
    }

int max(int a, int b) {
    return a > b ? a : b;
}

double avg(int a,int b,int c) {
    return (a + b + c) / (double) 3;
}

int diceRoll() {
    return (int) (Math.random() * 6 + 1);
}

void printHello(String name) {
    System.out.printf("Hello %s!", name);
}

int[] getRandomValueArray(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = (int) (Math.random() * 100 + 1);
    }
    return arr;
}

}

@FunctionalInterface
interface F{
    void method(String name);
}