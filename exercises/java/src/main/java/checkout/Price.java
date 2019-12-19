package checkout;

public enum Price {
    A(50),
    B(30),
    C(20),
    D(15);

    final int price;

    Price(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
