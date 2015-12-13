package com.zhangyu;

import org.junit.Test;

import static com.zhangyu.Length.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void shouldThreeMileEqualToThreeMile() throws Exception {
        assertEquals(mile(3), mile(3));
    }

    @Test
    public void should13InchAdd11InchEqualTo2Feet() throws Exception {
        assertEquals(inch(13).add(inch(11)),feet(2));
    }

    @Test
    public void should3FeetAdd2YardEqualTo3Yard() throws Exception {
        assertEquals(feet(3).add(yard(2)), yard(3));
    }

    @Test
    public void should12InchOutput1Feet() throws Exception {
        assertThat(inch(12).output(), is("1 FEET"));
    }

    @Test
    public void should13InchOutput1Feet1Inch() throws Exception {
        assertThat(inch(13).output(), is("1 FEET 1 INCH"));
    }

    @Test
    public void should36InchOutput1Yard() throws Exception {
        assertThat(inch(36).output(), is("1 YARD"));
    }

    @Test
    public void should37InchOutput1Yard1Inch() throws Exception {
        assertThat(inch(37).output(), is("1 YARD 1 INCH"));
    }

    @Test
    public void shouldOutput1Mile1Inch() throws Exception {
        assertThat(inch(12*3*1760 + 1).output(), is("1 MILE 1 INCH"));
    }

    @Test
    public void shouldOutput1Mile1Yard() throws Exception {
        assertThat(inch(12*3*1760 + 12*3).output(), is("1 MILE 1 YARD"));
    }

    @Test
    public void shouldOutput1Mile1Yard1Inch() throws Exception {
        assertThat(inch(12*3*1760 + 12*3 + 1).output(), is("1 MILE 1 YARD 1 INCH"));
    }
}