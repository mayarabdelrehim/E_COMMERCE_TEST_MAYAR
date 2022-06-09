package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class D03_currencystepdef {

    @When("user navigate to home page and select currency")
    public void user_navigate() throws InterruptedException {
      Thread.sleep(1000);
    }

    @Then("user choose euro")
    public void choose_euro() throws InterruptedException {
        Select selectCurrency = new Select(Hooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]")));
        selectCurrency.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        Thread.sleep(2000);
    }



}
