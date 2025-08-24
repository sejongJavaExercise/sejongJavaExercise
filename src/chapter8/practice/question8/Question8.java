import java.util.Scanner;

public class MethodMain {
    public static void main(String[] args) {
        try {
            method();
        } catch (NullPointerException e) {
            System.out.println("main에서 NullPointerException이 처리되었습니다.");
        }
    }

    static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 (1 또는 2): ");
        int num = scanner.nextInt();

        if (num == 1) {
            try {
                throw new ArithmeticException("Arithmetic 예외 발생");
            } catch (ArithmeticException e) {
                System.out.println("method에서 ArithmeticException이 처리되었습니다.");
            }
        } else if (num == 2) {
            throw new NullPointerException("NullPointer 예외 발생");
        }
    }
}
