package com.zhangyu;

public class Unit extends Length {
    final static int unitRate = 1;
    public Unit(int value) {
        super(value, unitRate);
    }
}
