package chapter4.practice.question6;

public class Question6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
