package chapter14.practice.question2;

public class Question2new {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
