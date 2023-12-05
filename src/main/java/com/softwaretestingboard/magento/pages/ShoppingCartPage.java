package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By textShoppingCart = By.xpath("//span[@class='base']");
    By textCronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By textSize32 = By.xpath("//dd[contains(text(),'32')]");
    By textColourBlack = By.xpath("//dd[contains(text(),'Black')]");
    By textProductNameOvernightDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By textQuantity3 = By.xpath("//input[@title='Qty']");
    By textPrice135 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By quantity3 = By.xpath("//input[@title='Qty']");
    By updateQty = By.xpath("//input[@title='Qty']");
    By updatedProductPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");

    public String getTextShoppingCart() {
        return getTextFromElement(textShoppingCart);
    }

    public String getTextCronusYogaPant() {
        return getTextFromElement(textCronusYogaPant);
    }

    public String getTextSize32() {
        return getTextFromElement(textSize32);
    }

    public String getTextBlack() {
        return getTextFromElement(textColourBlack);
    }

    public String verifyTextPrice135() {
        return getTextFromElement(textPrice135);
    }

    public String verifyTextQuantity3() {
        return getTextFromElement(textQuantity3);
    }

    public void changeQty3To5() {
        clearQty(quantity3);
        sendTextToElement(quantity3, "5");
    }

    public String clickOnUpdateShoppingCart() {
        return getTextFromElement(updateQty);
    }

    public String verifyProductNameOvernightDuffle() {
        return getTextFromElement(textProductNameOvernightDuffle);
    }

    public String verifyUpdatedProductPrice225() {
        return getTextFromElement(updatedProductPrice);
    }

}
