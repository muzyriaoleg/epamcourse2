package com.bookdepository.pages;

import com.bookdepository.core.Elem;
import org.openqa.selenium.By;

public class BookPage {

    private Elem addToBasketButton = new Elem(By.cssSelector(".checkout-tools .btn-primary"));
    private Elem orderTototalIndicator = new Elem(By.cssSelector(".right-section .total"));
    private Elem modalWindowCloseButton = new Elem(By.cssSelector(".continue-to-basket"));
    private Elem basketBatton = new Elem(By.cssSelector(".right-section .basket-btn"));

    public void addBookToBasket() {
        addToBasketButton.click();
        modalWindowCloseButton.click();
    }

    public String getOrderTotal() {
        return orderTototalIndicator.getTextByAttribute("textContent");
    }

    public void openBasket() {
        basketBatton.click();
    }
}
