package com.zhangyu;

import static com.zhangyu.Unit.unitRate;

public class Inch extends Length{
    final static int inchRate = unitRate;
    public Inch(int value) {
        super(value, inchRate);
    }
}
