package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BillPalliBiddut extends BasePage{
    public BillPalliBiddut(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Palli Bidyut')]")
    WebElement PalliBiddutBtn;

    @FindBy(xpath = "//input[contains(@id,'input_meter_no')]")
    WebElement MeterNumb;

    @FindBy(xpath = "//input[contains(@id,'input_mobile_no')]")
    WebElement mobileNumber;

    @FindBy(xpath = "//input[contains(@id,'input_amount')]")
    WebElement amount;

    @FindBy(xpath = "//select[contains(@id,'bill_type')]")
    WebElement billType;

    @FindBy(css = "button[type='submit']")
    WebElement proceedBtn;

    @FindBy(css = "button[class='btn btn btn-primary']")
    WebElement tryLaterBtn;

    public void SetPalliBiddut(String meterNumber, String numberMobile, String rechargeAmount){
        wait.until(ExpectedConditions.visibilityOf(PalliBiddutBtn)).click();

        wait.until(ExpectedConditions.visibilityOf(MeterNumb)).sendKeys(meterNumber);

        wait.until(ExpectedConditions.visibilityOf(mobileNumber)).sendKeys(numberMobile);

        wait.until(ExpectedConditions.visibilityOf(amount)).sendKeys(rechargeAmount);

        billType.click();

        WebElement billTypeDropdown = driver.findElement(By.xpath("//select[contains(@id,'bill_type')]"));
        Select dropdownBillType = new Select(billTypeDropdown);
        dropdownBillType.selectByIndex(0);

        wait.until(ExpectedConditions.visibilityOf(proceedBtn)).click();

        wait.until(ExpectedConditions.visibilityOf(tryLaterBtn)).click();
    }
}
