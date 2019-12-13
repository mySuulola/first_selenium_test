package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginPage;

import java.awt.*;
import java.util.List;

public class BaseTest {
    private WebDriver driver;

    protected HomePage homePage;
//    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);
//        driver.manage().window().setSize(new Dimension(375, 812));

//        List<WebElement> linkArray = driver.findElements(By.cssSelector("#content > div > a"));

    }

    @AfterTest
    public void quitTest() {
        driver.quit();
    }

}
