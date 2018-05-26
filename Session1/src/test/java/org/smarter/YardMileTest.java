package org.smarter;

import org.junit.Assert;
import org.junit.Test;

public class YardMileTest {
    @Test
    public void one_miles_equals_to_1760_yards_test() {
        Mile oneMile = new Mile(1);
        Yard yard = new Yard(1760);

        Assert.assertTrue(oneMile.equals(yard));
    }

    @Test
    public void three_yards_not_equal_to_2_yard_test() {
        Yard threeYards = new Yard(3);
        Yard twoYards = new Yard(2);

        Assert.assertFalse(threeYards.equals(twoYards));
    }

    @Test
    public void one_mile_not_equals_to_1761_yard_test() {
        Mile oneMile = new Mile(1);
        Yard yard = new Yard(1761);

        Assert.assertFalse(oneMile.equals(yard));
    }

    @Test
    public void three_yard_not_equal_to_4_yard_test() {
        Yard threeYard = new Yard(3);
        Yard fourYard = new Yard(4);

        Assert.assertFalse(threeYard.equals(fourYard));
    }

    @Test
    public void three_yards_not_equal_to_null_test() {
        Yard threeYard = new Yard(3);
        Assert.assertFalse(threeYard.equals(null));
    }

    @Test
    public void two_miles_equals_to_3520_yards_test() {
        Mile twoMiles = new Mile(2);
        Yard yard = new Yard(3520);

        Assert.assertTrue(twoMiles.equals(yard));

    }
}
