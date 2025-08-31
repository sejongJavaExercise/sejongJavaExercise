package chapter11.practice.question4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Map userTable = new HashMap();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============유저관리 프로그램===============");
        System.out.println("1. 유저 추가");
        System.out.println("2. 모든 유저 열람");
        System.out.println("3. 종료");

        int userId = 1;

        while(true){
            int command = 0;
            System.out.print("어떤 기능을 실행하시겠습니까? >>> ");
            try{
                command = scanner.nextInt();
            } catch (Exception e){
                System.out.println("(오류 발생)");
            }
            scanner.nextLine();

            if(command == 1){
                System.out.print("이름을 입력해주세요. >>> ");
                String userName = scanner.nextLine();
                userTable.put(userId++, new User(userName));
                System.out.println("유저가 추가되었습니다.");
            }
            else if(command == 2){
                System.out.println("모든 유저의 이름을 출력합니다 :");
                Collection values = userTable.values();
                for(Object user : values){
                    System.out.println(((User)user).getName());
                }
            }
            else if(command == 3){
                System.out.println("프로그램을 종료합니다...");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}

class User{

    private String name;

    public User(String name){ this.name = name; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name;}
}
