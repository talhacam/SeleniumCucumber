package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber_reports2.html",
                "json:target/json_reports/cucumber2.json",
                "junit:target/xml_report/cucumber2.xml"},
        features = "src/test/resources/features",
        glue="stepDefinitions",
        tags="@parametre",
        dryRun = false )

public class TestRunner2 {
}
