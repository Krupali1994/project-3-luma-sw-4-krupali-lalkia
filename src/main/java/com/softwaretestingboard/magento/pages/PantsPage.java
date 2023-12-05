package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class PantsPage extends Utility {

    By productName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("(//div[@id='option-label-size-143-item-175'])[1]");
    By blackColour = By.xpath("//div[@id='option-label-color-93-item-49'])[1]");
    By addToCartButton = By.xpath("(//button[@title='Add to Cart'])[1]");
    By textYouAddedPants = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnProductName() {
        mouseHoverToElement(productName);
    }

    public void clickOnSize32() {
        clickOnElement(size32);
    }

    public void clickOnBlackColour() {
        mouseHoverToElementAndClick(blackColour);
    }

    public void clickOnAddToCartButton() {
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getTextAddedPantToShoppingCart() {
        return getTextFromElement(textYouAddedPants);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);

    }

}
