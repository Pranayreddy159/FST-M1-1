package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\0028M3744\\IdeaProjects\\FST_M1_SELENIUM\\src\\test\\java\\features",
        glue = {"stepDefinitions"},
        tags = "@activity4"
)

public class ActivitiesRunner4 {
}
