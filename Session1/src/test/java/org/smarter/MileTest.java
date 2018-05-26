package org.smarter;

import org.junit.Assert;
import org.junit.Test;

public class MileTest {
    @Test
    public void three_miles_equals_three_miles_test() {
        Mile threeMile = new Mile(3);
        Mile secondMile = new Mile(3);

        Assert.assertTrue(threeMile.equals(secondMile));
    }

    @Test
    public void three_miles_not_equal_to_four_miles_test() {
        Mile threeMile = new Mile(3);
        Mile fourMile = new Mile(4);

        Assert.assertFalse(threeMile.equals(fourMile));
    }

    @Test
    public void three_miles_not_equal_to_two_miles_test() {
        Mile threeMiles = new Mile(3);
        Mile twoMiles = new Mile(2);

        Assert.assertFalse(threeMiles.equals(twoMiles));
    }

    @Test
    public void three_miles_not_equal_to_null_test() {
          Mile threeMiles = new Mile(3);
        Assert.assertFalse(threeMiles.equals(null));
    }




}
