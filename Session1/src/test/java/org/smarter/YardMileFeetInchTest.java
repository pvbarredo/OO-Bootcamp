package org.smarter;

import org.junit.Assert;
import org.junit.Test;

public class YardMileFeetInchTest {
    @Test
    public void yard_1_equals_to_3_feet_test() {
        Yard yard = new Yard(1);
        Feet feet = new Feet(3);
        Assert.assertTrue(yard.equals(feet));
    }

    @Test
    public void feet_1_equals_to_12_inch_test() {
        Feet feet = new Feet(1);
        Inch inch = new Inch(12);
        Assert.assertTrue(feet.equals(inch));
    }

    @Test
    public void mile_1_equals_to_5280_feet_test() {
        Mile mile = new Mile(1);
        Feet feet = new Feet(5280);
        Assert.assertTrue(mile.equals(feet));
    }

    @Test
    public void mile_1_equals_to_63360_inch_test() {
        Mile mile = new Mile(1);
        Inch inch = new Inch(63360);
        Assert.assertTrue(mile.equals(inch));
    }

    @Test
    public void feet_5280_equals_to_63360_inch_test() {
        Feet feet = new Feet(5280);
        Inch inch = new Inch(63360);
        Assert.assertTrue(feet.equals(inch));
    }

    @Test
    public void yard_1_equals_36_inch_test() {
        Yard yard = new Yard(1);
        Inch inch = new Inch(36);
        Assert.assertTrue(yard.equals(inch));
    }

    @Test
    public void feet_1_not_equal_to_null() {
        Feet feet = new Feet(1);
        Assert.assertFalse(feet.equals(null));
    }

    @Test
    public void inch_1_not_equal_to_null() {
        Inch inch = new Inch(1);
        Assert.assertFalse(inch.equals(null));
    }

    @Test
    public void yard_2_equals_to_6_feet() {
        Yard yard = new Yard(2);
        Feet feet = new Feet(6);
        Assert.assertTrue(yard.equals(feet));
    }

}
