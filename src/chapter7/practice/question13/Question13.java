abstract class Car {
    abstract void print();
}

class Taxi extends Car {
    void print() {
        System.out.println("I'm taxi.");
    }
}

class Truck extends Car {
    void print() {
        System.out.println("I'm truck.");
    }
}

class Bus extends Car {
    void print() {
        System.out.println("I'm bus.");
    }
}

public class TaxiTruckBus {
    public static void main(String[] args) {
        Car[] cars = { new Taxi(), new Truck(), new Bus() };

        for (Car c : cars) {
            c.print();
        }
    }
}
