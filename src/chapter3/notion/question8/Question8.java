package chapter3.notion.question8;

public class Question8 {
    public static void main(String[] args) {
        System.out.println(0 < 1);
        System.out.println(0 >= 1);
        System.out.println(1 == 1);
        System.out.println(0 != 1);
        System.out.println(false == false);

        String str1 = "Question 8";
        String str2 = new String("Question 8");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
