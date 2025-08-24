public class EventStorageMake {
    public static void main(String[] args) {
        EventStorage eventStorage = new EventStorage("철수", true, new Event() {
            public void alertEvent() {
                System.out.println("화재가 발생했습니다.");
            }
        });

        eventStorage.printEvent();
    }
}

interface Event {
    void alertEvent();
}

class EventStorage {
    String eventMaker;    
    boolean emergency;       
    Event event;          

    EventStorage(String eventMaker, boolean emergency, Event event) {
        this.eventMaker = eventMaker;
        this.emergency = emergency;
        this.event = event;
    }

    void printEvent() {
        event.alertEvent();
        System.out.println("이벤트메이커는 " + eventMaker + "입니다.");
        System.out.printf(emergency ? "긴급상황입니다!!!\n" : "");
    }
}
