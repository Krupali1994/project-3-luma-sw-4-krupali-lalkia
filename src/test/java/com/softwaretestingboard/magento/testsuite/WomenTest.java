package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    JacketsPage jacketsPage = new JacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        //* Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();

        //* Mouse Hover on Tops
        homePage.mouseHoverOnTops();

        //* Click on Jackets
        homePage.clickOnJackets();

        //* Select Sort By filter “Product Name”
        jacketsPage.sortByFilter("Product Name");

        //* Verify the products name display in alphabetical order
        // Storing jackets names in list
        List<WebElement> jacketsElementsList = getListOfElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }

        // Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(By.xpath("(//select[@id='sorter'])[1]"), "Product Name");
        Thread.sleep(1000);

        // After Sorting value
        jacketsElementsList = getListOfElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }

        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);

        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);

    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {

        //* Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();

        //* Mouse Hover on Tops
        homePage.mouseHoverOnTops();

        //* Click on Jackets
        homePage.clickOnJackets();

        //* Select Sort By filter “Price”
        jacketsPage.sortByFilter("Price");

        //* Verify the products price display in Low to High
        // Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }

        // Select Sort By filter “Price”
        jacketsPage.sortByFilter("Price");
        Thread.sleep(1000);

        // After Sorting Products by Price
        jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {

            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }

        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);

        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);

    }

}
