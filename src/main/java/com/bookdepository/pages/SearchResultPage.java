package com.bookdepository.pages;

import com.bookdepository.core.Elem;
import org.openqa.selenium.By;

public class SearchResultPage {

    private Elem book;

    public void selectBook(String bookTitle) {
        book = new Elem(By.cssSelector(String.format("img[alt='%s']", bookTitle)));
        book.find();
        book.click();
    }
}
