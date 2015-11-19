package com.zhangyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FeetTest {
    @Test
    public void shouldOneFeetEqualToOneFeet() throws Exception {
        assertEquals(new Feet(1), new Feet(1));
    }

    @Test
    public void shouldOneFeetNotEqualToTwoFeet() throws Exception {
        assertNotEquals(new Feet(1), new Feet(2));
    }

    @Test
    public void shouldOneYardEqualToThreeFeet() throws Exception {
        assertEquals(new Yard(1),  new Feet(3));
    }


}