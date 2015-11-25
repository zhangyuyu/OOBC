package com.zhangyu;

import static com.zhangyu.VolumeEnum.*;

public class Volume {
    private int value;

    public Volume(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Volume volume = (Volume) o;
        return this.value == volume.value;

    }

    @Override
    public int hashCode() {
        return value;
    }

    public static Volume oz(int value){
        return new Volume(value * OZ.getRate());
    }

    public static Volume tbsp(int value){
        return new Volume(value * TBSP.getRate());
    }

    public static Volume tsp(int value){
        return new Volume(value * TSP.getRate());
    }


    public Volume add(Volume another) {
        return new Volume(this.value + another.value);
    }
}
