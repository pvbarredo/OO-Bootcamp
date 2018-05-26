package org.smarter;

public class Yard {
    int amount;

    public Yard(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && ((Yard) obj).amount == this.amount;
    }
}
