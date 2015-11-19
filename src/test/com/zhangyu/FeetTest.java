package com.zhangyu;

import org.junit.Test;

import static com.zhangyu.Length.feet;
import static com.zhangyu.Length.yard;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class FeetTest {
    @Test
    public void shouldOneFeetEqualToOneFeet() throws Exception {
        assertEquals(feet(1), feet(1));
    }

    @Test
    public void shouldOneFeetNotEqualToTwoFeet() throws Exception {
        assertNotEquals(feet(1), feet(2));
    }

    @Test
    public void shouldOneYardEqualToThreeFeet() throws Exception {
        assertEquals(yard(1), feet(3));
    }


}