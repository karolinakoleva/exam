package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Browser;

public class BasePage {
    protected static WebDriver driver = Browser.getDriver();

    public BasePage() {
    }

    public static void clickOnWebElementByLocator(By locator) {
        driver.findElement(locator).click();
    }

    public static void writeTextInWebElement(By locator, String text) {
        driver.findElement(locator).sendKeys(new CharSequence[]{text});
    }

    public void goPage(String url) {
        this.driver.get(url);
    }
}
