package test_scripts.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/test_scripts/bdd/features",
                     glue = "classpath:test_scripts.bdd.bddsteps",
                    dryRun = false,
                    strict = true,
                    monochrome = true,tags = "")

public class Runner {
}
