package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BillPayPage extends BasePage{
    public BillPayPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/dynamic/bill-pay']")
    WebElement BillPayBtn;

    @FindBy(xpath = "//input[contains(@id,'formly')]")
    WebElement dpdcCustomerNo;

    @FindBy(xpath = "//select[contains(@id,'select_bill_years')]")
    WebElement BillYear;

    @FindBy(xpath = "//select[contains(@id,'select_bill_months')]")
    WebElement BillMonth;

    @FindBy(css = "button[type='submit']")
    WebElement proceedBtn;

    @FindBy(css = "button[class='btn btn btn-primary']")
    WebElement doneBtn;
    public void setBillPay(String num){

        wait.until(ExpectedConditions.visibilityOf(dpdcCustomerNo)).click();
        dpdcCustomerNo.sendKeys(num);

        BillYear.click();

        WebElement billYearDropdown = driver.findElement(By.xpath("//select[contains(@id,'select_bill_years')]"));
        Select DropdownBillYear = new Select(billYearDropdown);
        DropdownBillYear.selectByIndex(2);

        BillMonth.click();
        WebElement billMonthDropdown = driver.findElement(By.xpath("//select[contains(@id,'select_bill_months')]"));
        Select DropdownBillMonth = new Select(billMonthDropdown);
        DropdownBillMonth.selectByIndex(6);

        proceedBtn.click();

        wait.until(ExpectedConditions.visibilityOf(doneBtn)).click();
    }
}
