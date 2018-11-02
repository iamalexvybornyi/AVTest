package it.test.tests;

import config.BrowserFactory;
import it.test.step.TestSteps;
import org.apache.commons.chain.impl.ContextBase;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class AbstractTest {
    protected WebDriver driver;
    protected ContextBase context;
    protected TestSteps steps;

    @Before
    public void setUp() {
        BrowserFactory browser = new BrowserFactory();
        this.driver = browser.getBrowserInstance(System.getProperty("browser")).initBrowser();
        this.driver.manage().window().maximize();

        this.context = new ContextBase();
        this.context.put("webDriver", this.driver);
        this.steps = new TestSteps(this.context);
    }

    @After
    public void tearDown(){
        this.driver.quit();

        this.driver = null;
        this.context = null;
        this.steps = null;
    }
}
