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

    public int totalBillDealer(CustomerType typeCustomer) {

        if(typeCustomer.equals(CustomerType.DEALER.toString())){


            int totalBill = numberOfAdditionalProducts * 10 + typeCustomer.getPrice() * numberOfAdverts;
            return totalBill;
        }

        return 0;
    }

}

enum CustomerType{
    DEALER(50),
    PRIVATE(20 );

    private int price;


    CustomerType(int i) {
        this.price = i;
    }

    int getPrice(){
        return this.price;
    }
}