package com.zhangyu;

import static com.zhangyu.Feet.feetRate;

public class Yard extends Length {
    final static int yardRate = 3 * feetRate;
    public Yard(int value) {
        super(value, yardRate);
    }

}
