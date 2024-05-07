
package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(
            id = "input-username"
    )
    private WebElement usernameInputField;
    @FindBy(
            id = "input-password"
    )
    private WebElement passwordInputField;
    @FindBy(
            className = "btn-primary"
    )
    private WebElement loginButton;
    private static final String URL = "https://shop.pragmatic.bg/admin";

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToLoginPage() {
        this.goPage("https://shop.pragmatic.bg/admin");
    }

    public void writeIntoUsernameInputField(String username) {
        this.typeInWebElement(this.usernameInputField, username);
    }

    public void writeIntoPasswordInputField(String password) {
        this.typeInWebElement(this.passwordInputField, password);
    }

    public void clickLoginButton() {
        this.clickOnWebElement(this.loginButton);
    }

    public void login(String username, String password) {
        this.writeIntoUsernameInputField(username);
        this.writeIntoPasswordInputField(password);
        this.clickLoginButton();
    }
}
