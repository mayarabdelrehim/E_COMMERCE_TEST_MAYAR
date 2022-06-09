package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    // Driver annotation before and after//

    public static WebDriver driver = null;

    @Before
    public void openBrowser() {
        // Step 1 : Setting Step Definition
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\E-CommerceTesT\\src\\main\\resources\\chromedriver.exe");
        // Step 2 : Driver Object Creation
        driver = new ChromeDriver();
        // Step 3 : Config to Driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Step 4 : Website Navigation
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
