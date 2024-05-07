

package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    public LoginPageTest() {
    }

    @Test
    public void someTestMethod() {
        this.app.loginPage().goToLoginPage();
        this.app.loginPage().writeIntoUsernameInputField("admin");
        this.app.loginPage().writeIntoPasswordInputField("parola123!");
        this.app.loginPage().clickLoginButton();
        this.app.dashboardPage().verifyLogoutButtonIsPresent();
    }

    @Test
    public void anotherLoginTest() {
        this.app.loginPage().goToLoginPage();
        this.app.loginPage().login("admin", "parola123!");
        this.app.dashboardPage().verifyLogoutButtonIsPresent();
    }
}
