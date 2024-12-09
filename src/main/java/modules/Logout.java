package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Logout extends BasePage{
    public Logout(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[type='button']")
    WebElement profileBtn;

    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    WebElement SignOutBtn;

//    @FindBy(xpath = "//div[@class='modal-footer text-center'] //button")
//    WebElement doneBtn;

    public void setSignOut(){
        wait.until(ExpectedConditions.visibilityOf(profileBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(SignOutBtn)).click();

    }
}
