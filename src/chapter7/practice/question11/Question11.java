package chapter7.practice.question11;

public class Question11 {
    public static void main(String[] args) {
        Car[] cars = { new Taxi(), new Truck(), new Bus() };
        for (int i = 0; i < cars.length; i++) {
            cars[i].print();
        }
    }
}

abstract class Car{
    abstract void print();
}

class Taxi extends Car{
    void print() { System.out.println("I'm taxi."); }
}

class Truck extends Car{
    void print() { System.out.println("I'm truck."); }
}

class Bus extends Car{
    void print() { System.out.println("I'm bus."); }
}