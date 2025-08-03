package tmp;

public class Ex13_14 {
    public static void main(String[] args) {
    }
}

class Person {
    String name;
    int age;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() { return name; }

    void setName(String name) { this.name = name; }

    int getAge() { return age; }

    void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("잘못된 값이 입력되었습니다.");
        }
    }
}
