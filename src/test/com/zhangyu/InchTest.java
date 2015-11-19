package com.zhangyu;

import org.junit.Test;

import static com.zhangyu.Length.feet;
import static com.zhangyu.Length.inch;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class InchTest {
    @Test
    public void shouldOneInchEqualToOneInch() throws Exception {
        assertEquals(inch(1), inch(1));
    }

    @Test
    public void shouldOneInchNotEqualToTwoInch() throws Exception {
        assertNotEquals(inch(1), inch(2));
    }

    @Test
    public void shouldOneFeetEqualTo12Inch() throws Exception {
        assertEquals(feet(1), inch(12));
    }
}