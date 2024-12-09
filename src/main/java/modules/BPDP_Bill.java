package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BPDP_Bill extends BasePage{
    public BPDP_Bill(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'BPDB')]")
    WebElement BPDPmenu;

    @FindBy(xpath = "//input[contains(@id,'input_meter_no')]")
    WebElement LocatorMeterNumber;

    @FindBy(xpath = "//input[contains(@id,'input_mobile_no')]")
    WebElement LocatorMobileNumber;

    @FindBy(xpath = "//input[contains(@id,'input_amount')]")
    WebElement LocatorAmount;

    @FindBy(css = "button[type='submit']")
    WebElement LocatorProceedBtn;

    @FindBy(css = "button[class='btn btn btn-primary']")
    WebElement LocatorTryLaterBtn;

    public void billBPDP(String NumberMeter, String NumberMobile, String Amount){

        wait.until(ExpectedConditions.visibilityOf(BPDPmenu)).click();

        wait.until(ExpectedConditions.visibilityOf(LocatorMeterNumber)).sendKeys(NumberMeter);

        LocatorMobileNumber.sendKeys(NumberMobile);

        LocatorAmount.sendKeys(Amount);

        wait.until(ExpectedConditions.visibilityOf(LocatorProceedBtn)).click();

        wait.until(ExpectedConditions.visibilityOf(LocatorTryLaterBtn)).click();
    }
}
