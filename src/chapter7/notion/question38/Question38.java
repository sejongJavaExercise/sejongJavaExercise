package chapter7.notion.question38;

public class Question38 { // 문제 오류로 폐기
    public static void main(String[] args) {
        Car car = new Car();
        Taxi taxi = new Taxi();
        CallTaxi callTaxi = new CallTaxi();
        Truck truck = new Truck();
        Bike bike = new Bike();
        Object object = new Object();

        car = (Car) taxi;
        car = taxi;
        //car.print();
        taxi = (Taxi) car;
        //taxi = car;

        car = (Car) callTaxi;
        car = callTaxi;
        callTaxi = (CallTaxi) car;
        //callTaxi = car;

        //truck = (Truck) taxi;

        //bike = (Bike) car;
        object = (Object) car;
        //bike = (Bike)(Object) car; //런타임 에러 발생
    }
}

class Car{}
class Taxi extends Car{
    void print(){
        System.out.println("I'm taxi.");
    }
}
class CallTaxi extends Taxi{ }
class Truck extends Car{}
class Bike{}
