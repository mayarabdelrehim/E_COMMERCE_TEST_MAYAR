package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currencystepdef {

    @When("user navigate to home page and select currency")
    public void user_navigate() throws InterruptedException {
        Select selectCurrency = new Select(Hooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]")));
        selectCurrency.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        Thread.sleep(2000);
    }

    @Then("user choose euro")
    public void choose_euro() throws InterruptedException {
        SoftAssert currencyAssert = new SoftAssert();
        String expectedResult = "€";
        for (int i = 0; i < verifyEuro().size(); i++) {
            currencyAssert.assertEquals(verifyEuro().get(i).getText().substring(0, 1), expectedResult, "Error No Euro");
            currencyAssert.assertAll();
            System.out.println("Item Price € : " + verifyEuro().get(i).getText());
            Thread.sleep(2000);

        }

    }
    public List<WebElement> verifyEuro() {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }


}








