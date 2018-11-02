package it.test.tests;

import it.test.tests.AbstractTest;
import org.junit.Test;
import util.PropertiesUtil;

import java.util.logging.Logger;

public class FirstTest extends AbstractTest {

    @Test
    public void openHomePage(){
        Logger.getAnonymousLogger().info("Opening home page...");
        driver.get(PropertiesUtil.getUrl("url.main"));
    }
}
