package chapter7.notion.question39;

public class Question39 {
    public static void main(String[] args) {
        Car car = new Car();
        Taxi taxi = new Taxi();
        CallTaxi callTaxi = new CallTaxi();

        System.out.println(car instanceof Taxi);
        System.out.println(taxi instanceof Car);
        System.out.println(callTaxi instanceof Car);

        //car = (Taxi) car;

        car = taxi;
        System.out.println(car instanceof Taxi);
    }
}

class Car{}
class Taxi extends Car{}
class CallTaxi extends Taxi{}