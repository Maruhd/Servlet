import org.junit.Test;

import static devide.Divide.add;
import static org.junit.Assert.*;

public class TestDivide {
    @Test

    public void test1Add() throws Exception{
        assertTrue(add(9,3) == 3);
        assertTrue(add(555,5) == 111);
    }
    @Test

    public void test2Add() throws Exception{
        try {
            assertTrue(add(2,0)==0);
            fail();
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
        try {
            assertTrue(add(0,0)==0);
            fail();
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
    }
}
