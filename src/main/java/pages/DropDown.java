package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    private WebDriver driver;

    public DropDown(WebDriver driver) {
        this.driver = driver;
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(By.id("dropdown")));
    }

    public void selectFromDropDown(String option) {
        findDropDownElement().selectByVisibleText(option);
    }

    public String getSelectedOption() {
        return findDropDownElement().getFirstSelectedOption().getText();
    }





}
