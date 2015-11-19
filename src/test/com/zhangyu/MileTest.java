package com.zhangyu;

import org.junit.Test;

import static com.zhangyu.Length.mile;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MileTest {
    @Test
    public void shouldThreeMileEqualToThreeMile() throws Exception {
        assertEquals(mile(3), mile(3));
    }

    @Test
    public void should_not_equal_to_string() {
        assertNotEquals(mile(1), "1 mile");
    }

    @Test
    public void shouldThreeMileNotEqualToTwoMile() throws Exception {
        assertNotEquals(mile(3), mile(2));
    }

    @Test
    public void shouldThreeMileNotEqualToFourMile() throws Exception {
        assertNotEquals(mile(3), mile(4));
    }
}