package com.bookdepository.pages;

import com.bookdepository.core.BrowserFactory;
import com.bookdepository.core.Constants;
import com.bookdepository.core.Elem;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class HomePage {

    private Elem searchInput = new Elem(By.cssSelector("input[name='searchTerm']"));

    public void open() {
        BrowserFactory.get(Constants.URL);
        Assertions.assertTrue(isOpened(), "Home page is not opened");
    }

    public boolean isOpened() {
        return BrowserFactory.driver().getCurrentUrl().contains(Constants.URL);
    }

    public void search(String text) {
        searchInput.find();
        searchInput.type(text);
    }
}
