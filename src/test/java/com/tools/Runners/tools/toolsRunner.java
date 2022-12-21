package com.tools.Runners.tools;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@UseTestDataFrom(value = "TestData/DatosFormulario.csv")
@CucumberOptions(
        features = "src/test/resources/Features/tools.feature",
        tags = "@Scenario2",
        glue = "com.tools.StepDefinitions",
        snippets = SnippetType.CAMELCASE

)
public class toolsRunner {

}
