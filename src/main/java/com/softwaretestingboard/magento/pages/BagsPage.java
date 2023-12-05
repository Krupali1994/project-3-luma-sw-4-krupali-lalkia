package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {

    By productName = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By textOvernightDuffle = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    By changeQty = By.xpath("//input[@id='qty']");
    By addToCartBtn = By.xpath("//button[@id='product-addtocart-button']");
    By textProductAdded = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By addToCartIntoMessage = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnProductNameOvernightDuffle() {
        clickOnElement(productName);
    }

    public String verifyTextOvernightDuffle() {
        return getTextFromElement(textOvernightDuffle);
    }

    public void changeQuantity() {
        clearQty(By.xpath("//input[@id='qty']"));
        sendTextToElement(changeQty, "3");
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartBtn);
    }

    public String verifyTextProductAdded() {
        return getTextFromElement(textProductAdded);
    }

    public void clickOnShoppingCartIntoMessage() {
        clickOnElement(addToCartIntoMessage);

    }

}
