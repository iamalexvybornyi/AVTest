package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements IBrowser {

    public WebDriver initBrowser() {
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
