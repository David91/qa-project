package beforeAfter;

import org.testng.annotations.*;

public class BeforeAfter {

    @BeforeClass
    public void beforeClassRun() {
        System.out.println("BeforeAfter.beforeClassRun");
    }

    @BeforeMethod
    public void beforeEachTestMethod() {
        System.out.println("BeforeAfter.beforeEachTestMethod");
    }

    @Test
    public void test1() {
        System.out.println("BeforeAfter.test1");
    }

    @Test
    public void test2() {
        System.out.println("BeforeAfter.test2");
    }

    @AfterMethod
    public void afterEachTestMethod() {
        System.out.println("BeforeAfter.afterEachTestMethod");
    }

    @AfterClass
    public void afterClassRun() {
        System.out.println("BeforeAfter.afterClassRun");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("BeforeAfter.afterSuite");
    }
}
