package chapter9.practice.question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i < n; i++) {
            if(i % 3 == 0){
                stringBuffer.append("엄");
            }
            else if(i % 3 == 1){
                stringBuffer.append("준");
            }
            else{
                stringBuffer.append("식");
            }
        }
        System.out.println(stringBuffer);
    }
}
