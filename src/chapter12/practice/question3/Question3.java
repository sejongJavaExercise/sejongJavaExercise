package chapter12.practice.question3;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        fruitBox.add(new Strawberry());
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        System.out.println(TangHooRooMaker.makeTangHooRoo(fruitBox));
        System.out.println(TangHooRooMaker.makeTangHooRoo(grapeBox));
    }
}

class Fruit{ public String toString(){ return "과일"; } }
class Apple extends Fruit{ public String toString(){ return "사과"; } }
class Grape extends Fruit{ public String toString() { return "포도"; } }
class Strawberry extends Fruit{ public String toString() { return "딸기"; } }

class Box<T>{
    ArrayList<T> arrayList = new ArrayList<T>();
    void add(T item){ arrayList.add(item); }
    T get(int i){ return arrayList.get(i); }
    ArrayList<T> getList(){ return arrayList; }
}

class FruitBox<T extends Fruit> extends Box<T>{}

class TangHooRoo{
    String name;
    TangHooRoo(String name){ this.name = name + "탕후루"; }
    public String toString(){ return name; }
}

class TangHooRooMaker{
    static TangHooRoo makeTangHooRoo(FruitBox<? extends Fruit> fruitBox){
        String fruits = "";
        for (Fruit fruit : fruitBox.getList()) {
            fruits += fruit + " ";
        }
        return new TangHooRoo(fruits);
    }
}