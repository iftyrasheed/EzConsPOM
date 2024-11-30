package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ScheduleRecharge extends BasePage {
    public ScheduleRecharge(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "schedule_recharge")
    WebElement scheduleRechBtn;

    @FindBy(xpath = "//div[@class='calendar-table']//select[@class='monthselect']")
    WebElement monthSelect;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[3]")
    WebElement dateSelect;

    @FindBy(css = "div[class='drp-calendar left single'] select[class='hourselect']")
    WebElement hourSelect;

    @FindBy(css = "div[class='drp-calendar left single'] select[class='minuteselect']")
    WebElement minSelect;

    @FindBy(css = "div[class='drp-calendar left single'] select[class='ampmselect']")
    WebElement ampmSelect;

    @FindBy(css = "button[class='applyBtn btn btn-sm btn-primary']")
    WebElement applyBtn;

    public void RechargeSchedule() {
        scheduleRechBtn.click();

        wait.until(ExpectedConditions.visibilityOf(monthSelect));
        monthSelect.click();

        WebElement monthDropdown = driver.findElement(By.xpath("//div[@class='calendar-table']//select[@class='monthselect']"));
        Select dropDownMonth = new Select(monthDropdown);
        dropDownMonth.selectByIndex(11);

        dateSelect.click();

        hourSelect.click();
        WebElement hourDropdown = driver.findElement(By.cssSelector("div[class='drp-calendar left single'] select[class='hourselect']"));
        Select dropDownHour = new Select(hourDropdown);
        dropDownHour.selectByIndex(11);

        minSelect.click();
        WebElement minDropdown = driver.findElement((By.cssSelector("div[class='drp-calendar left single'] " +
                "select[class='minuteselect']")));
        Select dropDownMin = new Select(minDropdown);
        dropDownMin.selectByIndex(47);

        ampmSelect.click();
        WebElement ampmDropdown = driver.findElement((By.cssSelector("div[class='drp-calendar left single'] " +
                "select[class='ampmselect']")));
        Select dropDownAmpm = new Select(ampmDropdown);
        dropDownAmpm.selectByIndex(1);

        applyBtn.click();
    }
}
