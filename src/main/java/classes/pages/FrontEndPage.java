package classes.pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontEndPage extends BasePage {


    @FindBy(xpath = "(//div[@id='top-links'])//li[2]"
    )
    private WebElement myAccountButton;

    @FindBy(
            xpath = "(//*[@id=\"top-links\"])//li//li[1]"
    )
    private WebElement registerButton;

    public void verifyRegisterButtonIsPresent() {
        this.verifyWebElementIsPresent(this.registerButton);
    }


    @FindBy(
            id="input-firstname"
    )
    private WebElement firstNameInputField;

    public void verifyFirstNameIsPresent() {
        this.verifyWebElementIsPresent(this.firstNameInputField);
    }

    @FindBy(
            id = "input-lastname"
    )
    private WebElement lastNameInputField;

    @FindBy(
            id = "input-telephone"
    )
    private WebElement telephoneInputField;
    @FindBy(
            id = "input-email"
    )
    private WebElement emailInputField;
    @FindBy(
            id = "input-password"
    )
    private WebElement passwordInputField;

    @FindBy(
            id = "input-confirm"
    )
    private WebElement passwordConfirmInputField;

    @FindBy(
            name = "agree"
    )
    private WebElement agreeButton;

    @FindBy(
            css = ".btn.btn-primary"
    )
    private WebElement continueButton;

    @FindBy(
            id = "content"
    )
    private WebElement message;


    public void verifyMessageIsPresent() {
        this.verifyWebElementIsPresent(this.message);
    }

    public FrontEndPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    private static final String URL = "https://shop.pragmatic.bg";

    public void goToOpenCartPage() {
        this.goPage("https://shop.pragmatic.bg");
    }

    public void writeIntoFirstNameInputField(String firstName) {
        this.typeInWebElement(this.firstNameInputField, firstName);
    }

    public void writeIntoLastNameInputField(String lastName) {
        this.typeInWebElement(this.lastNameInputField, lastName);
    }

    public void writeIntoTelephoneInputField(String telephone) {
        this.typeInWebElement(this.telephoneInputField, telephone);
    }

    public void writeIntoEmailInputField(String email) {
        this.typeInWebElement(this.emailInputField, email);
    }

    public void writeIntoPasswordInputField(String password) {
        this.typeInWebElement(this.passwordInputField, password);
    }

    public void writeIntoPasswordConfirmInputField(String passwordConfirm) {
        this.typeInWebElement(this.passwordConfirmInputField, passwordConfirm);
    }

    public void clickRegisterButton() {
        this.clickOnWebElement(this.registerButton);
    }

    public void clickAccountButton() {
        this.clickOnWebElement(this.myAccountButton);
    }

    public void clickAgreeButton() {
        this.clickOnWebElement(this.agreeButton);
    }

    public void clickContinueButton() {
        this.clickOnWebElement(this.continueButton);
    }


    public void register(String firstName, String lastname, String telephone, String password, String passwordConfirm, String email) {
        this.clickAccountButton();
        this.clickRegisterButton();
        this.writeIntoFirstNameInputField(firstName);
        this.writeIntoLastNameInputField(lastname);
        this.writeIntoTelephoneInputField(telephone);
        this.writeIntoEmailInputField(email);
        this.writeIntoPasswordInputField(password);
        this.writeIntoPasswordConfirmInputField(passwordConfirm);
        this.clickAgreeButton();
        this.clickContinueButton();
    }
}

