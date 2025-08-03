package chapter4.practice.question7;

public class Question7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 6 != 0) {
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
