package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.P01_register;
import pages.P03_homepage;



public class D01_registerstepdef {
    P01_register register = new P01_register(Hooks.driver);


    @Given("user click on register")
    public void click_register()
    {
        P03_homepage homePage = new P03_homepage(Hooks.driver);
        Hooks.driver.findElement(homePage.register_icon()).click();
    }
    @And("user enter personal valid data")
    public void personal_data()
    {
        Hooks.driver.findElement(register.firstname()).sendKeys("Mayar");
        Hooks.driver.findElement(register.lastname()).sendKeys("Mohamed");
        Hooks.driver.findElement(register.email()).sendKeys("mayar.m.530@gmail.com");
        String er = "Your registration completed";
    }



    @When("user enter password")
    public void fill_password()
    {
        Hooks.driver.findElement(register.password()).sendKeys("P@ssw0rd");
        Hooks.driver.findElement(register.confirm_password()).sendKeys("P@ssw0rd");
    }
    @And("user click on register button")
   public void register_button()
    {
        Hooks.driver.findElement(register.register_button()).click();
    }



    @Then("user get success message")
    public void success_msg()
    {

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.findElement(By.className("result")).isDisplayed(), true);
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href= \"/customer/info\"][class=\"ico-account\"]")).isDisplayed());
        soft.assertAll();
    }


}
