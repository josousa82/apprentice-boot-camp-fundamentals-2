package checkout;

class Checkout {
    private int total;
    private int numberOfA = 0;
    private int numberOfB = 0;
    private int price;
    private Receipt receipt = new Receipt();


    void scan(String sku) {
        if ("A".equals(sku)) {

            total += 50;
            discountForThreeA();
            receipt.scannedA();

        } else if ("B".equals(sku)) {

            total += 30;
            discountForEvery2();
            receipt.scannedB();

        } else if ("C".equals(sku)) {
            total += 20;
            receipt.scannedC();

        } else if ("D".equals(sku)) {
            total += 15;
            receipt.scannedD();
        }
    }

    private void discountForEvery2() {
        if (++numberOfB % 2 == 0) {
            total -= 15;
        }
    }

    private void discountForThreeA() {
        if (++numberOfA % 3 == 0) {
             total -= 20;
       }
    }


    int total() {
        return total;
    }

    String receipt() {
        return receipt.text();
    }
}
