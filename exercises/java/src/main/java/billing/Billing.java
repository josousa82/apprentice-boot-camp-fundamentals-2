package billing;

public class Billing {

    final int priceAdvertDealer = 50;
    final int priceAdvertPrivate = 20;
    final int priceAdditionalProduct = 10;


    int numberOfAdverts;
    int numberOfAdditionalProducts;


    public Billing(int numberOfAdverts, int numberOfAdditionalProducts) {
        this.numberOfAdverts = numberOfAdverts;
        this.numberOfAdditionalProducts = numberOfAdditionalProducts;
    }

    public int totalBill(Prices typeCustomer) {
        return numberOfAdditionalProducts * Prices.ADDITIONAL.getPrice() + numberOfAdverts * typeCustomer.getPrice();
    }

    public static void main(String[] args) {
        System.out.println("CustomerType.DEALER.getPrice() = " + (Prices.DEALER.getPrice() + 20));
        System.out.println("CustomerType.DEALER.getPrice() = " + Prices.DEALER.name());

        Billing billing = new Billing(20, 20);

        System.out.println("billing = " + billing.totalBill(Prices.DEALER));
    }

}

