package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage {

    private String checkboxLocator = "//label[contains(text(), '%s')]/input[@type='checkbox']";

    public void clickCheckBoxWithoutId(WebDriver driver, String value){
        String checkboxLocatorWithName = String.format(checkboxLocator, value);
        driver.findElement(By.xpath(checkboxLocatorWithName)).click();
    }

    public boolean checkSelectionOfCheckBoxWithoutId(WebDriver driver, String value){
        String checkboxLocatorWithName = String.format(checkboxLocator, value);
        return driver.findElement(By.xpath(checkboxLocatorWithName)).isSelected();
    }
}
