package chapter14.practice.question12;

import java.util.*;

public class EvenCardsToHalf {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Shape.HEART, 7));
        cards.add(new Card(Shape.SPADE, 5));
        cards.add(new Card(Shape.DIAMOND, 8));
        cards.add(new Card(Shape.CLUB, 10));
        cards.add(new Card(Shape.SPADE, 2));

        cards.stream()
                .filter(card -> card.getNumber() % 2 == 0)
                .forEach(card -> card.setNumber(card.getNumber() / 2));

        cards.forEach(System.out::println);
    }
}

