package test_pkg_2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("GroupTest.beforeMethod");
//        Assert.fail();
    }

//    @BeforeMethod()
//    public void beforeMethod_for_group_A() {
//        System.out.println("GroupTest.beforeMethod_for_group_A");
//    }

    @Test()
    public void group_A_test1() {
        System.out.println("GroupTest.group_A_test1");
    }

    @Test
    public void simpleTest() {
        System.out.println("GroupTest.simpleTest");
    }

    @Test
    public void test_3rd() {
        System.out.println("GroupTest.test_3rd");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("GroupTest.afterMethod");
    }
}
