package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class FirstTests {
    private ChromeDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void openHomePage(){
        Logger.getAnonymousLogger().info("Opening home page with default url");
        driver.get("http://automationpractice.com/index.php");
    }
}
