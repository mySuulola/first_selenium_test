package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDown;

import static org.testng.Assert.*;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdown() {
       DropDown dropDown = homePage.clickDropDownLink();
       dropDown.selectFromDropDown("Option 1");
       String optionSelected = dropDown.getSelectedOption();
       assertEquals(optionSelected, "Option 1", "Wrong option selected");
    }
}
