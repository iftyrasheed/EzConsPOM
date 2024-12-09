package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Domain_Btcl extends BasePage{
    public Domain_Btcl(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'DOMAIN')]")
    WebElement DomainMenuBtn;

    @FindBy(xpath = "//input[contains(@id,'input_account_no')]")
    WebElement invoiceId;

    @FindBy(css = "button[type='submit']")
    WebElement proceedBtn;

    @FindBy(css = "button[class='btn btn btn-primary']")
    WebElement tryLaterBtn;

    public void btclDomain(String invoice){
        wait.until(ExpectedConditions.visibilityOf(DomainMenuBtn)).click();

        wait.until(ExpectedConditions.visibilityOf(invoiceId)).sendKeys(invoice);

        wait.until(ExpectedConditions.visibilityOf(proceedBtn)).click();

        wait.until(ExpectedConditions.visibilityOf(tryLaterBtn)).click();
    }
}
