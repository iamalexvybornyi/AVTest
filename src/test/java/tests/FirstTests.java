package tests;

import enums.Checkboxes;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CheckboxesPage;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FirstTests {
    private ChromeDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void openHomePageAndClickCheckboxes(){
        openHomePageForCheckboxes();
        CheckboxesPage checkboxesPage = new CheckboxesPage();
        checkboxesPage.clickCheckBoxWithoutId(driver, "order 1");
        checkboxesPage.clickCheckBoxWithoutId(driver, "order 2");
        checkboxesPage.clickCheckBoxWithoutId(driver, "order 3");
        checkboxesPage.clickCheckBoxWithoutId(driver, "order 4");

        Assert.assertTrue("order 1 shouldn't be checked", !checkboxesPage.checkSelectionOfCheckBoxWithoutId(driver, "order 1"));
        Assert.assertTrue("order 2 should be checked", checkboxesPage.checkSelectionOfCheckBoxWithoutId(driver, "order 2"));
        Assert.assertTrue("order 3 should be checked", checkboxesPage.checkSelectionOfCheckBoxWithoutId(driver, "order 3"));
        Assert.assertTrue("order 4 should be checked", checkboxesPage.checkSelectionOfCheckBoxWithoutId(driver, "order 4"));
    }

    private void openHomePageForCheckboxes(){
        Logger.getAnonymousLogger().info("Opening url of home page");
        driver.get("https://stackblitz.com/edit/angular-stszta");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.open('https://angular-stszta.stackblitz.io/','_blank');");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(), ' order 1 ')]/input[@type='checkbox']")));
    }
}
