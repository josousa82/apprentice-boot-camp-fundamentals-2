package billing;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class BillingTest {

    @Test
    public void totalBillForDealer(){

        int numberAdverts = 20;
        int additionalProductsTotal = 20;

        Billing billing = new Billing(numberAdverts, additionalProductsTotal);
        assertThat(billing.totalBill(Prices.DEALER)).
                as("Should return the total amount to bill").isEqualTo(1200);
    }



}
