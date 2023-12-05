package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class JacketsPage extends Utility {

    By sortByFilter = By.xpath("(//select[@id='sorter'])[1]");

    public void sortByFilter(String filter) {
        selectByVisibleTextFromDropDown(sortByFilter, filter);
    }
}
