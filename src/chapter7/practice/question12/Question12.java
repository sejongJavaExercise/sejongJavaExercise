public class ProductCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.buy(new TV());
        customer.buy(new Computer());
        customer.buy(new Audio());
        customer.summary();
    }
}

class Product {
    int price;
    int mileage;

    Product() {}

    Product(int price) {
        this.price = price;
        mileage = (int)(price / 10.0);
    }
}

class TV extends Product {
    TV() { super(100); }
    public String toString() { return "TV"; }
}

class Computer extends Product {
    Computer() { super(200); }
    public String toString() { return "Computer"; }
}

class Audio extends Product {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}

class Customer {
    private int money;
    private int mileage;
    private Product[] cart;
    private int cnt;

    Customer() {
        this.money = 1000;
        this.mileage = 0;
        this.cart = new Product[10];
        this.cnt = 0;
    }

    public void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        mileage += p.mileage;
        cart[cnt++] = p;
        System.out.println(p + "을(를) 구입하셨습니다.");
    }

    public void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < cnt; i++) {
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }

        if (cnt > 0) {
            itemList = itemList.substring(0, itemList.length() - 2);
        }

        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
