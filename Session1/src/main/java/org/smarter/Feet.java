package org.smarter;

public class Feet {
    public int amount;

    public Feet(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if(obj.getClass().equals(Inch.class)){
            return (this.amount * 12) == ((Inch)obj).amount;
        }
        return true;
    }
}
