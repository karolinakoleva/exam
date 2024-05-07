
package base;

import core.App;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    protected App app;

    public BaseTest() {
    }

    @BeforeMethod
    public void setup() {
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
        this.driver.manage().window().maximize();
        this.app = new App(this.driver);
    }

    @AfterMethod
    public void tearDown() {
        this.driver.quit();
    }
}

