package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class D08_wishliststepdef {

    int number;

    @When("user add product to wishlist")
    public void  wishlist() throws InterruptedException {

        Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).get(2);
        Thread.sleep(3000);
    }

    @Then("wishlist notification success is visible")
    public void notification_success() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector
         ("div.item-grid:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(3)")).click();
        Thread.sleep(3000);
    }





}
