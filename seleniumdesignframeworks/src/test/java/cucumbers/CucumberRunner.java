package cucumbers;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumbers" , glue="cucmbers.stepdefinition",monochrome=true,
plugin= {"html:target/cucumber.html"})
public class CucumberRunner extends AbstractTestNGCucumberTests{
}
