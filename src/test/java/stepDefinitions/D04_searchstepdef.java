package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class D04_searchstepdef {

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



}
