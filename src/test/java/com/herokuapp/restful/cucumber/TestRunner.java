package com.herokuapp.restful.cucumber;
/* 
 Created by Kalpesh Patel
 */

import com.herokuapp.restful.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature",
        tags = "@crud")
public class TestRunner extends TestBase {
}
