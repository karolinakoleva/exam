//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core;

import classes.pages.FrontEndPage;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;

public class App {
    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private FrontEndPage frontEndPage;

    public App(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage loginPage() {
        if (this.loginPage == null) {
            this.loginPage = new LoginPage(this.driver);
        }

        return this.loginPage;
    }

    public DashboardPage dashboardPage() {
        if (this.dashboardPage == null) {
            this.dashboardPage = new DashboardPage(this.driver);
        }

        return this.dashboardPage;
    }

    public FrontEndPage frontEndPage() {
        if (this.frontEndPage == null) {
            this.frontEndPage = new FrontEndPage(this.driver);
        }

        return this.frontEndPage;
    }
}
