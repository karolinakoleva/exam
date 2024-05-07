package tests;

import base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    public RegisterTest(){
    }
    String emailPrefix = RandomStringUtils.randomAlphabetic(7);
    String emailSuffix = RandomStringUtils.randomAlphabetic(5);
    String email = emailPrefix + "@" + emailSuffix + ".com";

    @Test
    public void registerTest(){
        this.app.frontEndPage().goToOpenCartPage();
        this.app.frontEndPage().clickAccountButton();
        this.app.frontEndPage().verifyRegisterButtonIsPresent();
        this.app.frontEndPage().clickRegisterButton();
        this.app.frontEndPage().verifyFirstNameIsPresent();
        this.app.frontEndPage().writeIntoFirstNameInputField("Karolina");
        this.app.frontEndPage().writeIntoLastNameInputField("Koleva");
        this.app.frontEndPage().writeIntoTelephoneInputField("0888888888");
        this.app.frontEndPage().writeIntoPasswordInputField("karolina12345");
        this.app.frontEndPage().writeIntoPasswordConfirmInputField("karolina12345");
        this.app.frontEndPage().writeIntoEmailInputField(email);
        this.app.frontEndPage().verifyMessageIsPresent();
    }
}
