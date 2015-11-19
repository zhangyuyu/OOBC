package com.zhangyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class InchTest {
    @Test
    public void shouldOneInchEqualToOneInch() throws Exception {
        assertEquals(new Inch(1), new Inch(1));
    }

    @Test
    public void shouldOneInchNotEqualToTwoInch() throws Exception {
        assertNotEquals(new Inch(1), new Inch(2));
    }

    @Test
    public void shouldOneFeetEqualTo12Inch() throws Exception {
        assertEquals(new Feet(1), new Inch(12));
    }
}