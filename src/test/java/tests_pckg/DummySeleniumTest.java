package tests_pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DummySeleniumTest {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        System.out.println("setuping driver path ...");
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
    }

    @BeforeMethod
    public void driverSetup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
    }

    @Test
    public void testOpeningGoogle() throws InterruptedException {
        WebElement inputField = driver.findElement(By.cssSelector("input[name=q]"));
        inputField.sendKeys("selenium webdriver" + Keys.ENTER);
        Thread.sleep(2000);
    }

    @Test
    public void testOpeningGoogle2() throws InterruptedException {
        WebElement inputField = driver.findElement(By.cssSelector("input[name=q]"));
        inputField.sendKeys("selenium webdriver" + Keys.ENTER);
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Quiting the driver...");
        driver.quit();
    }
}