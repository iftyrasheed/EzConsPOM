package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class insurance extends BasePage{
    public insurance(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/insurance/currentInsurance']")
    WebElement insuranceBtn;

    @FindBy(xpath = "//a[contains(text(),'Proceed')]")
    WebElement proceedBtn;

    public void setInsurance() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(insuranceBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(proceedBtn)).click();

        Thread.sleep(2000);

//        String newUrl = driver.getCurrentUrl();
//        driver.switchTo().newWindow(WindowType.valueOf(newUrl)).close();

        String originalWindow = driver.getWindowHandle(); // Get the original window handle

        // Wait for the number of windows to be 2
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Switch to the new window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Perform any actions in the new window if needed
        System.out.println("New window URL: " + driver.getCurrentUrl());

        // Close the new window
        driver.close();

        // Switch back to the original window
        driver.switchTo().window(originalWindow);
    }
}
