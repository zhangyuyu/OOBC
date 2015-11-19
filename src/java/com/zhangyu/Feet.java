package com.zhangyu;

import static com.zhangyu.Inch.*;

public class Feet extends Length{
    final static int feetRate = 12 * inchRate;
    public Feet(int value) {
        super(value, feetRate);
    }

}
