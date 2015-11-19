package com.zhangyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class YardTest {
    @Test
    public void shouldOneYardEqualToOneYard() throws Exception {
        assertEquals(new Yard(1), new Yard(1));
    }

    @Test
    public void shouldOneYardNotEqualToTwoYard() throws Exception {
        assertNotEquals(new Yard(1), new Yard(2));
    }

    @Test
    public void shouldOneMileEqulaTo1760Yard() throws Exception {
        assertEquals(new Mile(1), new Yard(1760));
    }

    @Test
    public void shouldOneMileNotEqulaTo1761Yard() throws Exception {
        assertNotEquals(new Mile(1), new Yard(1761));
    }
}
