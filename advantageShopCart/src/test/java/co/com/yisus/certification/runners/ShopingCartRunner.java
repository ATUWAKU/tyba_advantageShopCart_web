package co.com.yisus.certification.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/shopingCart.feature",
        glue = "co.com.yisus.certification.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "not @Manula"

)
public class ShopingCartRunner {
}
