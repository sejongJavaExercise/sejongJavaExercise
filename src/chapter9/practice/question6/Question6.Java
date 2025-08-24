import java.util.Scanner;

public class StringLengthCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int n = sc.nextInt();

        int len = str.length();

        int absN = Math.abs(n);

        System.out.println(Math.max(len, absN));
    }
}
