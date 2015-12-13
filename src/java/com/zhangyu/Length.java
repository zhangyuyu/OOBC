package com.zhangyu;

import static com.zhangyu.LengthEnum.*;

public class Length {
    private final int value;
    private int rate;

    public Length(int value, int rate) {
        this.value = value * rate;
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        return this.value == length.value ;
    }
    public Length add(Length another){
        return new Length(this.value + another.value,1);
    }

    public static Length feet(int value){
        return new Length(value, FEET.getRate());
    }

    public static Length inch(int value){
        return new Length(value, INCH.getRate());
    }

    public static Length mile(int value){
        return new Length(value , MILE.getRate());
    }

    public static Length yard(int value){
        return new Length(value, YARD.getRate());
    }

    public String output() {
        String out = "";
        int value = this.value;
        int rate = this.rate;
        for(LengthEnum key : getLengthEnumValues()){
            int rateTrans = key.getRate()/rate;
           if(rateTrans >0 && value/rateTrans >0){
               int remain = value%key.getRate();
               out += value/rateTrans + " "+ key.toString() + " ";
               value = remain;
           }
        }
        return out.trim();
    }
}
