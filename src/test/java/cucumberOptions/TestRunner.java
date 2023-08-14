package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", glue={"stepDefination","helper"},tags="@Reg",plugin={"html:target/test/cucumber.html","json:target/jsonReport/cucumber.json"})
public class TestRunner {

}
