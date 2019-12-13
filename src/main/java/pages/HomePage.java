package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormLink() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDown clickDropDownLink() {
        clickLink("Dropdown");
        return new DropDown(driver);
    }

    public HoversPage clickHoverPageLink() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }


}
