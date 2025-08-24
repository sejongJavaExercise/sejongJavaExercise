import java.util.Scanner;

public class SubStringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String sub = str.substring(6, 11);
        System.out.println(sub);
    }
}
