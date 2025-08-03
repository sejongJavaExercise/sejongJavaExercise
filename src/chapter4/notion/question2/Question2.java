package chapter4.notion.question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("if문을 실행하고 싶다면 yes를 입력해주세요.");
        String str = scanner.nextLine();
        if (/*여기에 조건식 작성*/str.equals("yes")) {
            System.out.println("if문이 실행되었습니다.");
        }
    }
}
