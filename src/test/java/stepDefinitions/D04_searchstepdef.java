package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D04_searchstepdef {
// FIRST SCENARIO:
    @Given("user navigate to home page")
    public void user_navigate_to_home_page() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("Search for {string}")
    public void search_for(String string) {

                Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("Iphone 7s");
    }

    @Then("Click on SEARCH button")
    public void click_on_search_button() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button")).click();
        Thread.sleep(1500);
    }



// SECOND SCENARIO:

    @When("user navigates to homepage to search SKU")
    public void user_navigates()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("user clicks on sku search field in homepage")
    public void user_search_sku() throws InterruptedException {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("AP_MBP_13");
        Thread.sleep(2000);
    }
    @Then("sku search result appears on screen")
    public void user_clicks()
    {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button")).click();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=AP_MBP_13"),"SKU verify");
        System.out.println("SKU VERIFY");
        soft.assertAll();

    }




}
