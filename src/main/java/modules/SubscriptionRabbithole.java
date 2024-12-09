package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SubscriptionRabbithole extends BasePage {
    public SubscriptionRabbithole(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "ul[id='tabs'] li:nth-child(3)")
    WebElement subsMenu;

    @FindBy(css = "div[class='tab-content'] li:nth-child(1)")
    WebElement monthlyPackage;

    @FindBy(css = "div[class='tab-content'] li:nth-child(2)")
    WebElement yearlyPackage;

    @FindBy(css = "button[class='btn btn-primary pull-right ']")
    WebElement proceedBtn;

    @FindBy(css = "div[class='tingle-modal-box__footer'] button[class='tingle-modal__close']")
    WebElement crossBtn;

    public void subsRabbit() {
        wait.until(ExpectedConditions.visibilityOf(subsMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(monthlyPackage)).click();
        wait.until(ExpectedConditions.visibilityOf(yearlyPackage)).click();
        wait.until(ExpectedConditions.visibilityOf(proceedBtn)).click();
//        wait.until(ExpectedConditions.visibilityOf(crossBtn));
//        crossBtn.click();
    }
}
