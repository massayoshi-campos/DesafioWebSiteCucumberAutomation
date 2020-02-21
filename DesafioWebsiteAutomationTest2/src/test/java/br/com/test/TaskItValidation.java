package br.com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import br.com.common.*;

/**
 * @author Massayohi Campos Criado em Fevereiro/2020
 * Desafio da empresa Inmetrics para automação Web, essa automação foi realizada com o framework Cucumber com Selenium em Java.
 * @version 1.0.0
 * @since Release 1.0
 * 
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/TaskIt.features/TaskIt.feature",  
		plugin = {"pretty","html:target/cucumber", "json:target/cucumber.json"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        strict = false, 
        dryRun = false)

public class TaskItValidation {

}

