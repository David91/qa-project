package seleniumWaits;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ImplicitWait {

    private WebDriver driver;
    private static final int TimeOut = 15;

    @Test
    public void testImplicit() throws InterruptedException, IOException {
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

        By photoCard = By.xpath("//span[text()='Fotokaarten']");
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(photoCard));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,1000)");
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
        TakesScreenshot scrShot =((TakesScreenshot)driver);

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile=new File("C:\\Users\\Davit_Zakharyan\\test.jpg");

        FileUtils.copyFile(SrcFile, DestFile);
        driver.quit();
    }
}
