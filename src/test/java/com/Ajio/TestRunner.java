package com.Ajio;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="./src/test/resources",
		glue = "com.Ajio",
		tags = "@create or @jeans",
		plugin = {"html:target/index.html","json:target/Test Report.json"},
//		dryRun = true,
		monochrome = true
//		strict= true
		)

public class TestRunner {

}
