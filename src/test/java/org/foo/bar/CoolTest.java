package org.foo.bar;

class CoolTest {
    @Test
    public void testFactor() {
        Cool c = new Cool();
        c.setFactor(1);
        assertEquals(1, getFactor());
    }
}