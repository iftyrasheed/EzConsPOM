package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WasaBill extends BasePage{
    public WasaBill(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'WASA')]")
    WebElement wasaMenu;

    @FindBy(xpath = "//input[contains(@id,'input_billno')]")
    WebElement BillNo;

    @FindBy(xpath = "//input[contains(@id,'input_account_no')]")
    WebElement UtilityNo;

    @FindBy(css = "button[type='submit']")
    WebElement ProceedBtn;

    @FindBy(css = "button[class='btn btn btn-primary']")
    WebElement tryLaterBtn;

    public void billWasa(String BillNumber, String UtilityNumber){
        wait.until(ExpectedConditions.visibilityOf(wasaMenu)).click();

        wait.until((ExpectedConditions.visibilityOf(BillNo))).sendKeys(BillNumber);

        UtilityNo.sendKeys(UtilityNumber);

        wait.until(ExpectedConditions.visibilityOf(ProceedBtn)).click();

        wait.until(ExpectedConditions.visibilityOf(tryLaterBtn)).click();
    }
}
