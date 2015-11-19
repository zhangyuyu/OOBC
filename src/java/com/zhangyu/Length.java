package com.zhangyu;

abstract class Length {
    protected int value;
    protected int rate;

    public Length(int value, int rate) {
        this.value = value;
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Length)) return false;

        Length length = (Length) o;

        return this.value * this.rate == length.value * length.rate;
    }

}
