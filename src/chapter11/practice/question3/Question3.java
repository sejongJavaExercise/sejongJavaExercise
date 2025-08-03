package chapter11.practice.question3;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Queue waitingList = new LinkedList();
        final int MAX_WAITING_NUMBER = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============WAITING LIST==============");
        System.out.println("1. 대기자 명단에 새로운 손님 추가하기");
        System.out.println("2. 다음 입장 예정 손님 입장시키기");
        System.out.println("3. 다음 입장 예정 손님 검색하기");
        System.out.println("4. 대기자 명단 출력하기");
        System.out.println("5. 종료");

        while(true){
            System.out.print("기능을 선택해주세요 >>> ");
            int command = scanner.nextInt();
            if(command == 1){
                scanner.nextLine();//개행문자 제거
                System.out.print("손님의 이름을 입력해주세요 >>> ");
                String name = scanner.nextLine();
                if (waitingList.size() == 5) {
                    System.out.println("남은 대기석이 없습니다.");
                    continue;
                }
                waitingList.offer(name);
            }
            else if (command == 2) {
                if(waitingList.isEmpty()){
                    System.out.println("대기자가 없습니다.");
                    continue;
                }
                String name = (String) waitingList.poll();
                System.out.println(name+"님 들어오세요.");
            }
            else if (command == 3) {
                String name = (String) waitingList.peek();
                if(name == null){
                    System.out.println("대기자가 없습니다.");
                    continue;
                }
                System.out.println("다음에 입장 예정이신 분은 " + name + "님 입니다.");
            }
            else if(command == 4){
                System.out.print("대기자 명단 : [");
                Iterator i = waitingList.iterator();
                while(i.hasNext()){
                    System.out.print(i.next());
                    if(i.hasNext())
                        System.out.print(", ");
                }
                System.out.println("]");
            }
            else if(command == 5){
                System.out.println("프로그램을 종료합니다...");
                break;
            }
            else{
                System.out.println("올바른 번호를 입력해주세요.");
            }
        }
    }
}