package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser implements IBrowser {

    public WebDriver initBrowser() {
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
