package com.zhangyu;

import static com.zhangyu.Yard.*;

public class Mile extends Length{
    private final static int mile = 1760 * yardRate;
    public Mile(int value) {
        super(value, mile);
    }

}
