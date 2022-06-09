package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class D05_hooverCategoriesStepDef {

    String subCategoryName;
    WebDriver driver = Hooks.driver;

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {

        Actions action = new Actions(Hooks.driver);

        WebElement electronics = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/electronics\"]"));
        action.moveToElement(electronics).perform();
        Thread.sleep(1500);

        WebElement others = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/others\"]"));
        subCategoryName = others.getText().toLowerCase().trim();
        System.out.println(subCategoryName);

        others.click();
    }




}
