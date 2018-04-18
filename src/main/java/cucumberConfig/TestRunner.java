package cucumberConfig;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
    @CucumberOptions(

            monochrome = true,
            features = "C:\\Users\\ME\\Downloads\\Compressed\\AMA-master\\AMZ\\src\\main\\java\\cucumberConfig\\AmazonApplication.feature"
            ,glue     = {"TestCases"}
            ,tags = {"@RegressionTest"}

            )

    public class TestRunner  {

    }

