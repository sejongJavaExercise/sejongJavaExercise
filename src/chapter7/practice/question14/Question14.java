public class DogCat {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("멍멍");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("야옹");
    }
}
