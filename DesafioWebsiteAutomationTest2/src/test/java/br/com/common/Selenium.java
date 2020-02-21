package br.com.common;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Massayohi Campos Criado em Fevereiro/2020
 * Desafio da empresa Inmetrics para automação Web, essa automação foi realizada com o framework Cucumber com Selenium em Java.
 * @version 1.0.0
 * @since Release 1.0
 * 
 */


public class Selenium {

	private static WebDriver driver = null;

	/**
	 * Verifica qual o browser escolhido no arquivo de propriedades e inicializa o
	 * driver apropriado.
	 * 
	 * @return Retorna instancia do WebDriver.
	 */

	public static WebDriver getDriver() {
		try {
			String browser = Property.BROWSER_NAME;
			if (driver == null) {

				if (Browser.CHROME.equals(browser)) {
					File file = new File(Property.CHROME_DRIVE_PATH);
					System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
					ChromeOptions chromeOptions = new ChromeOptions();

					chromeOptions.addExtensions(new File("C:\\dev\\tools\\plugins_chrome\\Chrome.crx"));
					DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
					desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
					driver = new ChromeDriver(desiredCapabilities);
					driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return driver;
	}

}
