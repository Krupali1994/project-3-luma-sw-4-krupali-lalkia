package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {

        //Mouse Hover on Men Menu
        homePage.mouseHoverOnMenMenu();

        //* Mouse Hover on Bottoms
        homePage.mouseHoverOnBottoms();

        //* Click on Pants
        homePage.clickOnPants();

        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32
        pantsPage.clickOnProductName();
        pantsPage.clickOnSize32();

        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black
        pantsPage.clickOnProductName();
        pantsPage.clickOnBlackColour();

        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button
        pantsPage.clickOnProductName();
        pantsPage.clickOnAddToCartButton();

        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart’
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = pantsPage.getTextAddedPantToShoppingCart();
        Assert.assertEquals(actualText, expectedText);

        //* Click on ‘shopping cart’ Link into message
        pantsPage.clickOnShoppingCart();

        //* Verify the text ‘Shopping Cart’
        Assert.assertEquals(shoppingCartPage.getTextShoppingCart(), "Shopping Cart");

        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCartPage.getTextCronusYogaPant(), "Cronus Yoga Pant");

        //* Verify the product size ‘32’
        Assert.assertEquals(shoppingCartPage.getTextSize32(), "32");

        //* Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCartPage.getTextBlack(), "Black");

    }

}
