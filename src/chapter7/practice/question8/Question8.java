public class GoldPrice {
    public static void main(String[] args) {
        Gold goldBar = new Gold(500000);

        System.out.println(goldBar.getPrice());

        goldBar.setPrice(200000);
        System.out.println(goldBar.getPrice());
    }
}

class Gold {
    private int price;

    Gold(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            return; // 음수라면 변경하지 않음
        }
        this.price = price;
    }
