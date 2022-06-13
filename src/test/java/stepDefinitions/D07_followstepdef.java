package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;

public  class D07_followstepdef {

// FIRST SCENARIO:
@When("user open facebook page")
    public void user_hover() throws InterruptedException {

        WebElement followUs = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/div/strong"));
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(followUs);
        WebElement faceBook = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));
        actions.moveToElement(faceBook);
        actions.click().build().perform();
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Thread.sleep(5000);
     }


    @Then("facebook is opened")
 public void face_new_tab()
    {
        String url = Hooks.driver.getWindowHandle();
        ArrayList<String> tabs = new ArrayList<> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
  }


// SECOND SCENARIO:
@When("user open twitter page")
   public void user_twitter_hover() throws InterruptedException {

    WebElement followUs = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/div/strong"));
    Actions actions = new Actions(Hooks.driver);
    actions.moveToElement(followUs);
    WebElement twitter = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a"));
    actions.moveToElement(twitter);
     actions.click().build().perform();
    System.out.println(Hooks.driver.getCurrentUrl());
    System.out.println(Hooks.driver.getTitle());
    Thread.sleep(5000);
}


 @Then("twitter is opened")
public void face_twitter_new_tab()
    {
        String url = Hooks.driver.getWindowHandle();
        ArrayList<String> tabs = new ArrayList<> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));

    }


    @When("user open RSS page")
    public void user_RSS_hover() throws InterruptedException {

        WebElement followUs = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/div/strong"));
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(followUs);
        WebElement rss = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a"));
        actions.moveToElement(rss);
        actions.click().build().perform();
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Thread.sleep(5000);
    }


    @Then("RSS is opened")
    public void face_RSS_new_tab()
    {
        String url = Hooks.driver.getWindowHandle();
        ArrayList<String> tabs = new ArrayList<> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));

    }


}
