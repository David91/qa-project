package test_pkg_2;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondDummyTestNG {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void before() {
        System.out.println("BEFORE");
    }

    @Test
    public void testAssertTrue() {
        int i = 5;
        int j = 6;
        Assert.assertTrue(checkEquality(i, j));
    }

    @Test(dependsOnMethods = "testAssertTrue")
    public void testAssertFalse() {
        int i = 5;
        int j = 6;
        Assert.assertFalse(checkEquality(i, j), "ERROR: i=" + i + " equals j=" + j);
    }

    public boolean checkEquality(int i, int j) {
        return i == j;
    }
}
