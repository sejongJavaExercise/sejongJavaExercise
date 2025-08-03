package chapter4.notion.question13;

public class Question13 {
    public static void main(String[] args) {
        int i = 1, sum = 0;

        while (true) {
            sum += i;
            if (i == 4){
                break;
            }
            i++;
        }

        System.out.println(sum);
    }
}
