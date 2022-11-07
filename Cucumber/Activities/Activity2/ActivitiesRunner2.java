package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "C:\\Users\\0028M3744\\IdeaProjects\\FST_M1_SELENIUM\\src\\test\\java\\features",
            glue = {"stepDefinitions"},
            tags = "@activity2"
    )

    public class ActivitiesRunner2 {
        //empty
    }

