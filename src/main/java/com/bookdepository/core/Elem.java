package com.bookdepository.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elem {

    private By by;

    public Elem(By by) {
        this.by = by;
    }

    public WebElement find() {
        return BrowserFactory.getWebDriverWait(10).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click() {
        find().click();
    }

    public void type(String text) {
        find().clear();
        find().sendKeys(text);
    }

    public String getTextByAttribute(String attribute) {
        return find().getAttribute(attribute).trim();
    }
}
