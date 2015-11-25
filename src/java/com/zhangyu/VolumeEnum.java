package com.zhangyu;

public enum VolumeEnum {
    TSP(1),
    TBSP(3 * TSP.getRate()),
    OZ(2 * TBSP.getRate());

    private int rate;

    VolumeEnum(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}
