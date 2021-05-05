package seleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWait {

    private WebDriver driver;
    private static final int TimeOut = 15;

    @Test
    public void testImplicit() {
        System.setProperty("webdriver.chrome.driver",
                "src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("https://www.greetz.nl/kaarten/verjaardag");
        By acceptCookiesElemLoc = By.cssSelector(".b-buttonbar--button.b-button.cookieBar-old-style__button");

        WebElement acceptCookieElem = wait.until(ExpectedConditions.elementToBeClickable(acceptCookiesElemLoc));
        acceptCookieElem.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(acceptCookiesElemLoc));

        By allProdsLoc = By.className("b-products-grid__item-preview");

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(allProdsLoc,90));
        driver.quit();
    }
}
