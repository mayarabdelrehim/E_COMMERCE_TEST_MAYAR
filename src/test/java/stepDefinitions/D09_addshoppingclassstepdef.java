package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D09_addshoppingclassstepdef {

    @When("user add product to shopping cart")
    public void user_add_product_to_shopping_cart() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/camera-photo");
        Thread.sleep(5000);

    }

    @Then("shopping chart notification success is visible")
    public void shopping_chart_notification_success_is_visible() throws InterruptedException {
        Hooks.driver.findElement
        (By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        Thread.sleep(5000);

    }



}
