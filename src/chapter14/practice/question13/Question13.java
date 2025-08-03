package chapter14.practice.question13;

import java.util.*;
import java.util.stream.Stream;

public class Question13 {
    public static void main(String[] args) {

        Map<Integer, User> userTable = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============유저관리 프로그램===============");
        System.out.println("1. 유저 추가");
        System.out.println("2. 모든 유저 열람");
        System.out.println("3. 유저 이름 변경");
        System.out.println("4. 유저 삭제");
        System.out.println("5. 종료");

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
                userTable.put(userId, new User(userId, userName));
                userId++;
                System.out.println("유저가 추가되었습니다.");
            }
            else if(command == 2){
                System.out.println("모든 유저의 아이디와 이름을 출력합니다 :");
                Collection<User> users = userTable.values();
                users.stream().forEach(user ->
                        System.out.println(user.getId() + " : " + user.getName()));
            }
            else if(command == 3){
                int changeId = 0;
                System.out.print("이름을 변경할 유저의 아이디를 입력해주세요 >>> ");
                changeId = scanner.nextInt();
                scanner.nextLine();
                if (!userTable.containsKey(changeId)) {
                    System.out.println("잘못된 아이디입니다.");
                }
                else{
                    System.out.print("새로운 이름을 입력해주세요 >>> ");
                    String newName = scanner.nextLine();
                    User user = userTable.get(changeId);
                    user.setName(newName);
                    System.out.println("이름이 변경되었습니다.");
                }
            }
            else if(command == 4){
                int deleteId = 0;
                System.out.print("삭제할 유저의 아이디를 입력해주세요 >>> ");
                deleteId = scanner.nextInt();
                scanner.nextLine();
                if (!userTable.containsKey(deleteId)) {
                    System.out.println("잘못된 아이디입니다.");
                }
                else{
                    userTable.remove(deleteId);
                    System.out.println("유저가 삭제되었습니다.");
                }
            }
            else if(command == 5){
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

    private int id;
    private String name;

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name;}
}
