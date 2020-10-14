package com.mobileteknoloji.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/json-reports/cucumber.json",
                "html:target/cucumber-reports",
               "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/mobileteknoloji/step_definitions"
        , dryRun = false
        , tags = "@positive"
)
public class CukesRunner {


}
