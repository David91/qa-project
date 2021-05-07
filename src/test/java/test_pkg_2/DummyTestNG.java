package test_pkg_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DummyTestNG {

    @Test
    public void testSum() {
        long actual = sum(Integer.MAX_VALUE, 1);
        Assert.assertEquals(actual, 2147483648l);
    }

    @Test
    public void testSub() {
        int actualRes = sub(10,4);
        Assert.assertEquals(actualRes,6);
    }

    public int sub(int i, int j) {
        return i-j;
    }

    public long sum(int i, int j) {
        return (long)i + j;
    }
}
