package chapter14.practice.question11;

import java.util.*;

public class SpadeNumbers {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Shape.HEART, 7));
        cards.add(new Card(Shape.SPADE, 5));
        cards.add(new Card(Shape.DIAMOND, 8));
        cards.add(new Card(Shape.CLUB, 10));
        cards.add(new Card(Shape.SPADE, 2));

        int sum = cards.stream()
                .filter(card -> card.getShape() == Shape.SPADE)
                .mapToInt(Card::getNumber)
                .sum();
        System.out.println(sum);
    }
}
