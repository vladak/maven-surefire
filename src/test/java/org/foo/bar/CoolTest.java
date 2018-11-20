package org.foo.bar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoolTest {
    @Test
    public void testFactor() {
        Cool c = new Cool();
        c.setFactor(1);
        assertEquals(1, c.getFactor());
    }
}