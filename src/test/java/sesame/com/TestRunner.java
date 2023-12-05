package sesame.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources"},
		glue = {"sesame.com"},
		plugin = {"json:target/cucumber.json"})
public class TestRunner {

}
