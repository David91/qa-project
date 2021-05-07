package test_pkg_2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class StringFormat {

    @Test
    public void testStringFormat() {
        String str = "//a[@class='%s']";
        System.out.println(str);
        str = String.format(str,"aaaaaaa");
        By.xpath(String.format(str,"asasasa"));
        System.out.println(str);
    }
}
