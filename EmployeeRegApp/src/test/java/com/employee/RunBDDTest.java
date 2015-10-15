package test.java.com.employee;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/com/employee",
		format = {"pretty","json:target/cucumber.json" })
public class RunBDDTest {

}
