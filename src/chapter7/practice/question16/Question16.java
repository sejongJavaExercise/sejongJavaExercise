abstract class Car {
    abstract void call();
}

interface Movable {
    void move(int x, int y);
}

interface Stoppable {
    void stop();
}

class Taxi extends Car implements Movable, Stoppable {
    public void call() {
        System.out.println("택시가 호출되었습니다.");
    }

    public void move(int x, int y) {
        System.out.println("택시가 (" + x + ", " + y + ")으로 이동합니다.");
    }

    public void stop() {
        System.out.println("택시가 정지합니다.");
    }
}

class Truck extends Car implements Movable, Stoppable {
    public void call() {
        System.out.println("트럭이 호출되었습니다.");
    }

    public void move(int x, int y) {
        System.out.println("트럭이 (" + x + ", " + y + ")으로 이동합니다.");
    }

    public void stop() {
        System.out.println("트럭이 정지합니다.");
    }
}

class Bus extends Car implements Movable, Stoppable {
    public void call() {
        System.out.println("버스가 호출되었습니다.");
    }

    public void move(int x, int y) {
        System.out.println("버스가 (" + x + ", " + y + ")으로 이동합니다.");
    }

    public void stop() {
        System.out.println("버스가 정지합니다.");
    }
}

public class TaxiTruckBus {
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
