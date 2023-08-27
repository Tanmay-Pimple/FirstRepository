package runnermercury;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions(features = "Features",
				glue = {"stepDefinitionmercury"},
				plugin = {"pretty","html:target/mercurytestresult"})

public class RunnerMercuryClass {

}
