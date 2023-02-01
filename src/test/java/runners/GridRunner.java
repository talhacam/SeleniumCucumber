package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber_reports.html",
                "json:target/json_reports/cucumber.json",
                "junit:target/xml_report/cucumber.xml",
                "rerun:target/failedRerun.txt"},
        features = "src/test/resources/features/GridFeatures/GridTestCase.feature",
        glue="stepDefinitions",
        tags="@grid_chrome",
        dryRun = false)

public class GridRunner {

}

