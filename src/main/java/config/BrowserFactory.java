package config;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {

    public IBrowser getBrowserInstance(String browserProperty) {

        if (browserProperty.equalsIgnoreCase("chrome")) {
            return new ChromeBrowser();
        } else if (browserProperty.equalsIgnoreCase("firefox")) {
            return new FirefoxBrowser();
        } else {
            return null;
        }
    }
}
