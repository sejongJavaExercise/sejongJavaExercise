class Car {}

class Taxi extends Car {
    void printTaxi() {
        System.out.println("I'm taxi.");
    }
}

class Truck extends Car {
    void printTruck() {
        System.out.println("I'm truck.");
    }
}

public class WhichCar {
    public static void main(String[] args) {
        Car car = new Car();
        Taxi taxi = new Taxi();
        Truck truck = new Truck();

        print(car);
        print(taxi);
        print(truck);
    }

    public static void print(Car car) {
        if (car instanceof Taxi) {
            ((Taxi) car).printTaxi();
        } else if (car instanceof Truck) {
            ((Truck) car).printTruck();
        } else {
            System.out.println("I'm something else.");
        }
    }
}
