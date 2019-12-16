package billing;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class BillingTest {

    int numberOfAdverts = 20 ;
    int numberOrAdditionalProducts = 1;


    @Test
    public void totalBillForDealer(){

        int numberAdverts = 20;
        int additionalProductsTotal = 20;
        Billing billing = new Billing(numberOfAdverts, additionalProductsTotal);

        assertThat(billing.totalBillDealer(CustomerType.DEALER)).
                as("Should return the total amount to bill").isEqualTo(1200);
    }



}
