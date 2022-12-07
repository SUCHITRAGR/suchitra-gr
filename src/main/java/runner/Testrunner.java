package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        features = {"src/main/java/Feature"},
        glue = {"Mystepdef"},

        plugin = {"pretty",
                "html:target/cucumber-report/report.html",
                "json:target/cucumber-report/report.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})

public class Testrunner {
}
