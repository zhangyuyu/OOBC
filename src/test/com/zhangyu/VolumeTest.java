package com.zhangyu;

import org.junit.Test;

import static com.zhangyu.Volume.oz;
import static com.zhangyu.Volume.tbsp;
import static com.zhangyu.Volume.tsp;
import static org.junit.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void should1OZEqualTo2TBSP() throws Exception {
        assertEquals(oz(1),tbsp(2));
    }

    @Test
    public void should1TBSPEqualTo3TSP() throws Exception {
        assertEquals(tbsp(1),tsp(3));
    }

    @Test
    public void should1OZAdd1OZEqualTo2OZ() throws Exception {
        assertEquals(oz(1).add(oz(1)), oz(2));
    }

    @Test
    public void should1OZAdd2TBSPEqualTo2OZ() throws Exception {
        assertEquals(oz(1).add(tbsp(2)), oz(2));
    }

    @Test
    public void should1TBSPAdd3TSPEqualTo2TBSP() throws Exception {
        assertEquals(tbsp(1).add(tsp(3)), tbsp(2));

    }
}