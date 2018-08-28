package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver",new File(Homework2.class.getResource("/chromedriver.exe").getFile()).getPath());
        return new ChromeDriver();
        throw new UnsupportedOperationException("Method doesn't return WebDriver instance");
    }
}
