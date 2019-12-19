package billing;

public enum Prices {
    DEALER(50),
    PRIVATE(20 ),
    ADDITIONAL(10);

    private int price;


    Prices(int i) {
        this.price = i;
    }


    int getPrice(){
        return price;
    }

}
