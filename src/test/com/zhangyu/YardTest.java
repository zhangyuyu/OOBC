package com.zhangyu;

import org.junit.Test;

import static com.zhangyu.Length.mile;
import static com.zhangyu.Length.yard;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class YardTest {
    @Test
    public void shouldOneYardEqualToOneYard() throws Exception {
        assertEquals(yard(1), yard(1));
    }

    @Test
    public void shouldOneYardNotEqualToTwoYard() throws Exception {
        assertNotEquals(yard(1), yard(2));
    }

    @Test
    public void shouldOneMileEqulaTo1760Yard() throws Exception {
        assertEquals(mile(1), yard(1760));
    }

    @Test
    public void shouldOneMileNotEqulaTo1761Yard() throws Exception {
        assertNotEquals(mile(1), yard(1761));
    }
}
