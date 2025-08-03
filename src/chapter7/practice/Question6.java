package chapter7.practice;

public class Question6 {
    public static void main(String[] args) {
        Gold goldBar = new Gold(500000);
        goldBar.price = -1;
        System.out.println("Price of gold bar = "+goldBar.price);
        goldBar.price = 200000;
        System.out.println("Price of gold bar = "+goldBar.price);
    }
}

class Gold{
    int price;
    Gold(int price){ this.price = price; }
}
