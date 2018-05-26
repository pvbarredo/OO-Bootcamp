package org.smarter;

public class Mile {
     public int amount;
    private Object mile;

    public Mile(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass().equals(Yard.class)) {
            return (this.amount * 1760) == ((Yard) obj).amount;
        }
        return obj != null && ((Mile) obj).amount == this.amount;
    }
}
