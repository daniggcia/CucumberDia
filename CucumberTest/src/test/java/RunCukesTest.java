


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.java.en.*;




@CucumberOptions(features="src/test/java/features/login.feature",glue="stepdefinition")
public class RunCukesTest extends AbstractTestNGCucumberTests{



}
