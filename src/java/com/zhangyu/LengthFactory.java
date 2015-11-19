package com.zhangyu;

import static com.zhangyu.LengthEnum.FEET;

public class LengthFactory {
    public Feet feet(int value){
        return new Feet(value * FEET.getRate());
    }
}
