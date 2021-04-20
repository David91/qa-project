package tests_pckg;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SecondDummyTestNG {

    @Test(enabled = false)
    public void testAssertTrue() {
        int i = 5;
        int j = 6;
        Assert.assertTrue(checkEquality(i,j));
    }

    @Test
    public void testAssertFalse() {
        int i = 5;
        int j = 6;
        Assert.assertFalse(checkEquality(i,j), "ERROR: i=" + i + " equals j=" + j);
    }

    public boolean checkEquality(int i, int j) {
        return i==j;
    }
}
