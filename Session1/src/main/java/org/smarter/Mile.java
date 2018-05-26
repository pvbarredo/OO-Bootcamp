package org.smarter;

public class Mile {
     public int amount;

    public Mile(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj.getClass().equals(Feet.class)){
            return (this.amount * 5280) == ((Feet) obj).amount ;
        }
        if(obj.getClass().equals(Inch.class)){
            return (this.amount * 63360) == ((Inch) obj).amount ;
        }
        if(obj.getClass().equals(Yard.class)) {
            return (this.amount * 1760) == ((Yard) obj).amount;
        }
        return ((Mile) obj).amount == this.amount;
    }
}
