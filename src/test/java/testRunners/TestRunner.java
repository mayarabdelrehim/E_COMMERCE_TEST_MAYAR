package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
@io.cucumber.junit.CucumberOptions(
        features = "src\\main\\resources\\UserStories",
        glue = "stepDefinitions",
        tags = "@smoke",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"
        }
)






public class TestRunner {

}
