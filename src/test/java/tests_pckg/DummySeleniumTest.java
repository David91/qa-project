package tests_pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DummySeleniumTest {

    @Test
    public void testOpeningGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Davit_Zakharyan\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
        WebElement inputField = driver.findElement(By.cssSelector("input[name=q]"));
        inputField.sendKeys("selenium webdriver" + Keys.ENTER);
        Thread.sleep(2000);
        driver.quit();
    }
}