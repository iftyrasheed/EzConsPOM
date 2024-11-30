package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RechargeOffers extends BasePage{
    public RechargeOffers(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//p[@placement='top'])[10]")
    WebElement oneOffer;

    @FindBy(css = "a[aria-label='Next page']")
    WebElement offerNextPage;
    public void rechargeOfferMethod(){
        oneOffer.click();
        offerNextPage.click();
    }
}
