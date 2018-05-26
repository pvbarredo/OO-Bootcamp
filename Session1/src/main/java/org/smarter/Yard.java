package org.smarter;

public class Yard {
    int amount;

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
            return ((Feet)obj).amount == 3 ;
        }
        return ((Yard) obj).amount == this.amount;
    }
}
