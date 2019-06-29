package com.mobileteknoloji.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        dryRun = false,
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber/",
                //"return:target/rerun.txt"
        }


)
public class FailedScenarios {

    //in this class,if there are failed scenarios,this class run failed scenarios
}
