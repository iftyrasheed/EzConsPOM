package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SubsTruecaller extends BasePage{
    public SubsTruecaller(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='Enter Mobile Number']")
    WebElement inputNumber;

    @FindBy(css = ".flex-equal-width.selected-plan")
    WebElement secondPack;

    @FindBy(css = "button[type='submit']")
    WebElement proceedBtn;

    @FindBy(css = "img[placement='top']")
    WebElement crossBtn;

    @FindBy(css = ".ngx-cool-dialog__ok-btn")
    WebElement confirmCancel;

    @FindBy(css = "button[class='btn btn-default']")
    WebElement secondCancel;

    public void setTrueCaller(String number) throws InterruptedException {
        Thread.sleep(5000);
        driver.get("https://easy.com.bd/subscribe/truecaller");

        wait.until(ExpectedConditions.visibilityOf(inputNumber)).sendKeys(number);
        wait.until(ExpectedConditions.visibilityOf(secondPack)).click();
        wait.until(ExpectedConditions.visibilityOf(proceedBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(crossBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(confirmCancel)).click();
        wait.until(ExpectedConditions.visibilityOf(secondCancel)).click();
    }
}
