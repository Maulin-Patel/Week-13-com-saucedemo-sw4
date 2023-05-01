package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductsHomePage extends Utility {
    By productsText = By.xpath("//div[@class='header_secondary_container']/span");
    By productsNum = By.xpath("//div[@class='inventory_item']");

    public String getProductsText() {
        return getTextFromElement(productsText);
    }

    public int getProductsNum() {
        return getSizeOfElements(productsNum);
    }
}
