package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_homesliderstepdef {

    //FIRST SCENARIO
    @When("user click on first slider")
    public void first_slider() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")).click();
    }

    @Then("relative product for first slider is appeared")
    public void first_slider_appeared() throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
        Thread.sleep(1500);
    }


    //SECOND SCENARIO
   @When("user click on second slider")
    public void user_click_on_second_slider() throws InterruptedException{
    Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")).click();
    }

    @Then("relative product for second slider is displayed")
    public void relative_product_for_second_slider_is_displayed() throws InterruptedException {
     Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphones6");
      Thread.sleep(1500);
    }





}
