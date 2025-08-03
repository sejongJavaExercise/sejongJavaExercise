package chapter14.practice.question11;

import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        int sum = 0;

        cards.add(new Card(Shape.HEART, 7));
        cards.add(new Card(Shape.SPADE, 5));
        cards.add(new Card(Shape.DIAMOND, 8));
        cards.add(new Card(Shape.CLUB, 10));
        cards.add(new Card(Shape.SPADE, 2));

        for (Card card : cards) {
            if(card.getShape()==Shape.SPADE){
                sum += card.getNumber();
            }
        }

        System.out.println(sum);
    }
}

enum Shape{
    HEART, SPADE, DIAMOND, CLUB
}

class Card {
    private Shape shape;
    private int number;

    public Card(Shape shape, int number) {
        this.shape = shape;
        this.number = number;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return getShape().toString() + "-" + getNumber();
    }
}