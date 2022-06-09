package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import stepDefinitions.Hooks;

import java.util.List;

public class P03_homepage {

    WebDriver driver;
    public WebElement slider(String sliderNum)
    {
        WebElement element = Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
        return element;
    }
    public List<WebElement> wishlistBtns()
    {
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }
    public P03_homepage(WebDriver driver)
    {
        this.driver = driver;
    }

    public By register_icon()
    {
        return By.className("ico-register");
    }

    public By login_icon()
    {
        return By.className("ico-login");
    }




}
