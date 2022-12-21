package com.tools.Runners.tools;

import com.tools.Models.CustomRunnerAdd;
import com.tools.Utils.exceldata.BeforeSuite;
import com.tools.Utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunnerAdd.class)
@UseTestDataFrom(value = "TestData/DatosFormulario.csv")
@CucumberOptions(
        features = "src/test/resources/Features/tools.feature",
        tags = "@Scenario",
        glue = "com.tools.StepDefinitions",
        snippets = SnippetType.CAMELCASE

)
public class toolsAddRunner {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/Features/tools.feature");
    }

}
