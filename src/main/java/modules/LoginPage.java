package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".login-btn")
    WebElement SetSignInBtn;

    // email locator
    @FindBy(xpath = "//div[@class='form-group label-up']//input[@type='text']")
    WebElement SetEmailField;

    // proceed btn locator
    @FindBy(css = ".form-group.text-center")
    WebElement SetProceedBtn;

    // password locator
    @FindBy(css = "input[type='password']")
    WebElement SetPass;

    // sign in button locator
    @FindBy(id = "sign_in_button")
    WebElement SignBtn;

    public void Login(String mail, String passWord) {
        // sign in button click
        SetSignInBtn.click();

        // email field input
        wait.until(ExpectedConditions.visibilityOf(SetEmailField));
        SetEmailField.sendKeys(mail);
        // proceed button click
        SetProceedBtn.click();
        // pass field input
        wait.until(ExpectedConditions.visibilityOf(SetPass));
        SetPass.sendKeys(passWord);
        SignBtn.click();
    }
}
