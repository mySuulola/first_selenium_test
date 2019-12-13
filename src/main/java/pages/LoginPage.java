package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    By userField = By.id("username");
    By passwordField = By.id("password");
    By loginBtn = By.cssSelector("#login button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(userField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecurePage executeLogin() {
        driver.findElement(loginBtn).click();
        return new SecurePage(driver);
    }


}
