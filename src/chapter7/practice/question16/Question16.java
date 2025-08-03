package chapter7.practice.question16;

public class Question16 {
    public static void main(String[] args) {
        Event event = new Event() {
            public void alertEvent() {
                System.out.println("이벤트가 발생했습니다.");
            }
        };
        event.alertEvent();
    }
}

interface Event{
    //이벤트 내용을 println() 메서드로 출력
    void alertEvent();
}