package com.zhangyu;

import org.junit.Test;

import static com.zhangyu.Length.*;
import static org.junit.Assert.assertEquals;

public class LengthTest {
    @Test
    public void should13InchAdd11InchEqualTo2Feet() throws Exception {
        assertEquals(inch(13).add(inch(11)),feet(2));
    }

    @Test
    public void should3FeetAdd2YardEqualTo3Yard() throws Exception {
        assertEquals(feet(3).add(yard(2)),yard(3));
    }
}