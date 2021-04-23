package tests_pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SixpmResultTest {

    @Test
    public void testSearchResult() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Davit_Zakharyan\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.6pm.com/t-shirt");
        Thread.sleep(5000);
        List<WebElement> productsPricesElems = driver.findElements(By.cssSelector("#searchPage article span[itemprop=price]"));
        for (WebElement elem: productsPricesElems) {
            String price = elem.getText();
            System.out.println(price);
        }
        Assert.assertEquals(productsPricesElems.size(),100,
                "Products count should be 98, but teh actual count is " + productsPricesElems.size());
        driver.quit();
    }
}
