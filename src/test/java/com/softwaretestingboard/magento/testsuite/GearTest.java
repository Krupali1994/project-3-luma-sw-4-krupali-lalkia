package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {

        //* Mouse Hover on Gear Menu
        homePage.mouseHOverOnGearManu();

        //* Click on Bags
        homePage.clickOnBags();

        //* Click on Product Name ‘Overnight Duffle’
        bagsPage.clickOnProductNameOvernightDuffle();

        //* Verify the text ‘Overnight Duffle’
        Assert.assertEquals(bagsPage.verifyTextOvernightDuffle(), "Overnight Duffle");

        //* Change Qty 3
        bagsPage.changeQuantity();

        //* Click on ‘Add to Cart’ Button
        bagsPage.clickOnAddToCart();

        //* Verify the text ‘You added Overnight Duffle to your shopping cart’
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        String actualText = bagsPage.verifyTextProductAdded();

        //* Click on ‘shopping cart’ Link into message
        bagsPage.clickOnShoppingCartIntoMessage();

        //* Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(shoppingCartPage.verifyProductNameOvernightDuffle(), "Overnight Duffle");

        //* Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCartPage.verifyTextQuantity3(), "3");

        //* Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCartPage.verifyTextPrice135(), "$135.00");

        //* Change Qty to ‘5’
        shoppingCartPage.changeQty3To5();

        //* Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();

        //* Verify the product price ‘$225.00'
        Assert.assertEquals(shoppingCartPage.verifyUpdatedProductPrice225(), "$225.00");

    }
}
