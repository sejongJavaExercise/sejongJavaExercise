class Card {
    private String status;
    final int width = 64;
    final int height = 89;

    Card() {
        status = "front";
    }

    protected void flip() {
        if (status.equals("front")) {
            status = "back";
        } else {
            status = "front";
        }
    }

    public String getStatus() {
        return status;
    }
}

class TrumpCard extends Card {
    private int number;
    private String shape;

    TrumpCard(int number, String shape) {
        setNumber(number);
        setShape(shape);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number >= 1 && number <= 13) {
            this.number = number;
        } else {
            System.out.println("숫자를 변경하는 데 실패하였습니다.");
        }
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        if (shape.equals("Spade") || shape.equals("Diamond") ||
            shape.equals("Heart") || shape.equals("Club")) {
            this.shape = shape;
        } else {
            System.out.println("모양을 변경하는 데 실패하였습니다.");
        }
    }

    private String numberToValue(int number) {
        switch (number) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(number);
        }
    }

    public void print() {
        System.out.println(getStatus() + ", " + numberToValue(number) + " of " + shape + "s");
    }
}

public class TrumpCardGame {
    public static void main(String[] args) {
        TrumpCard trumpCard = new TrumpCard(2, "Spade");
        System.out.println("Card size : USA standard size – " + trumpCard.width + " * " + trumpCard.height);

        trumpCard.print();
        trumpCard.flip();
        trumpCard.setNumber(8);
        trumpCard.setShape("Heart");
        trumpCard.print();
        trumpCard.flip();
        trumpCard.setNumber(-1);
        trumpCard.setShape("Joker");
        trumpCard.print();
    }
}
