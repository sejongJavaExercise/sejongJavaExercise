package chapter4.practice.question23;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0, sum = 0;
        double avg = 0;
        while (true) {
            int x = scanner.nextInt();
            if (x == 0)
                break;
            cnt++;
            sum += x;
        }
        if (cnt != 0) {
            avg = sum / (double) cnt;
            avg = Math.round(avg * 10) / (double) 10;
        }
        System.out.printf("%d개의 정수를 입력하셨습니다.\n", cnt);
        System.out.printf("총합 : %d\n", sum);
        System.out.printf("평균 : %.1f", avg);
    }
}
