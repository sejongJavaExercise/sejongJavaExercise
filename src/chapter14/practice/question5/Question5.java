package chapter14.practice.question5;

public class Question5 {
    public static void main(String[] args) {
        int sum = 0;
        String[] arr = new String[]{"abc", "def", "ghij"};
        for (String s : arr) {
            sum += s.length();
        }
        System.out.println(sum);
    }
}
