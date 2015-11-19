package com.zhangyu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MileTest {
    @Test
    public void shouldThreeMileEqualToThreeMile() throws Exception {
        assertEquals(new Mile(3), new Mile(3));
    }

    @Test
    public void should_not_equal_to_string() {
        assertNotEquals(new Mile(1), "1 mile");
    }

    @Test
    public void shouldThreeMileNotEqualToTwoMile() throws Exception {
        assertNotEquals(new Mile(3), new Mile(2));
    }

    @Test
    public void shouldThreeMileNotEqualToFourMile() throws Exception {
        assertNotEquals(new Mile(3), new Mile(4));
    }
}