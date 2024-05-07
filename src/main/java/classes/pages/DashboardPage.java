package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;
import utils.WaitTool;

public class DashboardPage extends BasePage {
    private static final By USERNAME_LABEL = By.xpath("//*[@id='user-profile']/ ..");
    private static final By LOGOUT_BUTTON = By.cssSelector(".fa.fa-sign-out");
    private static final By LOGOUT_MESSAGE = By.cssSelector(".panel-title");

    public DashboardPage() {
    }

    public static String getUsernameText() {
        WaitTool.waitForElementVisibility(USERNAME_LABEL, 10L);
        return driver.findElement(USERNAME_LABEL).getText();
    }

    public static void goToAdminPage() {
        driver.get("https://shop.pragmatic.bg/admin");
    }

    public static String getMessage() {
        WaitTool.waitForElementVisibility(LOGOUT_MESSAGE, 10);
        return driver.findElement(LOGOUT_MESSAGE).getText();
    }

    public static void logOut() {
        clickOnWebElementByLocator(LOGOUT_BUTTON);
        WaitTool.waitForElementVisibility(LOGOUT_MESSAGE, 10);
    }

}
