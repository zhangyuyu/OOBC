package com.zhangyu;

import java.util.Collections;

import static java.util.Arrays.sort;

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

    public static LengthEnum[] getLengthEnumValues() {
        LengthEnum[] values = LengthEnum.values();
        sort(values, Collections.<LengthEnum>reverseOrder());
        return values;
    }
}
