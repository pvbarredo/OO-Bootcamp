package org.smarter;

public class Yard {
    public int amount;

    public Yard(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if (obj.getClass().equals(Inch.class)) {
            return (this.amount * 36) == ((Inch)obj).amount;
        }
        if (obj.getClass().equals(Feet.class)) {
            return (this.amount * 3) == ((Feet)obj).amount;
        }
        return ((Yard) obj).amount == this.amount;
    }
}
