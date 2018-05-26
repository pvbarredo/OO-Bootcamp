package org.smarter;

public class Feet {

    public double amount;

    public Feet(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if(obj.getClass().equals(Inch.class)){
            return ((Inch) obj).amount == this.amount * 12;
        }
        if(obj.getClass().equals(Yard.class)){
            return ((Yard) obj).amount == this.amount / 3;
        }
        if(obj.getClass().equals(Mile.class)){
            return ((Mile) obj).amount == this.amount * 0.000189394;
        }
        return false;
    }
}
