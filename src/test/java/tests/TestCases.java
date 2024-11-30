package tests;

import modules.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestCases extends BaseTest {

    @Test(priority = 0)
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("01791557029", "123456");
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    public void testRecharge() {
        RechargePage rechargePage = new RechargePage(driver);

        rechargePage.recharge("01687663220", "100");
    }

    @Test(priority = 2)
    public void testRechargeSchedule() {
        ScheduleRecharge scheduleRecharge = new ScheduleRecharge(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        scheduleRecharge.RechargeSchedule();
    }

    @Test(priority = 3)
    public void testRechargeOffers() {
        RechargeOffers rechargeOffers = new RechargeOffers(driver);

        rechargeOffers.rechargeOfferMethod();
    }

    @Test(priority = 4)
    public void testBillPay(){
        BillPayPage billPayPage = new BillPayPage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-400)", "");

        billPayPage.setBillPay("123456789");
    }
}
