package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Btcl extends BasePage {
    public Btcl(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'BTCL')]")
    WebElement BtclMenu;

    @FindBy(xpath = "//input[contains(@id,'phone_number')]")
    WebElement phoneNumber;

    @FindBy(xpath = "//select[contains(@id,'select_bill_months')]")
    WebElement monthSelect;

    @FindBy(css = "button[type='submit']")
    WebElement proceedBtn;

    @FindBy(css = "button[class='btn btn btn-primary']")
    WebElement tryLaterBtn;

    public void BtclLocatorCalls(String numberPhone) {
        wait.until(ExpectedConditions.visibilityOf(BtclMenu)).click();

        wait.until(ExpectedConditions.visibilityOf(phoneNumber)).sendKeys(numberPhone);

        monthSelect.click();

        WebElement monthDropdown = driver.findElement(By.xpath("//select[contains(@id,'select_bill_months')]"));
        Select dropDown = new Select(monthDropdown);
        dropDown.selectByIndex(6);

        wait.until(ExpectedConditions.visibilityOf(proceedBtn)).click();

        wait.until((ExpectedConditions.visibilityOf(tryLaterBtn))).click();
    }
}
