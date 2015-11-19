package com.zhangyu;

public enum LengthEnum {
    UNIT(1),
    INCH(UNIT.rate),
    FEET(12*INCH.rate),
    YARD(3*FEET.rate),
    MILE(1760*YARD.rate);

    private int rate;
    LengthEnum(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}
