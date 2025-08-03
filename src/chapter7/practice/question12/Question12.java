package chapter7.practice.question12;

public class Question12 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Truck truck = new Truck();
        Bus bus = new Bus();

        taxi.call();
        taxi.move(100, 200);
        taxi.stop();

        truck.call();
        truck.move(200, 100);
        truck.stop();

        bus.call();
        bus.move(300, 300);
        bus.stop();
    }
}

abstract class Car{
    //차를 호출하는 메서드
    abstract void call();
}

interface Movable{
    //(x, y)의 좌표로 이동하는 메서드
    void move(int x, int y);
}

interface Stoppable{
    //움직임을 멈추고 현재 자리에 정지하는 메서드
    void stop();
}

class Taxi extends Car implements Movable, Stoppable {
    void call() { System.out.println("택시가 호출되었습니다."); }
    public void move(int x, int y) { System.out.printf("택시가 (%d, %d)로 이동합니다.\n", x, y);}
    public void stop() { System.out.println("택시가 정지합니다."); }
}

class Truck extends Car implements Movable, Stoppable {
    void call() { System.out.println("트럭이 호출되었습니다."); }
    public void move(int x, int y) { System.out.printf("트럭이 (%d, %d)로 이동합니다.\n", x, y); }
    public void stop() { System.out.println("트럭이 정지합니다."); }
}

class Bus extends Car implements Movable, Stoppable {
    void call() { System.out.println("버스가 호출되었습니다."); }
    public void move(int x, int y) { System.out.printf("버스가 (%d, %d)로 이동합니다.\n", x, y); }
    public void stop() { System.out.println("버스가 정지합니다."); }
}
