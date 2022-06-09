package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P03_homepage;

public class D02_loginstepdef {
    public P02_login login = new P02_login(Hooks.driver);

// User Could login with valid data
    @When("user click on login tab")
    public void login_tab()
    {
        P03_homepage homePage = new P03_homepage(Hooks.driver);
        Hooks.driver.findElement(homePage.login_icon()).click();
    }
    @And("user enter valid email and password")
    public void set_email_password()
    {
        Hooks.driver.findElement(login.email()).sendKeys("mayar.m.530@gmail.com");
        Hooks.driver.findElement(login.password()).sendKeys("P@ssw0rd");

    }
    @Then("user click on login button")
    public void login_button() throws InterruptedException {
        Hooks.driver.findElement(login.login_button()).click();
        Thread.sleep(100);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"), "true");
        soft.assertAll();
    }



}
