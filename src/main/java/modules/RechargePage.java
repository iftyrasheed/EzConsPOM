package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RechargePage extends BasePage {
    public RechargePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "typeahead-basic")
    WebElement mobileNumberField;

    @FindBy(id = "telecom-operator")
    WebElement selectOperator;

    @FindBy(id = "connection-type")
    WebElement connectionType;

    @FindBy(xpath = "//input[@formcontrolname='amount']")
    WebElement amount;

    @FindBy(css = "button[type='submit']")
    WebElement proceedBtn;

    @FindBy(css = "div[class='tingle-modal-box__footer'] button[class='tingle-modal__close']")
    WebElement closeBtn;

    public void recharge(String mobileNumber, String rechargeAmount) {
        mobileNumberField.sendKeys(mobileNumber);

        wait.until(ExpectedConditions.visibilityOf(selectOperator));
        selectOperator.click();

        WebElement operatorDropdown = driver.findElement(By.id("telecom-operator"));
        Select dropDownOperator = new Select(operatorDropdown);
        dropDownOperator.selectByIndex(5);
        //dropDownOperator.getFirstSelectedOption().click();

        wait.until(ExpectedConditions.visibilityOf(connectionType));
        connectionType.click();

        WebElement connectionDropdown = driver.findElement(By.id("connection-type"));
        Select dropDownConnection = new Select(connectionDropdown);
        dropDownConnection.selectByIndex(1);

        amount.sendKeys(rechargeAmount);

        wait.until(ExpectedConditions.visibilityOf(proceedBtn));
        proceedBtn.click();

        wait.until(ExpectedConditions.visibilityOf(closeBtn));
        closeBtn.click();
    }
}
