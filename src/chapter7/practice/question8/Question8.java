package chapter7.practice.question8;

public class Question8 {
    public static void main(String[] args) {
        Car car = new Car();
        Taxi taxi = new Taxi();
        Truck truck = new Truck();

        print(car);
        print(taxi);
        print(truck);
    }

    public static void print(Car car){
        if(car instanceof Taxi){
            Taxi tmp = (Taxi) car;
            tmp.printTaxi();
        }
        else if(car instanceof Truck){
            Truck tmp = (Truck) car;
            tmp.printTruck();
        }
        else{
            System.out.println("I'm something else.");
        }
    }
}

class Car{}
class Taxi extends Car {
    public void printTaxi(){
        System.out.println("I'm taxi.");
    }
}
class Truck extends Car {
    public void printTruck(){
        System.out.println("I'm truck.");
    }
}

