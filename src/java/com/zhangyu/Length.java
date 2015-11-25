package com.zhangyu;

import static com.zhangyu.LengthEnum.*;

public class Length {
    private final int value;

    private Length(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        return this.value == length.value ;
    }
    public Length add(Length another){
        return new Length(this.value + another.value);
    }

    public static Length feet(int value){
        return new Length(value * FEET.getRate());
    }

    public static Length inch(int value){
        return new Length(value * INCH.getRate());
    }

    public static Length mile(int value){
        return new Length(value * MILE.getRate());
    }

    public static Length yard(int value){
        return new Length(value * YARD.getRate());
    }

}
