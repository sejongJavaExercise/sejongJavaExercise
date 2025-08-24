import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("프로그램을 시작합니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("예외를 발생시키겠습니까? (y / n) ");
        String answer = scanner.nextLine();

        try {
            if (answer.equals("y")) {
                System.out.println("예외를 발생시킵니다...");
                throw new Exception();
            } else {
                System.out.println("예외를 발생시키지 않습니다...");
            }
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
