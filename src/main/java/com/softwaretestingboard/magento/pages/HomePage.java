package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenLink = By.xpath("//span[contains(text(),'Women')]");
    By topsFromDropdown = By.xpath("//a[@id='ui-id-9']");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By menLink = By.xpath("//span[normalize-space()='Men']");
    By bottomFromDropdown = By.xpath("//a[@id='ui-id-18']");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenLink);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(topsFromDropdown);
    }

    public void clickOnJackets() {
        mouseHoverToElementAndClick(jackets);
    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menLink);
    }

    public void mouseHoverOnBottoms() {
        mouseHoverToElement(bottomFromDropdown);
    }

    public void clickOnPants() {
        mouseHoverToElementAndClick(pants);
    }

    public void mouseHOverOnGearManu() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        mouseHoverToElementAndClick(bags);
    }
}
