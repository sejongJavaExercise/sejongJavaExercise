package chapter12.notion.question5;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        People<Person> people = new People<>();
        People<Adult> adults = new People<>();
        people.add(new Adult());
        people.add(new Child());
        //people.add(new Pet());
        adults.add(new Adult());
        //adults.add(new Child());
    }
}

interface Person{}
class Adult implements Person{}
class Child implements Person{}
interface Animal{}
class Pet implements Animal{}

class People<T extends Person> {
    List<T> list = new ArrayList<T>();
    void add(T person){ list.add(person); }
}
