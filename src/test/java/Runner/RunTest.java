package Runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/main/resources",
        glue ="stepDefinations", tags="@NuhaaTest",
        plugin ={ "pretty", "html:target/cucumber", "json:target/cumcmber.json", "junit:target/cukes.xml"})

public class RunTest {



}
