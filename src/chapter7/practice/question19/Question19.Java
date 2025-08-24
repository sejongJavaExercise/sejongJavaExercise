public class EventMake {
    public static void main(String[] args) {
        Event event = new Event() {
            public void alertEvent() {
                System.out.println("이벤트가 발생했습니다.");
            }
        };

        event.alertEvent();
    }
}

interface Event {
    void alertEvent();
}
