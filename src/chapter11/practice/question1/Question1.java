package chapter11.practice.question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        ArrayList scores = new ArrayList(5);
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.printf("학생 %d의 점수를 입력하세요.", i + 1);
            scores.add(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            sum += (Integer) scores.get(i);
        }
        double avg = sum / 5.0;
        Collections.sort(scores);
        System.out.println("학생들의 점수 : " + scores);
        System.out.println("평균 : " + avg);
    }
}
