package com.bookdepository.pages;

import com.bookdepository.core.Elem;
import org.openqa.selenium.By;

public class BasketPage {

    Elem checkoutButton = new Elem(By.cssSelector(".checkout-btn"));

    public void checkout() {
        checkoutButton.click();
    }
}
